package client.domain.response.history.action;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Actions {

    @JsonProperty("actions")
    private List<Action> actions;

    @JsonProperty("last_irreversible_block")
    private Integer lastIrreversibleBlock;

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Integer getLastIrreversibleBlock() {
        return lastIrreversibleBlock;
    }

    public void setLastIrreversibleBlock(Integer lastIrreversibleBlock) {
        this.lastIrreversibleBlock = lastIrreversibleBlock;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "actions=" + actions +
                ", lastIrreversibleBlock=" + lastIrreversibleBlock +
                '}';
    }
}
