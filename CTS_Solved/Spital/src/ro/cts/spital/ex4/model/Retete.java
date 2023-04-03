package ro.cts.spital.ex4.model;

public class Retete implements AbstractPrototype{
    private int cantOne;
    private int cantTwo;
    private int cantThree;
    private int cantFour;
    @Override
    public Retete createCopy() throws CloneNotSupportedException {
        return (Retete) this.clone();
    }

    public Retete(int cantOne, int cantTwo, int cantThree, int cantFour) {
        this.cantOne = cantOne;
        this.cantTwo = cantTwo;
        this.cantThree = cantThree;
        this.cantFour = cantFour;
    }
}
