package client.domain.response.chain.currencystats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyStats {

    @JsonProperty("supply")
    private String supply;

    @JsonProperty("max_supply")
    private String maxSupply;

    @JsonProperty("issuer")
    private String issuer;

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public String getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(String maxSupply) {
        this.maxSupply = maxSupply;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public String toString() {
        return "CurrencyStats{" +
                "supply='" + supply + '\'' +
                ", maxSupply='" + maxSupply + '\'' +
                ", issuer='" + issuer + '\'' +
                '}';
    }
}
