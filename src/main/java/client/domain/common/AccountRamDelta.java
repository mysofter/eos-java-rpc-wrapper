package client.domain.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountRamDelta {

    @JsonProperty("account")
    private String account;

    @JsonProperty("delta")
    private long delta;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public long getDelta() {
        return delta;
    }

    public void setDelta(long delta) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "AccountRamDelta{" +
                "account='" + account + '\'' +
                ", delta=" + delta +
                '}';
    }
}
