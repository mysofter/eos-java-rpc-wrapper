package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChainInfo {

    @JsonProperty("server_version")
    private String serverVersion;

    @JsonProperty("chain_id")
    private String chainId;

    @JsonProperty("head_block_num")
    private String headBlockNum;

    @JsonProperty("last_irreversible_block_num")
    private String lastIrreversibleBlockNum;

    @JsonProperty("last_irreversible_block_id")
    private String lastIrreversibleBlockId;

    @JsonProperty("head_block_id")
    private String headBlockId;

    @JsonProperty("head_block_time")
    private String headBlockTime;

    @JsonProperty("head_block_producer")
    private String headBlockProducer;

    @JsonProperty("virtual_block_cpu_limit")
    private String virtualBlockCpuLimit;

    @JsonProperty("virtual_block_net_limit")
    private String virtualBlockNetLimit;

    @JsonProperty("block_cpu_limit")
    private String blockCpuLimit;

    @JsonProperty("block_net_limit")
    private String blockNetLimit;

    @JsonProperty("server_version_string")
    private String serverVersionString;

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public String getHeadBlockNum() {
        return headBlockNum;
    }

    public void setHeadBlockNum(String headBlockNum) {
        this.headBlockNum = headBlockNum;
    }

    public String getLastIrreversibleBlockNum() {
        return lastIrreversibleBlockNum;
    }

    public void setLastIrreversibleBlockNum(String lastIrreversibleBlockNum) {
        this.lastIrreversibleBlockNum = lastIrreversibleBlockNum;
    }

    public String getLastIrreversibleBlockId() {
        return lastIrreversibleBlockId;
    }

    public void setLastIrreversibleBlockId(String lastIrreversibleBlockId) {
        this.lastIrreversibleBlockId = lastIrreversibleBlockId;
    }

    public String getHeadBlockId() {
        return headBlockId;
    }

    public void setHeadBlockId(String headBlockId) {
        this.headBlockId = headBlockId;
    }

    public String getHeadBlockTime() {
        return headBlockTime;
    }

    public void setHeadBlockTime(String headBlockTime) {
        this.headBlockTime = headBlockTime;
    }

    public String getHeadBlockProducer() {
        return headBlockProducer;
    }

    public void setHeadBlockProducer(String headBlockProducer) {
        this.headBlockProducer = headBlockProducer;
    }

    public String getVirtualBlockCpuLimit() {
        return virtualBlockCpuLimit;
    }

    public void setVirtualBlockCpuLimit(String virtualBlockCpuLimit) {
        this.virtualBlockCpuLimit = virtualBlockCpuLimit;
    }

    public String getVirtualBlockNetLimit() {
        return virtualBlockNetLimit;
    }

    public void setVirtualBlockNetLimit(String virtualBlockNetLimit) {
        this.virtualBlockNetLimit = virtualBlockNetLimit;
    }

    public String getBlockCpuLimit() {
        return blockCpuLimit;
    }

    public void setBlockCpuLimit(String blockCpuLimit) {
        this.blockCpuLimit = blockCpuLimit;
    }

    public String getBlockNetLimit() {
        return blockNetLimit;
    }

    public void setBlockNetLimit(String blockNetLimit) {
        this.blockNetLimit = blockNetLimit;
    }

    public String getServerVersionString() {
        return serverVersionString;
    }

    public void setServerVersionString(String serverVersionString) {
        this.serverVersionString = serverVersionString;
    }

    @Override
    public String toString() {
        return "ChainInfo{" +
                "serverVersion:\"" + serverVersion + '\"' +
                ", chainId:\"" + chainId + '\"' +
                ", headBlockNum:\"" + headBlockNum + '\"' +
                ", lastIrreversibleBlockNum:\"" + lastIrreversibleBlockNum + '\"' +
                ", lastIrreversibleBlockId:\"" + lastIrreversibleBlockId + '\"' +
                ", headBlockId:\"" + headBlockId + '\"' +
                ", headBlockTime:\"" + headBlockTime + '\"' +
                ", headBlockProducer:\"" + headBlockProducer + '\"' +
                ", virtualBlockCpuLimit:\"" + virtualBlockCpuLimit + '\"' +
                ", virtualBlockNetLimit:\"" + virtualBlockNetLimit + '\"' +
                ", blockCpuLimit:\"" + blockCpuLimit + '\"' +
                ", blockNetLimit:\"" + blockNetLimit + '\"' +
                '}';
    }
}
