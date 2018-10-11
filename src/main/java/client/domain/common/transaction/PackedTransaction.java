package client.domain.common.transaction;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PackedTransaction {

    @JsonProperty("region")
    private String region;

    @JsonProperty("max_net_usage_words")
    private String maxNetUsageWords;

    @JsonProperty("expiration")
    private String expiration;

    @JsonProperty("ref_block_prefix")
    private String refBlockPrefix;

    @JsonProperty("ref_block_num")
    private String refBlockNum;

    @JsonProperty("max_cpu_usage_ms")
    private Integer maxCpuUsageMs;

    @JsonProperty("context_free_data")
    private List<String> contextFreeData;

    @JsonProperty("transaction_extensions")
    private List<String> transactionExtensions;

    @JsonProperty("context_free_actions")
    private List<TransactionAction> contextFreeActions;

    @JsonProperty("actions")
    private List<TransactionAction> actions;

    @JsonProperty("delay_sec")
    private Integer delaySec;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMaxNetUsageWords() {
        return maxNetUsageWords;
    }

    public void setMaxNetUsageWords(String maxNetUsageWords) {
        this.maxNetUsageWords = maxNetUsageWords;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getRefBlockPrefix() {
        return refBlockPrefix;
    }

    public void setRefBlockPrefix(String refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public String getRefBlockNum() {
        return refBlockNum;
    }

    public void setRefBlockNum(String refBlockNum) {
        this.refBlockNum = refBlockNum;
    }

    public Integer getMaxCpuUsageMs() {
        return maxCpuUsageMs;
    }

    public void setMaxCpuUsageMs(Integer maxCpuUsageMs) {
        this.maxCpuUsageMs = maxCpuUsageMs;
    }

    public List<String> getContextFreeData() {
        return contextFreeData;
    }

    public void setContextFreeData(List<String> contextFreeData) {
        this.contextFreeData = contextFreeData;
    }

    public List<String> getTransactionExtensions() {
        return transactionExtensions;
    }

    public void setTransactionExtensions(List<String> transactionExtensions) {
        this.transactionExtensions = transactionExtensions;
    }

    public List<TransactionAction> getContextFreeActions() {
        return contextFreeActions;
    }

    public void setContextFreeActions(List<TransactionAction> contextFreeActions) {
        this.contextFreeActions = contextFreeActions;
    }

    public List<TransactionAction> getActions() {
        return actions;
    }

    public void setActions(List<TransactionAction> actions) {
        this.actions = actions;
    }

    public Integer getDelaySec() {
        return delaySec;
    }

    public void setDelaySec(Integer delaySec) {
        this.delaySec = delaySec;
    }

    @Override
    public String toString() {
        return "PackedTransaction{" +
                "region='" + region + '\'' +
                ", maxNetUsageWords='" + maxNetUsageWords + '\'' +
                ", expiration='" + expiration + '\'' +
                ", refBlockPrefix='" + refBlockPrefix + '\'' +
                ", refBlockNum='" + refBlockNum + '\'' +
                ", maxCpuUsageMs=" + maxCpuUsageMs +
                ", contextFreeData=" + contextFreeData +
                ", transactionExtensions=" + transactionExtensions +
                ", contextFreeActions=" + contextFreeActions +
                ", actions=" + actions +
                ", delaySec=" + delaySec +
                '}';
    }

}
