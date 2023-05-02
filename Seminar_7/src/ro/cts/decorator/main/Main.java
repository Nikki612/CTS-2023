package ro.cts.decorator.main;

import ro.cts.decorator.model.*;

public class Main {
    public static void aplicatie(ICard card)
    {
        card.payOnline(20.5);
        card.payPOS(14.5);
    }

    public static void main(String[] args) {
        ICard card=new Card();
        aplicatie(card);
        AbstractDecorator decorator=new CardContactLess(card);
        AbstractDecorator decoratorVirtual=new CardContactLessVirtual(card);
        decoratorVirtual.payContactless(31.2);
        decorator.payContactless(14.3);
    }
}
