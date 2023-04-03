package ro.cts.spital.ex2ex3.model;

public class Asistent extends PersonalSpital{
    @Override
    public void showName() {
        System.out.println("Asistent name is: "+super.name);
    }

    public Asistent(String name) {
        super.name=name;
    }
}
