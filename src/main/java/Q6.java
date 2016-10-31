import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by ashraf on 31/10/16.
 */
public class Q6 {
    public static void main(String[] args) {
        System.out.println(sum(1, 3));

        // if one or boot are big number
        // System.out.println(sum(1, 30000000000000000));
        // we can solve it by using BigDecimal
        System.out.println(sum(new BigDecimal("1"), new BigDecimal("200000000000000000000")));
    }

    static int sum(int x1, int x2) {
        return x1 + x2;
    }

    static BigDecimal sum(BigDecimal x1, BigDecimal x2) {
       return x1.add(x2);
    }
}
