package client;

import client.domain.common.transaction.PackedTransaction;
import client.domain.common.transaction.SignedPackedTransaction;
import client.domain.common.transaction.TransactionAction;
import client.domain.common.transaction.TransactionAuthorization;
import client.domain.response.chain.AbiJsonToBin;
import client.domain.response.chain.Block;
import client.domain.response.chain.transaction.PushedTransaction;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EosTest {

    public static void main(String[] args) {
        EosApiRestClient eosApiRestClient = EosApiClientFactory.newInstance("http://127.0.0.1:8888").newRestClient();

        System.out.println(eosApiRestClient.getChainInfo().toString());
        /* Create the json array of arguments */
        Map<String, String> args2 = new HashMap<>(4);
        args2.put("from", "currency");
        args2.put("to", "eosio");
        args2.put("quantity", "44.0000 CUR");
        args2.put("memo", "My First Transaction");
        AbiJsonToBin data = eosApiRestClient.abiJsonToBin("currency", "transfer", args2);

        /* Get the head block */
        Block block = eosApiRestClient.getBlock(eosApiRestClient.getChainInfo().getHeadBlockId());

        /* Create Transaction Action Authorization */
        TransactionAuthorization transactionAuthorization = new TransactionAuthorization();
        transactionAuthorization.setActor("currency");
        transactionAuthorization.setPermission("active");

        /* Create Transaction Action */
        TransactionAction transactionAction = new TransactionAction();
        transactionAction.setAccount("currency");
        transactionAction.setName("transfer");
        transactionAction.setData(data.getBinargs());
        transactionAction.setAuthorization(Collections.singletonList(transactionAuthorization));

        /* Create a transaction */
        PackedTransaction packedTransaction = new PackedTransaction();
        packedTransaction.setRefBlockPrefix(block.getRefBlockPrefix().toString());
        packedTransaction.setRefBlockNum(block.getBlockNum().toString());
        packedTransaction.setExpiration("2018-05-10T18:38:19");
        packedTransaction.setRegion("0");
        packedTransaction.setMax_net_usage_words("0");
        packedTransaction.setActions(Collections.singletonList(transactionAction));

        /* Sign the Transaction */
        SignedPackedTransaction signedPackedTransaction = eosApiRestClient.signTransaction(packedTransaction, Collections.singletonList("EOS7LPJ7YnwYiEHbBLz96fNkt3kf6CDDdesV5EsWoc3u3DJy31V2y"), "chainId");

        /* Push the transaction */
        PushedTransaction pushedTransaction = eosApiRestClient.pushTransaction("none", signedPackedTransaction);

    }
}
