
package client.domain.response.history.transaction;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Header {

    @JsonProperty("timestamp")
    private Integer timestamp;

    @JsonProperty("producer")
    private String producer;

    @JsonProperty("confirmed")
    private Integer confirmed;

    @JsonProperty("previous")
    private String previous;

    @JsonProperty("transaction_mroot")
    private String transactionMroot;

    @JsonProperty("action_mroot")
    private String actionMroot;

    @JsonProperty("schedule_version")
    private Integer scheduleVersion;

    @JsonProperty("new_producers")
    private Object newProducers;

    @JsonProperty("header_extensions")
    private List<Object> headerExtensions = null;

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getTransactionMroot() {
        return transactionMroot;
    }

    public void setTransactionMroot(String transactionMroot) {
        this.transactionMroot = transactionMroot;
    }

    public String getActionMroot() {
        return actionMroot;
    }

    public void setActionMroot(String actionMroot) {
        this.actionMroot = actionMroot;
    }

    public Integer getScheduleVersion() {
        return scheduleVersion;
    }

    public void setScheduleVersion(Integer scheduleVersion) {
        this.scheduleVersion = scheduleVersion;
    }

    public Object getNewProducers() {
        return newProducers;
    }

    public void setNewProducers(Object newProducers) {
        this.newProducers = newProducers;
    }

    public List<Object> getHeaderExtensions() {
        return headerExtensions;
    }

    public void setHeaderExtensions(List<Object> headerExtensions) {
        this.headerExtensions = headerExtensions;
    }

    @Override
    public String toString() {
        return "Header{" +
                "timestamp=" + timestamp +
                ", producer='" + producer + '\'' +
                ", confirmed=" + confirmed +
                ", previous='" + previous + '\'' +
                ", transactionMroot='" + transactionMroot + '\'' +
                ", actionMroot='" + actionMroot + '\'' +
                ", scheduleVersion=" + scheduleVersion +
                ", newProducers=" + newProducers +
                ", headerExtensions=" + headerExtensions +
                '}';
    }
}
