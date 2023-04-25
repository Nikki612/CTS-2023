package ro.cts.adapter.main;

import ro.cts.adapter.model.existent.Credit;
import ro.cts.adapter.model.existent.CreditAdapterClass;
import ro.cts.adapter.model.existent.CreditIpotecar;
import ro.cts.adapter.model.nou.CreditLeasing;

public class Main {

    public static void afiseazaCredit(Credit credit,float suma){
        credit.oferaCredit(suma);
    }
    public static void main(String[] args) {
        Credit ipotecar=new CreditIpotecar();
        afiseazaCredit(ipotecar,5050.5f);
        CreditLeasing leasing=new CreditLeasing();

        Credit adapterClass=new CreditAdapterClass();
        afiseazaCredit(adapterClass,2020.34f);
    }
}