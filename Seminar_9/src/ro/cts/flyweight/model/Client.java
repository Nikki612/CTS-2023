package ro.cts.flyweight.model;

public class Client implements IClient{

    private String nume;
    private String nrTelefon;
    private String email;

    public Client(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public void afiseazaDetaliiRezervare(Rezervare rezervare) {
        System.out.println("Clientul cu numele: "+this.nume+" nr.Tel: "+this.nrTelefon+" email: "+this.email+
        " a rezervat masa: "+rezervare.getNrMasa()+" pentru: "+rezervare.getNrPersoane()+" persoane de la ora: "+rezervare.getData());
    }
}
