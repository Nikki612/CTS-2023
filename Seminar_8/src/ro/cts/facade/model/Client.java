package ro.cts.facade.model;

public class Client {
    private String cnp;
    private String nume;

    public Client(String cnp, String nume) {
        this.cnp = cnp;
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public String getNume() {
        return nume;
    }
}
