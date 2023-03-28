package ro.cts.prototype.main;

import ro.cts.prototype.model.AbstractPrototype;
import ro.cts.prototype.model.Client;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Client client=new Client("Andrei","0757563236","andrei@email.com");
        AbstractPrototype client2=client.createCopy();
        System.out.println(client2.toString());
    }
}
