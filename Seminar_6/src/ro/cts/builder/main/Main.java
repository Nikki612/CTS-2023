package ro.cts.builder.main;

import ro.cts.builder.model.AbstractBuilder;
import ro.cts.builder.model.Builder;
import ro.cts.builder.model.BuilderV2;
import ro.cts.builder.model.Reservation;

public class Main {
    public static void main(String[] args)
    {
        AbstractBuilder reservationBuilder=new Builder();
        reservationBuilder.setIsAmbientalMusic(true).setMusicGenre("Jazz");
        Reservation reservation=reservationBuilder.buildReservation();
        System.out.println(reservation.toString());

        Reservation reservation1=new Builder().setIsAmbientalMusic(true).setMusicGenre("Minimale").buildReservation();
        System.out.println(reservation1.toString());


        AbstractBuilder builder2=new BuilderV2();
        Reservation reservation2=builder2.setMusicGenre("Rock").buildReservation();
        System.out.println(reservation2.toString());

        Reservation reservation3=builder2.setMusicGenre("Metal").buildReservation();
        System.out.println(reservation3.toString());
    }
}