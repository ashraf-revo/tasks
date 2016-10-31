import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * Created by ashraf on 31/10/16.
 * Given two long lists of integers, A and B, use whatever tool/program you like to list out:
 * All elements present in ​ both ​ lists (elements must be present in list A ​ and ​ list B)
 * All elements present in exactly one list, but not the other (“in A but not in B” as well as
 * “in B but not in A”)
 * All elements present in any list, but discarding duplicates
 */
public class Q7 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 5);
        List<Integer> l2 = Arrays.asList(1, 2);
        System.out.println(j1(l1, l2));
        System.out.println(j2(l1, l2));
        System.out.println(j3(l1, l2));
    }

    //    All elements present in ​ both ​ lists (elements must be present in list A ​ and ​ list B)
    static List<Integer> j1(List<Integer> l1, List<Integer> l2) {
        Set<Integer> collect1 = l1.stream().collect(toSet());
        Set<Integer> collect2 = l2.stream().collect(toSet());
        Set<Integer> max = collect1.size() > collect2.size() ? collect1 : collect2;
        Set<Integer> min = collect2.size() > collect1.size() ? collect1 : collect2;
        List<Integer> result = new ArrayList<>();
        max.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (min.contains(integer)) result.add(integer);
            }
        });

        return result;
    }

    // All elements present in exactly one list, but not the other (“in A but not in B” as well as “in B but not in A”)
    static List<Integer> j2(List<Integer> l1, List<Integer> l2) {
        Set<Integer> collect1 = l1.stream().collect(toSet());
        Set<Integer> collect2 = l2.stream().collect(toSet());
        Set<Integer> max = collect1.size() > collect2.size() ? collect1 : collect2;
        Set<Integer> min = collect2.size() > collect1.size() ? collect1 : collect2;
        List<Integer> result = new ArrayList<>();
        max.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (!min.contains(integer)) result.add(integer);
            }
        });

        return result;
    }

    //    All elements present in any list, but discarding duplicates
    static List<Integer> j3(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();
        result.addAll(l1);
        result.addAll(l2);

        return result.stream().collect(toSet()).stream().collect(toList());
    }
}
