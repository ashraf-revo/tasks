import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by ashraf on 31/10/16.
 * Write an algorithm to find the mean (average) of an extremely large list of numbers. The list
 * could contain trillions or quadrillions of numbers, but each number is (relatively) manageable,
 * e.g., in the hundreds, thousands or millions
 */
public class Q8 {
    public static void main(String[] args) {
        int[] n = {2, 2};
        System.out.println(mean1(n));
        System.out.println(mean2(n));
    }

    static long mean1(int[] ints) {
        IntStream stream = Arrays.stream(ints);
        IntSummaryStatistics intSummaryStatistics = stream.summaryStatistics();
        return intSummaryStatistics.getSum() / intSummaryStatistics.getCount();
    }

    static long mean2(int[] ints) {
        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }
        return sum / ints.length;
    }
}
