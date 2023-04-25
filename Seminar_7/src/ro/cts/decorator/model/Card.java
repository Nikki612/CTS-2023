package ro.cts.decorator.model;

public class Card implements ICard{
    @Override
    public void payOnline(double sum) {
        System.out.println("Plata online de: "+sum);
    }

    @Override
    public void payPOS(double sum) {
        System.out.println("Plata contactless de: "+sum);
    }
}
