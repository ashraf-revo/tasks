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


class Superhero implements java.io.Serializable {
    private String name;
    private Date date;
    private int numVillainsFought;
    private short numAlterEgos;
    private boolean masked;
    private boolean female;
    private boolean retired;

    public Superhero() {
    }

    public Superhero(String name, Date date, int numVillainsFought, short numAlterEgos, boolean masked, boolean female, boolean retired) {
        this.name = name;
        this.date = date;
        this.numVillainsFought = numVillainsFought;
        this.numAlterEgos = numAlterEgos;
        this.masked = masked;
        this.female = female;
        this.retired = retired;
    }

    public String getName() {
        return name;
    }

    public Superhero setName(String name) {
        this.name = name;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Superhero setDate(Date date) {
        this.date = date;
        return this;
    }

    public int getNumVillainsFought() {
        return numVillainsFought;
    }

    public Superhero setNumVillainsFought(int numVillainsFought) {
        this.numVillainsFought = numVillainsFought;
        return this;
    }

    public short getNumAlterEgos() {
        return numAlterEgos;
    }

    public Superhero setNumAlterEgos(short numAlterEgos) {
        this.numAlterEgos = numAlterEgos;
        return this;
    }

    public boolean isMasked() {
        return masked;
    }

    public Superhero setMasked(boolean masked) {
        this.masked = masked;
        return this;
    }

    public boolean isFemale() {
        return female;
    }

    public Superhero setFemale(boolean female) {
        this.female = female;
        return this;
    }

    public boolean isRetired() {
        return retired;
    }

    public Superhero setRetired(boolean retired) {
        this.retired = retired;
        return this;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", numVillainsFought=" + numVillainsFought +
                ", numAlterEgos=" + numAlterEgos +
                ", masked=" + masked +
                ", female=" + female +
                ", retired=" + retired +
                '}';
    }
}
