package ro.cts.spital.ex2ex3.main;

import ro.cts.spital.ex2ex3.model.PersonalSpital;
import ro.cts.spital.ex2ex3.model.PersonalSpitalFactory;
import ro.cts.spital.ex2ex3.model.TipPersonal;

public class Main {
    public static void main(String[] args) {

        PersonalSpitalFactory factory=new PersonalSpitalFactory();
        PersonalSpital persoana1=factory.createObject(TipPersonal.BRANCARDIER,"Booptie");
        PersonalSpital persoana2=factory.createObject(TipPersonal.MEDIC,"McDreamy");
        persoana1.showName();
        persoana2.showName();
    }
}
