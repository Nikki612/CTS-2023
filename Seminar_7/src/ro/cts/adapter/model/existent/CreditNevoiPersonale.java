package ro.cts.adapter.model.existent;

public class CreditNevoiPersonale implements Credit{
    @Override
    public void oferaCredit(float suma) {
        System.out.println("A fost oferit creditul de nevoi personale in valoare de: "+suma);
    }
}
