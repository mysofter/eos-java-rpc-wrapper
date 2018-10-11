package client.domain.response.chain.block;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewProducers {
	/*
	  # cleos -u http://mainnet.genereos.io get block 13981050
	  ......
	  "new_producers": {
	    "version": 308,
	    "producers": [{
	        "producer_name": "argentinaeos",
	        "block_signing_key": "EOS7jq4FHrFrtCXxpRQ39dBeDMa5AjM4VaRbqBECkSa5aZnizJzrx"
	      },{
	        "producer_name": "bitfinexeos1",
	        "block_signing_key": "EOS4tkw7LgtURT3dvG3kQ4D1sg3aAtPDymmoatpuFkQMc7wzZdKxc"
	      }, ......
	      ......
	
	*/

    @JsonProperty("version")
    private int version;

    @JsonProperty("producers")
    private Producer[] producers;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Producer[] getProducers() {
        return producers;
    }

    public void setProducers(Producer[] producers) {
        this.producers = producers;
    }

    @Override
    public String toString() {
        return "NewProducers{" +
                "version=" + version +
                ", producers=" + Arrays.toString(producers) +
                '}';
    }
}
