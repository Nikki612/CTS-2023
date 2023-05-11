package ro.cts.flyweight.main;

import ro.cts.flyweight.model.BazaDeDateClienti;
import ro.cts.flyweight.model.Client;
import ro.cts.flyweight.model.IClient;
import ro.cts.flyweight.model.Rezervare;

public class Main {
    public static void main(String[] args)
    {
        BazaDeDateClienti bazaDeDateClienti=new BazaDeDateClienti();
        Rezervare rezervare1=new Rezervare(1,2,"10:00");
        Rezervare rezervare2=new Rezervare(2,3,"12:00");
        Rezervare rezervare3=new Rezervare(3,5,"17:00");
        IClient client=bazaDeDateClienti.getClient("Ana","0737007363","ana@gmail.com");
        client.afiseazaDetaliiRezervare(rezervare1);
        bazaDeDateClienti.getClient("Maria","0743434356","maria@mail.com").afiseazaDetaliiRezervare(rezervare2);
        bazaDeDateClienti.getClient("","0743434356",null).afiseazaDetaliiRezervare(rezervare3);
        Rezervare rezervare4=new Rezervare(2,1,"14:00");
        bazaDeDateClienti.getClient("","0743434356",null).afiseazaDetaliiRezervare(rezervare4);

    }
}