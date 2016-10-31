package Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ashraf on 31/10/16.
 */
public class BunchData {
    private List<String> data = new ArrayList<>();

    public BunchData() {
    }

    public BunchData(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    public BunchData setData(List<String> data) {
        this.data = data;
        return this;
    }

    public boolean found(String key) {
        return data.stream().anyMatch(s -> s.equalsIgnoreCase(key));
    }

    public List<String> get(String key) {
        if (found(key)) {
            return data.stream().filter(s -> !s.equalsIgnoreCase(key)).collect(Collectors.toList());
        } else return new ArrayList<>();

    }
}
