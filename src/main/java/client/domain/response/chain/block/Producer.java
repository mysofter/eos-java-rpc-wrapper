package client.domain.response.chain.block;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Producer {
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

	@JsonProperty("producer_name")
    private String producerName;

    @JsonProperty("block_signing_key")
    private String blockSigningKey;

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getBlockSigningKey() {
        return blockSigningKey;
    }

    public void setBlockSigningKey(String blockSigningKey) {
        this.blockSigningKey = blockSigningKey;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "producerName='" + producerName + '\'' +
                ", blockSigningKey='" + blockSigningKey + '\'' +
                '}';
    }
}
