import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ashraf on 31/10/16.
 * How would you determine if one string is an anagram of another (ignoring whitespace, case
 * and punctuation)? For example, “A man’s rag” and “anagrams” are anagrams.
 */
public class Q9 {
    public static void main(String[] args) {

        System.out.println(test("a1", "1a "));

    }

    public static boolean test(String s1, String s2) {
        s1 = s1.trim().replace(" ", "").replace("\n", "").toLowerCase();
        s2 = s2.trim().replace(" ", "").replace("\n", "").toLowerCase();

        List<Integer> sorted1 = Arrays.stream(s1.chars().toArray()).boxed().sorted().collect(Collectors.toList());
        List<Integer> sorted2 = Arrays.stream(s2.chars().toArray()).boxed().sorted().collect(Collectors.toList());
        if (sorted1.size() != sorted2.size()) return false;
        Set<Integer> collect1 = sorted1.stream().collect(Collectors.toSet());
        Set<Integer> collect2 = sorted2.stream().collect(Collectors.toSet());

        return collect1.equals(collect2);
    }

}
