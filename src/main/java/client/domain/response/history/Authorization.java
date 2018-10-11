
package client.domain.response.history;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Authorization {

    @JsonProperty("actor")
    private String actor;

    @JsonProperty("permission")
    private String permission;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Authorization{" +
                "actor='" + actor + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
