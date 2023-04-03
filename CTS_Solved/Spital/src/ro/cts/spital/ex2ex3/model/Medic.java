package ro.cts.spital.ex2ex3.model;

public class Medic extends PersonalSpital{
    @Override
    public void showName() {
        System.out.println("Medic name is: "+super.name);
    }

    public Medic(String name) {
        super.name=name;
    }
}
