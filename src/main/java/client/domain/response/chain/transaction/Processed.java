package client.domain.response.chain.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import client.domain.common.ActionTrace;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Processed {

    @JsonProperty("kcpu_usage")
    private String kcpuUsage;

    @JsonProperty("action_traces")
    private List<ActionTrace> actionTraces;

    @JsonProperty("deferred_transaction_requests")
    private List<String> deferredTransactionRequests;

    @JsonProperty("cpu_usage")
    private String cpuUsage;

    @JsonProperty("status")
    private String status;

    @JsonProperty("write_locks")
    private List<Lock> writeLocks;

    @JsonProperty("region_id")
    private String regionId;

    @JsonProperty("net_usage_words")
    private String netUsageWords;

    @JsonProperty("shared_index")
    private String sharedIndex;

    @JsonProperty("id")
    private String id;

    @JsonProperty("cycle_index")
    private String cycleIndex;

    @JsonProperty("_setup_profiling_us")
    private String setupProfilingUs;

    @JsonProperty("_profiling_us")
    private String profilingUs;

    @JsonProperty("net_usage")
    private String netUsage;

    @JsonProperty("packed_trx_digest")
    private String packedTrxDigest;

    @JsonProperty("readLocks")
    private List<Lock> readLocks;

    public String getKcpuUsage() {
        return kcpuUsage;
    }

    public void setKcpuUsage(String kcpuUsage) {
        this.kcpuUsage = kcpuUsage;
    }

    public List<ActionTrace> getActionTraces() {
        return actionTraces;
    }

    public void setActionTraces(List<ActionTrace> actionTraces) {
        this.actionTraces = actionTraces;
    }

    public List<String> getDeferredTransactionRequests() {
        return deferredTransactionRequests;
    }

    public void setDeferredTransactionRequests(List<String> deferredTransactionRequests) {
        this.deferredTransactionRequests = deferredTransactionRequests;
    }

    public String getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Lock> getWriteLocks() {
        return writeLocks;
    }

    public void setWriteLocks(List<Lock> writeLocks) {
        this.writeLocks = writeLocks;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getNetUsageWords() {
        return netUsageWords;
    }

    public void setNetUsageWords(String netUsageWords) {
        this.netUsageWords = netUsageWords;
    }

    public String getSharedIndex() {
        return sharedIndex;
    }

    public void setSharedIndex(String sharedIndex) {
        this.sharedIndex = sharedIndex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCycleIndex() {
        return cycleIndex;
    }

    public void setCycleIndex(String cycleIndex) {
        this.cycleIndex = cycleIndex;
    }

    public String getSetupProfilingUs() {
        return setupProfilingUs;
    }

    public void setSetupProfilingUs(String setupProfilingUs) {
        this.setupProfilingUs = setupProfilingUs;
    }

    public String getProfilingUs() {
        return profilingUs;
    }

    public void setProfilingUs(String profilingUs) {
        this.profilingUs = profilingUs;
    }

    public String getNetUsage() {
        return netUsage;
    }

    public void setNetUsage(String netUsage) {
        this.netUsage = netUsage;
    }

    public String getPackedTrxDigest() {
        return packedTrxDigest;
    }

    public void setPackedTrxDigest(String packedTrxDigest) {
        this.packedTrxDigest = packedTrxDigest;
    }

    public List<Lock> getReadLocks() {
        return readLocks;
    }

    public void setReadLocks(List<Lock> readLocks) {
        this.readLocks = readLocks;
    }

    @Override
    public String toString() {
        return "Processed{" +
                "kcpuUsage='" + kcpuUsage + '\'' +
                ", actionTraces=" + actionTraces +
                ", deferredTransactionRequests=" + deferredTransactionRequests +
                ", cpuUsage='" + cpuUsage + '\'' +
                ", status='" + status + '\'' +
                ", writeLocks=" + writeLocks +
                ", regionId='" + regionId + '\'' +
                ", netUsageWords='" + netUsageWords + '\'' +
                ", sharedIndex='" + sharedIndex + '\'' +
                ", id='" + id + '\'' +
                ", cycleIndex='" + cycleIndex + '\'' +
                ", setupProfilingUs='" + setupProfilingUs + '\'' +
                ", profilingUs='" + profilingUs + '\'' +
                ", netUsage='" + netUsage + '\'' +
                ", packedTrxDigest='" + packedTrxDigest + '\'' +
                ", readLocks=" + readLocks +
                '}';
    }

}
