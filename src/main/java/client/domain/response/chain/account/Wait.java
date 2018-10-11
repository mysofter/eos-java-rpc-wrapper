package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wait {

    @JsonProperty("weight_sec")
    private Integer waitSec;

    private Integer weight;

    public Integer getWaitSec() {
        return waitSec;
    }

    public void setWaitSec(Integer waitSec) {
        this.waitSec = waitSec;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Wait{" +
                "waitSec=" + waitSec +
                ", weight=" + weight +
                '}';
    }
}
