package client;

import client.domain.common.transaction.PackedTransaction;
import client.domain.common.transaction.SignedPackedTransaction;
import client.domain.common.transaction.TransactionAction;
import client.domain.common.transaction.TransactionAuthorization;
import client.domain.response.chain.AbiJsonToBin;
import client.domain.response.chain.Block;
import client.domain.response.chain.transaction.PushedTransaction;
import client.domain.response.history.action.Actions;
import client.domain.response.history.controlledaccounts.ControlledAccounts;
import client.domain.response.history.keyaccounts.KeyAccounts;
import client.domain.response.history.transaction.Transaction;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EosTest {

    public static void main(String[] args) {
        EosApiRestClient eosApiRestClient = EosApiClientFactory.newInstance("http://127.0.0.1:8888").newRestClient();

        /**++++++++++++++++++++++++++++++++++CHAIN_API++++++++++++++++++++++++++++++++++++++*/
//        查看区块链信息
//        System.out.println(eosApiRestClient.getChainInfo().toString());

//         Get the head block
//        Block block = eosApiRestClient.getBlock(eosApiRestClient.getChainInfo().getHeadBlockId());
//        System.out.println(block.toString());

//        查看账户信息
//        System.out.println(eosApiRestClient.getAccount("eosio").toString());

        /**++++++++++++++++++++++++++++++++++CHAIN_API++++++++++++++++++++++++++++++++++++++*/

        /**++++++++++++++++++++++++++++++++++HISTORY_API++++++++++++++++++++++++++++++++++++++*/

//        Actions actions= eosApiRestClient.getActions("eosio",0,10);
//        System.out.println(actions.getActions().size());

//        查询交易
//        Transaction transaction = eosApiRestClient.getTransaction("059ae3a5d5597881d12521536020c797269cfc3cfe4ccb949f752c25af9bbf6a");
//        System.out.println(transaction.toString());

//        根据公钥查询账户
//        KeyAccounts keyAccounts = eosApiRestClient.getKeyAccounts("EOS8QhiaUmkKZWycFmyghR7RFkUefcK1G7N8RXxwUW8yM7XrxX6te");
//        System.out.println(keyAccounts.getAccountNames().size()+":::"+keyAccounts.getAccountNames().get(0));

//        查询控制的账户信息
//        ControlledAccounts controlledAccounts = eosApiRestClient.getControlledAccounts("eosio");
//        System.out.println(controlledAccounts.getControlledAccounts().size()+"::::::");

        /**++++++++++++++++++++++++++++++++++HISTORY_API++++++++++++++++++++++++++++++++++++++*/

        /**++++++++++++++++++++++++++++++++++WALLET_API++++++++++++++++++++++++++++++++++++++*/
//        eosApiRestClient.openWallet("default");
        eosApiRestClient.lockWallet("default");
        /**++++++++++++++++++++++++++++++++++WALLET_API++++++++++++++++++++++++++++++++++++++*/

    }
}
