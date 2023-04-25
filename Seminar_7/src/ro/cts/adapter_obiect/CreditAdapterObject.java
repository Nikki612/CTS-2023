package ro.cts.adapter_obiect;

import ro.cts.adapter.model.existent.Credit;
import ro.cts.adapter.model.nou.CreditLeasing;

public class CreditAdapterObject implements Credit {

    private CreditLeasing leasing;
    public CreditAdapterObject(CreditLeasing leasing)
    {
        this.leasing=leasing;
    }

    @Override
    public void oferaCredit(float suma) {
        this.leasing.oferaLeasing(suma);
    }
}
