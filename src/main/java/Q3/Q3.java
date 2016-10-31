package Q3;

/**
 * Created by ashraf on 31/10/16.
 */
public class Q3 {
    public static void main(String[] args) {
        System.out.println(IsPowerOfTwo_1(4));
        System.out.println(IsPowerOfTwo_2(4));
    }

    private static boolean IsPowerOfTwo_1(long number) {
        if (number == 0)
            return false;

        for (long power = 1; power > 0; power = power << 1) {
            if (power == number)
                return true;
            if (power > number)
                return false;
        }
        return false;
    }

    private static boolean IsPowerOfTwo_2(long x) {
        return (x != 0) && ((x & (x - 1)) == 0);

    }
}
