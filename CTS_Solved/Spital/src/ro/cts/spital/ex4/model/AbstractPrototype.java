package ro.cts.spital.ex4.model;

public interface AbstractPrototype {
    public Retete createCopy() throws CloneNotSupportedException;
}
