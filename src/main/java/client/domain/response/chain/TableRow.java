package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TableRow {

    private List<Map<String, ?>> rows;

    private Boolean more;

    public List<Map<String, ?>> getRows() {
        return rows;
    }

    public void setRows(List<Map<String, ?>> rows) {
        this.rows = rows;
    }

    public Boolean getMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }

    @Override
    public String toString() {
        return "TableRow{" +
                "rows=" + rows +
                ", more=" + more +
                '}';
    }
}
