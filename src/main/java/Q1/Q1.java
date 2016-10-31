package Q1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

/**
 * Created by ashraf on 31/10/16.
 */
public class Q1 {
    public static void main(String[] args) throws IOException {
        String query = "name";
        Optional<Person> first = Files.lines(Paths.get("file.text")).map(s -> {
            String[] split = s.split("\\|");
            return new Person(split[0], split[1]);
        }).filter(person -> person.getName().equals(query)).findFirst();
        first.ifPresent(System.out::println);
    }
}

