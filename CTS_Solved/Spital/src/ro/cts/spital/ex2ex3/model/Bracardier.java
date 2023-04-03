package ro.cts.spital.ex2ex3.model;

public class Bracardier extends PersonalSpital{
    @Override
    public void showName() {
        System.out.println("Bracardier name is: "+super.name);
    }

    public Bracardier(String name) {
        super.name=name;
    }
}
