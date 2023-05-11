package ro.cts.observer.model;

import ro.cts.flyweight.model.Client;

public interface IRestaurant {
    public void abonareClient(IClient client);
    public void dezabonareClient(IClient client);
    public void trimiteNotificare(String mesaj);
}
