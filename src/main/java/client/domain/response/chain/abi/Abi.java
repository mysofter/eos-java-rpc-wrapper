package client.domain.response.chain.abi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Abi {

    @JsonProperty("account_name")
    private String accountName;

    private client.domain.response.chain.code.Abi abi;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public client.domain.response.chain.code.Abi getAbi() {
        return abi;
    }

    public void setAbi(client.domain.response.chain.code.Abi abi) {
        this.abi = abi;
    }

    @Override
    public String toString() {
        return "Abi{" +
                "accountName='" + accountName + '\'' +
                ", abi=" + abi +
                '}';
    }

}
