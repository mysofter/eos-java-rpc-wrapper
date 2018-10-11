
package client.domain.common;

import client.domain.response.history.Authorization;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Act {

    @JsonProperty("account")
    private String account;

    @JsonProperty("authorization")
    private List<Authorization> authorization = null;

    @JsonProperty("data")
    private Object data;

    @JsonProperty("hex_data")
    private String hexData;

    @JsonProperty("name")
    private String name;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public List<Authorization> getAuthorization() {
        return authorization;
    }

    public void setAuthorization(List<Authorization> authorization) {
        this.authorization = authorization;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getHexData() {
        return hexData;
    }

    public void setHexData(String hexData) {
        this.hexData = hexData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Act{" +
                "account='" + account + '\'' +
                ", authorization=" + authorization +
                ", data=" + data +
                ", hexData='" + hexData + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
