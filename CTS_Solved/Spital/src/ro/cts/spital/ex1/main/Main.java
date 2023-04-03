package ro.cts.spital.ex1.main;

import ro.cts.spital.ex1.model.AbstractBuilder;
import ro.cts.spital.ex1.model.Pacient;
import ro.cts.spital.ex1.model.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder=new PacientBuilder();
        Pacient pacient1=builder.buildPacient("Marian",20);
        System.out.println(pacient1);

        Pacient pacient2=new PacientBuilder().setCuHalat(true).setCuPapuci(true).buildPacient("Antonio",50);
        System.out.println(pacient2);

        Pacient pacient3=builder.setCuMicDejun(true).setCuHalat(true).buildPacient("Ana",15);
        System.out.println(pacient3);

    }
}