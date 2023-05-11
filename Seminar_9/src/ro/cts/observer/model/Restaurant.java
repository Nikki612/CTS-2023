package ro.cts.observer.model;

import ro.cts.flyweight.model.Client;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{

    private List<IClient> listaClienti;
    private String nume;

    public Restaurant(String nume) {
        this.listaClienti = new ArrayList<>();
        this.nume=nume;
    }

    @Override
    public void abonareClient(IClient client) {
        listaClienti.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        listaClienti.remove(client);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IClient c:listaClienti){
            c.primesteNotificare("Restaurantul "+this.nume+" iti trimite notificarea: "+mesaj);
        }
    }

    public void afiseazaMeniul()
    {
        trimiteNotificare("Am adaugat un meniu nou!");
    }

    public void adaugareDiscount(int discount)
    {
        trimiteNotificare("Hei!Avem un discount de "+discount+ "% pentru tine!");
    }
}
