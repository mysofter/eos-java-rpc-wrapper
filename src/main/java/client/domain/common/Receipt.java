package client.domain.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Receipt {

    @JsonProperty("abi_sequence")
    private Integer abiSequence;

    @JsonProperty("act_digest")
    private String actDigest;

    @JsonProperty("auth_sequence")
    private List<List<String>> authSequence = null;

    @JsonProperty("code_sequence")
    private Integer codeSequence;

    @JsonProperty("global_sequence")
    private Integer globalSequence;

    @JsonProperty("receiver")
    private String receiver;

    @JsonProperty("recv_sequence")
    private Integer recvSequence;

    public Integer getAbiSequence() {
        return abiSequence;
    }

    public void setAbiSequence(Integer abiSequence) {
        this.abiSequence = abiSequence;
    }

    public String getActDigest() {
        return actDigest;
    }

    public void setActDigest(String actDigest) {
        this.actDigest = actDigest;
    }

    public List<List<String>> getAuthSequence() {
        return authSequence;
    }

    public void setAuthSequence(List<List<String>> authSequence) {
        this.authSequence = authSequence;
    }

    public Integer getCodeSequence() {
        return codeSequence;
    }

    public void setCodeSequence(Integer codeSequence) {
        this.codeSequence = codeSequence;
    }

    public Integer getGlobalSequence() {
        return globalSequence;
    }

    public void setGlobalSequence(Integer globalSequence) {
        this.globalSequence = globalSequence;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Integer getRecvSequence() {
        return recvSequence;
    }

    public void setRecvSequence(Integer recvSequence) {
        this.recvSequence = recvSequence;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "abiSequence=" + abiSequence +
                ", actDigest='" + actDigest + '\'' +
                ", authSequence=" + authSequence +
                ", codeSequence=" + codeSequence +
                ", globalSequence=" + globalSequence +
                ", receiver='" + receiver + '\'' +
                ", recvSequence=" + recvSequence +
                '}';
    }
}
