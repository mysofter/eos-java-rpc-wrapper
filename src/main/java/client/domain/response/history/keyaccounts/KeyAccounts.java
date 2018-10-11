package client.domain.response.history.keyaccounts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyAccounts {

    @JsonProperty("account_names")
    private List<String> accountNames;

    public List<String> getAccountNames() {
        return accountNames;
    }

    public void setAccountNames(List<String> accountNames) {
        this.accountNames = accountNames;
    }

    @Override
    public String toString() {
        return "KeyAccounts{" +
                "accountNames=" + accountNames +
                '}';
    }
}
