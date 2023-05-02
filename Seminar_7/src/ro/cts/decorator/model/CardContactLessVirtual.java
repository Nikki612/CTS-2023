package ro.cts.decorator.model;

public class CardContactLessVirtual extends AbstractDecorator{
    public CardContactLessVirtual(ICard card) {
        super(card);
    }

    @Override
    public void payContactless(double sum) {
        System.out.println("Plata contactless virtuala de: "+sum);
    }
}
