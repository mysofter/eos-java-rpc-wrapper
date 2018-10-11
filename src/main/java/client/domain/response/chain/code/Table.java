package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Table {

    private String name;

    private String type;

    @JsonProperty("index_type")
    private String indexType;

    @JsonProperty("key_names")
    private List<String> keyNames;

    @JsonProperty("key_types")
    private List<String> keyTypes;

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

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public List<String> getKeyNames() {
        return keyNames;
    }

    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }

    public List<String> getKeyTypes() {
        return keyTypes;
    }

    public void setKeyTypes(List<String> keyTypes) {
        this.keyTypes = keyTypes;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", indexType='" + indexType + '\'' +
                ", keyNames=" + keyNames +
                ", keyTypes=" + keyTypes +
                '}';
    }
}
