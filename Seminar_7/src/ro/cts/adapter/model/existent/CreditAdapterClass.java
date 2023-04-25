package ro.cts.adapter.model.existent;

import ro.cts.adapter.model.nou.CreditLeasing;

public class CreditAdapterClass extends CreditLeasing implements Credit
{
    @Override
    public void oferaCredit(float suma) {
        super.oferaLeasing(suma);
    }
}
