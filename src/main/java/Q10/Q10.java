package Q10;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by ashraf on 31/10/16.
 * Given a class like the one below, suggest some ways to store thousands of instances of it on
 * disk. Augment the class with whatever you need.
 */
public class Q10 {
    public static void main(String[] args) throws ClassNotFoundException {
        List<Superhero> superheros = Arrays.asList(new Superhero("iiiii", new Date(), 1, (short) 1, true, true, true));
        serialize(superheros);
        deserialize().forEach(v -> System.out.println(v));
    }

    static void serialize(List<Superhero> superheros) {
        try {
            FileOutputStream fileOut = new FileOutputStream("Crunchify_Test1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(superheros);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static List<Superhero> deserialize() {
        try {
            List<Superhero> superheros;
            FileInputStream fileIn = new FileInputStream("Crunchify_Test1.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            superheros = (List<Superhero>) in.readObject();
            in.close();
            fileIn.close();
            return superheros;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
