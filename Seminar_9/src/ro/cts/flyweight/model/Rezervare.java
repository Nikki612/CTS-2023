package ro.cts.flyweight.model;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private String data;

    public Rezervare(int nrMasa, int nrPersoane, String data) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.data = data;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getData() {
        return data;
    }
}
