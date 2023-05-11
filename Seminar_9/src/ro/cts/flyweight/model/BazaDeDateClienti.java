package ro.cts.flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class BazaDeDateClienti {
    private Map<String,IClient> clienti;

    public BazaDeDateClienti() {
        this.clienti = new HashMap<>();
    }

    public IClient getClient(String nume, String nrTel, String email)
    {
        if(clienti.containsKey(nrTel))
        {
            return clienti.get(nrTel);
        }
        else
        {
            IClient client=new Client(nume,nrTel,email);
            clienti.put(nrTel,client);
            return client;
        }
    }
}
