package client.domain.response.chain.account;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    @JsonProperty("account_name")
    private String accountName;

    @JsonProperty("eos_balance")
    private String eosBalance;

    @JsonProperty("staked_balance")
    private String stakedBalance;

    @JsonProperty("unstaking_balance")
    private String unstakingBalance;

    @JsonProperty("last_unstaking_time")
    private String lastUnstakingTime;

    @JsonProperty("permissions")
    private List<Permission> permissions;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEosBalance() {
        return eosBalance;
    }

    public void setEosBalance(String eosBalance) {
        this.eosBalance = eosBalance;
    }

    public String getStakedBalance() {
        return stakedBalance;
    }

    public void setStakedBalance(String stakedBalance) {
        this.stakedBalance = stakedBalance;
    }

    public String getUnstakingBalance() {
        return unstakingBalance;
    }

    public void setUnstakingBalance(String unstakingBalance) {
        this.unstakingBalance = unstakingBalance;
    }

    public String getLastUnstakingTime() {
        return lastUnstakingTime;
    }

    public void setLastUnstakingTime(String lastUnstakingTime) {
        this.lastUnstakingTime = lastUnstakingTime;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", eosBalance='" + eosBalance + '\'' +
                ", stakedBalance='" + stakedBalance + '\'' +
                ", unstakingBalance='" + unstakingBalance + '\'' +
                ", lastUnstakingTime='" + lastUnstakingTime + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
