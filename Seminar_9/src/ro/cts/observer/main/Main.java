package ro.cts.observer.main;

import ro.cts.observer.model.Client;
import ro.cts.observer.model.IClient;
import ro.cts.observer.model.IRestaurant;
import ro.cts.observer.model.Restaurant;

public class Main {
    public static void main(String[] args) {
        IClient client1=new Client("Maria");
        IClient client2=new Client("Mara");
        IClient client3=new Client("Mihai");

        Restaurant restaurant=new Restaurant("Casa Buna");
        restaurant.adaugareDiscount(10);
        restaurant.abonareClient(client1);
        restaurant.afiseazaMeniul();
        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonareClient(client1);
        restaurant.adaugareDiscount(20);
    }
}
