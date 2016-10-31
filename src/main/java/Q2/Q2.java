package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by ashraf on 31/10/16.
 */
public class Q2 {
    //    we return a list  of available values
    public static List<String> TestBunchData(List<BunchData> bunchDatas, String key) {
        Optional<BunchData> any = bunchDatas.stream().filter(bunchData -> bunchData.found(key)).findAny();
        if (any.isPresent()) {
            return any.get().get(key);
        } else {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        List<BunchData> bunchDatas = Arrays.asList(
                new BunchData(Arrays.asList("love", "adore","like")),
                new BunchData(Arrays.asList("lovejjhkj", "adoruiyuiye"))
        );

        System.out.println(TestBunchData(bunchDatas, "love"));

    }

}


