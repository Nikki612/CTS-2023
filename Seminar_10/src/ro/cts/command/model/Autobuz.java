package ro.cts.command.model;

public class Autobuz implements IAutomobil{

    private int numar;

    public Autobuz(int numar) {
        this.numar = numar;
    }

    @Override
    public void plecareCursa(int nrLinie) {
        System.out.println("Autobuzul cu numarul "+numar+" a plecat pe linia "+nrLinie);
    }
}
