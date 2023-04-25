package ro.cts.adapter.model.existent;

public class CreditIpotecar implements Credit{
    @Override
    public void oferaCredit(float suma) {
        System.out.println("A fost oferit creditul ipotecar in valoare de: "+suma);
    }
}
