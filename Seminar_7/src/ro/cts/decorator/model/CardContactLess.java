package ro.cts.decorator.model;

public class CardContactLess extends AbstractDecorator{
    public CardContactLess(ICard card) {
        super(card);
    }

    @Override
    public void payContactless(double sum) {
        System.out.println("Plata contactless de: "+sum);
    }
}
