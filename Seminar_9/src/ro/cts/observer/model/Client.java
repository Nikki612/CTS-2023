package ro.cts.observer.model;

public class Client implements IClient {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String notif) {
        System.out.println("Buna, "+this.nume+"!"+notif);
    }
}
