package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import client.domain.response.chain.block.NewProducers;
import client.domain.response.history.transaction.Transaction;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Block {

    @JsonProperty("timestamp")
    private String timeStamp;

    @JsonProperty("producer")
    private String producer;

    @JsonProperty("confirmed")
    private Boolean confirmed;

    @JsonProperty("previous")
    private String previous;

    @JsonProperty("transaction_mroot")
    private String transactionMerkleRoot;

    @JsonProperty("action_mroot")
    private String actionMerkleRoot;

    @JsonProperty("schedule_version")
    private String scheduleVersion;

    @JsonProperty("new_producers")
    private NewProducers newProducers;

    @JsonProperty("header_extensions")
    private String[] headerExtensions;

    @JsonProperty("producer_signature")
    private String producerSignature;

    @JsonProperty("transactions")
    private Transaction[] transactions;

    @JsonProperty("block_extensions")
    private String[] blockExtensions;

    @JsonProperty("id")
    private String id;

    @JsonProperty("block_num")
    private Long blockNum;

    @JsonProperty("ref_block_prefix")
    private Long refBlockPrefix;

    @JsonProperty("block_mroot")
    private String blockMerkleRoot;


    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getTransactionMerkleRoot() {
        return transactionMerkleRoot;
    }

    public void setTransactionMerkleRoot(String transactionMerkleRoot) {
        this.transactionMerkleRoot = transactionMerkleRoot;
    }

    public String getActionMerkleRoot() {
        return actionMerkleRoot;
    }

    public void setActionMerkleRoot(String actionMerkleRoot) {
        this.actionMerkleRoot = actionMerkleRoot;
    }

    public String getScheduleVersion() {
        return scheduleVersion;
    }

    public void setScheduleVersion(String scheduleVersion) {
        this.scheduleVersion = scheduleVersion;
    }

    public NewProducers getNewProducers() {
        return newProducers;
    }

    public void setNewProducers(NewProducers newProducers) {
        this.newProducers = newProducers;
    }

    public String[] getHeaderExtensions() {
        return headerExtensions;
    }

    public void setHeaderExtensions(String[] headerExtensions) {
        this.headerExtensions = headerExtensions;
    }

    public String getProducerSignature() {
        return producerSignature;
    }

    public void setProducerSignature(String producerSignature) {
        this.producerSignature = producerSignature;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public String[] getBlockExtensions() {
        return blockExtensions;
    }

    public void setBlockExtensions(String[] blockExtensions) {
        this.blockExtensions = blockExtensions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(Long blockNum) {
        this.blockNum = blockNum;
    }

    public Long getRefBlockPrefix() {
        return refBlockPrefix;
    }

    public void setRefBlockPrefix(Long refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public String getBlockMerkleRoot() {
        return blockMerkleRoot;
    }

    public void setBlockMerkleRoot(String blockMerkleRoot) {
        this.blockMerkleRoot = blockMerkleRoot;
    }

    @Override
    public String toString() {
        return "Block{" +
                "timeStamp='" + timeStamp + '\'' +
                ", producer='" + producer + '\'' +
                ", confirmed=" + confirmed +
                ", previous='" + previous + '\'' +
                ", transactionMerkleRoot='" + transactionMerkleRoot + '\'' +
                ", actionMerkleRoot='" + actionMerkleRoot + '\'' +
                ", scheduleVersion='" + scheduleVersion + '\'' +
                ", newProducers=" + newProducers +
                ", headerExtensions=" + Arrays.toString(headerExtensions) +
                ", producerSignature='" + producerSignature + '\'' +
                ", transactions=" + Arrays.toString(transactions) +
                ", blockExtensions=" + Arrays.toString(blockExtensions) +
                ", id='" + id + '\'' +
                ", blockNum=" + blockNum +
                ", refBlockPrefix=" + refBlockPrefix +
                ", blockMerkleRoot='" + blockMerkleRoot + '\'' +
                '}';
    }
}
