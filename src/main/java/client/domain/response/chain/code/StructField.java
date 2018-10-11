package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StructField {

    @JsonProperty("ricardian_contract")
    private String ricardianContract;

    private String name;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRicardianContract() {
        return ricardianContract;
    }

    public void setRicardianContract(String ricardianContract) {
        this.ricardianContract = ricardianContract;
    }

    @Override
    public String toString() {
        return "StructField{" +
                "ricardianContract='" + ricardianContract + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
