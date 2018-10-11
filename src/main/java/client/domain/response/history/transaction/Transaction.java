package client.domain.response.history.transaction;

import java.util.List;

import client.domain.common.ActionTrace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {

    @JsonProperty("id")
    private String id;

    @JsonProperty("trx")
    private Object trx;

    @JsonProperty("block_time")
    private String blockTime;

    @JsonProperty("block_num")
    private Integer blockNum;

    @JsonProperty("last_irreversible_block")
    private Integer lastIrreversibleBlock;

    @JsonProperty("traces")
    private List<ActionTrace> traces = null;

    private String status;

    @JsonProperty("cpu_usage_us")
    private String cpuUsageUs;

    @JsonProperty("net_usage_words")
    private String netUsageWords;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getTrx() {
        return trx;
    }

    public void setTrx(Object trx) {
        this.trx = trx;
    }

    public String getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public Integer getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

    public Integer getLastIrreversibleBlock() {
        return lastIrreversibleBlock;
    }

    public void setLastIrreversibleBlock(Integer lastIrreversibleBlock) {
        this.lastIrreversibleBlock = lastIrreversibleBlock;
    }

    public List<ActionTrace> getTraces() {
        return traces;
    }

    public void setTraces(List<ActionTrace> traces) {
        this.traces = traces;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCpuUsageUs() {
        return cpuUsageUs;
    }

    public void setCpuUsageUs(String cpuUsageUs) {
        this.cpuUsageUs = cpuUsageUs;
    }

    public String getNetUsageWords() {
        return netUsageWords;
    }

    public void setNetUsageWords(String netUsageWords) {
        this.netUsageWords = netUsageWords;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", trx=" + trx +
                ", blockTime='" + blockTime + '\'' +
                ", blockNum=" + blockNum +
                ", lastIrreversibleBlock=" + lastIrreversibleBlock +
                ", traces=" + traces +
                ", status='" + status + '\'' +
                ", cpuUsageUs='" + cpuUsageUs + '\'' +
                ", netUsageWords='" + netUsageWords + '\'' +
                '}';
    }
}
