package ro.cts.spital.ex2ex3.model;

public class AsistentFactory implements Factory{

    @Override
    public PersonalSpital createObject(String name) {
        return new Asistent(name);
    }
}
