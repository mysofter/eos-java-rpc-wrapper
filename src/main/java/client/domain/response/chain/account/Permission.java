package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Permission {

    @JsonProperty("name")
    private String name;

    @JsonProperty("parent")
    private String parent;

    @JsonProperty("perm_name")
    private String permName;

    @JsonProperty("required_auth")
    private RequiredAuth requiredAuth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public RequiredAuth getRequiredAuth() {
        return requiredAuth;
    }

    public void setRequiredAuth(RequiredAuth requiredAuth) {
        this.requiredAuth = requiredAuth;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "name='" + name + '\'' +
                ", parent='" + parent + '\'' +
                ", permName='" + permName + '\'' +
                ", requiredAuth=" + requiredAuth +
                '}';
    }
}
