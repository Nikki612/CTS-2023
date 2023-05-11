package ro.cts.strategy.main;

import ro.cts.strategy.model.Calator;
import ro.cts.strategy.model.PlataCardBancar;
import ro.cts.strategy.model.PlataCardCalatori;
import ro.cts.strategy.model.PlataPrinSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Andy", 8);
        calator.platesteBilet(3);
        calator.setMetodaPlata(new PlataPrinSMS());
        calator.platesteBilet(2.5);
        calator.setMetodaPlata(new PlataCardBancar());
        calator.platesteBilet(3.5);
        calator.setMetodaPlata(new PlataCardCalatori());
    }
}
