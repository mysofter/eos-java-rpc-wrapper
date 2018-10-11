package client.domain.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionTrace {

    @JsonProperty("act")
    private Act act;

    @JsonProperty("console")
    private String console;

    @JsonProperty("cpu_usage")
    private Integer cpuUsage;

    @JsonProperty("elapsed")
    private Integer elapsed;

    @JsonProperty("inline_traces")
    private List<Object> inlineTraces = null;

    @JsonProperty("receipt")
    private Receipt receipt;

    @JsonProperty("total_cpu_usage")
    private Integer totalCpuUsage;

    @JsonProperty("trx_id")
    private String trxId;

    @JsonProperty("context_free")
    private boolean contextFree;

    @JsonProperty("block_num")
    private long blockNum;

    @JsonProperty("block_time")
    private String blockTime;

    @JsonProperty("producer_block_id")
    private String producerBlockId;

    @JsonProperty("account_ram_deltas")
    private List<AccountRamDelta> accountRamDeltas;

    @JsonProperty("trx_status")
    private String trxStatus;

    @JsonProperty("createdAt")
    private String createdAt;


    public Act getAct() {
        return act;
    }

    public void setAct(Act act) {
        this.act = act;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public Integer getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Integer cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public Integer getElapsed() {
        return elapsed;
    }

    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    public List<Object> getInlineTraces() {
        return inlineTraces;
    }

    public void setInlineTraces(List<Object> inlineTraces) {
        this.inlineTraces = inlineTraces;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Integer getTotalCpuUsage() {
        return totalCpuUsage;
    }

    public void setTotalCpuUsage(Integer totalCpuUsage) {
        this.totalCpuUsage = totalCpuUsage;
    }

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public boolean isContextFree() {
        return contextFree;
    }

    public void setContextFree(boolean contextFree) {
        this.contextFree = contextFree;
    }

    public long getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(long blockNum) {
        this.blockNum = blockNum;
    }

    public String getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public String getProducerBlockId() {
        return producerBlockId;
    }

    public void setProducerBlockId(String producerBlockId) {
        this.producerBlockId = producerBlockId;
    }

    public List<AccountRamDelta> getAccountRamDeltas() {
        return accountRamDeltas;
    }

    public void setAccountRamDeltas(List<AccountRamDelta> accountRamDeltas) {
        this.accountRamDeltas = accountRamDeltas;
    }

    public String getTrxStatus() {
        return trxStatus;
    }

    public void setTrxStatus(String trxStatus) {
        this.trxStatus = trxStatus;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ActionTrace{" +
                "act=" + act +
                ", console='" + console + '\'' +
                ", cpuUsage=" + cpuUsage +
                ", elapsed=" + elapsed +
                ", inlineTraces=" + inlineTraces +
                ", receipt=" + receipt +
                ", totalCpuUsage=" + totalCpuUsage +
                ", trxId='" + trxId + '\'' +
                ", contextFree=" + contextFree +
                ", blockNum=" + blockNum +
                ", blockTime='" + blockTime + '\'' +
                ", producerBlockId='" + producerBlockId + '\'' +
                ", accountRamDeltas=" + accountRamDeltas +
                ", trxStatus='" + trxStatus + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
