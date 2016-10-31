package Q10;

import java.util.Date;


public class Superhero implements java.io.Serializable {
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
