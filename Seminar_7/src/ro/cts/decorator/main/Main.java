package ro.cts.decorator.main;

import ro.cts.decorator.model.AbstractDecorator;
import ro.cts.decorator.model.Card;
import ro.cts.decorator.model.CardContactLess;
import ro.cts.decorator.model.ICard;

public class Main {
    public static void main(String[] args) {
        ICard card=new Card();
        card.payOnline(20.5);
        card.payPOS(14.5);

        AbstractDecorator decorator=new CardContactLess(card);
        decorator.payContactless(14.3);
    }
}
