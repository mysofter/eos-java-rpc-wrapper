
package client.domain.response.history.action;

import client.domain.common.ActionTrace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Action {

    @JsonProperty("account_action_seq")
    private Integer accountActionSeq;

    @JsonProperty("action_trace")
    private ActionTrace actionTrace;

    @JsonProperty("block_num")
    private Integer blockNum;

    @JsonProperty("block_time")
    private String blockTime;

    @JsonProperty("global_action_seq")
    private Integer globalActionSeq;

    public Integer getAccountActionSeq() {
        return accountActionSeq;
    }

    public void setAccountActionSeq(Integer accountActionSeq) {
        this.accountActionSeq = accountActionSeq;
    }

    public ActionTrace getActionTrace() {
        return actionTrace;
    }

    public void setActionTrace(ActionTrace actionTrace) {
        this.actionTrace = actionTrace;
    }

    public Integer getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

    public String getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public Integer getGlobalActionSeq() {
        return globalActionSeq;
    }

    public void setGlobalActionSeq(Integer globalActionSeq) {
        this.globalActionSeq = globalActionSeq;
    }

    @Override
    public String toString() {
        return "Action{" +
                "accountActionSeq=" + accountActionSeq +
                ", actionTrace=" + actionTrace +
                ", blockNum=" + blockNum +
                ", blockTime='" + blockTime + '\'' +
                ", globalActionSeq=" + globalActionSeq +
                '}';
    }
}
