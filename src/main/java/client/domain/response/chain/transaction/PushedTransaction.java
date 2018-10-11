package client.domain.response.chain.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PushedTransaction {

    private Processed processed;

    @JsonProperty("transaction_id")
    private String transactionId;

    public Processed getProcessed() {
        return processed;
    }

    public void setProcessed(Processed processed) {
        this.processed = processed;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "PushedTransaction{" +
                "processed=" + processed +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
