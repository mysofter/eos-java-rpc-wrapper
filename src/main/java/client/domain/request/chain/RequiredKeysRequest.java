package client.domain.request.chain;

import client.domain.common.transaction.PackedTransaction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequiredKeysRequest {

    private PackedTransaction transaction;

    @JsonProperty("available_keys")
    private List<String> availableKeys;

    public RequiredKeysRequest(PackedTransaction transaction, List<String> availableKeys) {
        this.transaction = transaction;
        this.availableKeys = availableKeys;
    }

    public PackedTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(PackedTransaction transaction) {
        this.transaction = transaction;
    }

    public List<String> getAvailableKeys() {
        return availableKeys;
    }

    public void setAvailableKeys(List<String> availableKeys) {
        this.availableKeys = availableKeys;
    }
}
