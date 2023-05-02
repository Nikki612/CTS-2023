package ro.cts.composite.main;

import ro.cts.composite.model.IComponentaAbstracta;
import ro.cts.composite.model.Loc;
import ro.cts.composite.model.Tribuna;

public class Main {
    public static void main(String[] args) throws Exception {
        IComponentaAbstracta tribunaP=new Tribuna("Tribuna Principala");
        IComponentaAbstracta tribunaC=new Tribuna("Tribuna Copii");
        IComponentaAbstracta tribunaA=new Tribuna("Tribuna Adulti");

        IComponentaAbstracta loc1=new Loc(2,1);
        IComponentaAbstracta loc2=new Loc(2,2);
        IComponentaAbstracta loc3=new Loc(2,3);

        tribunaP.adaugaNod(tribunaC);
        tribunaP.adaugaNod(tribunaA);
        tribunaC.adaugaNod(loc1);
        tribunaC.adaugaNod(loc2);
        tribunaC.adaugaNod(loc3);
        tribunaP.afiseazaComponenta(" ");
    }
}
