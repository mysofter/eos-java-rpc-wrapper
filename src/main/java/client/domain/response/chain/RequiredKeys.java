package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequiredKeys {

    @JsonProperty("required_keys")
    private List<String> requiredKeys;

    public List<String> getRequiredKeys() {
        return requiredKeys;
    }

    public void setRequiredKeys(List<String> requiredKeys) {
        this.requiredKeys = requiredKeys;
    }

    @Override
    public String toString() {
        return "RequiredKeys{" +
                "requiredKeys=" + requiredKeys +
                '}';
    }
}
