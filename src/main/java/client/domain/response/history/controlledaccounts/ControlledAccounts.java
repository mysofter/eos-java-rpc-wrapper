package client.domain.response.history.controlledaccounts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ControlledAccounts {

    @JsonProperty("controlled_accounts")
    private List<String> controlledAccounts;

    public List<String> getControlledAccounts() {
        return controlledAccounts;
    }

    public void setControlledAccounts(List<String> controlledAccounts) {
        this.controlledAccounts = controlledAccounts;
    }

}
