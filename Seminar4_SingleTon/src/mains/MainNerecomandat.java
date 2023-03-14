package mains;

import registry.nerecomandat.Firma;
import registry.nerecomandat.Registru;

public class MainNerecomandat {

    public static void main(String[] args) {
        Firma firma1= Registru.getFirma("SC Ceva SRL");
        Firma firma2=Registru.getFirma("SC Altceva SRL");
        Firma firma3=Registru.getFirma("SC Ceva SRL");

        System.out.println(firma1);
        System.out.println(firma2);
        System.out.println(firma3);
    }
}
