package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequiredAuth {

    @JsonProperty("accounts")
    private List<SimpleAccount> accounts;

    @JsonProperty("keys")
    private List<Key> keys;

    @JsonProperty("threshold")
    private String threshold;

    @JsonProperty("waits")
    private List<Wait> waits;

    public List<SimpleAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<SimpleAccount> accounts) {
        this.accounts = accounts;
    }

    public List<Key> getKeys() {
        return keys;
    }

    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public List<Wait> getWaits() {
        return waits;
    }

    public void setWaits(List<Wait> waits) {
        this.waits = waits;
    }

    @Override
    public String toString() {
        return "RequiredAuth{" +
                "accounts=" + accounts +
                ", keys=" + keys +
                ", threshold='" + threshold + '\'' +
                ", waits=" + waits +
                '}';
    }
}
