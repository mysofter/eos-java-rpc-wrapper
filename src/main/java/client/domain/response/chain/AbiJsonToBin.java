package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbiJsonToBin {

    @JsonProperty("binargs")
    private String binargs;

    @JsonProperty("required_scope")
    private List<String> requiredScope;

    @JsonProperty("required_auth")
    private List<String> requiredAuth;

    public String getBinargs() {
        return binargs;
    }

    public void setBinargs(String binargs) {
        this.binargs = binargs;
    }

    public List<String> getRequiredScope() {
        return requiredScope;
    }

    public void setRequiredScope(List<String> requiredScope) {
        this.requiredScope = requiredScope;
    }

    public List<String> getRequiredAuth() {
        return requiredAuth;
    }

    public void setRequiredAuth(List<String> requiredAuth) {
        this.requiredAuth = requiredAuth;
    }

    @Override
    public String toString() {
        return "AbiJsonToBin{" +
                "binargs='" + binargs + '\'' +
                ", requiredScope=" + requiredScope +
                ", requiredAuth=" + requiredAuth +
                '}';
    }
}
