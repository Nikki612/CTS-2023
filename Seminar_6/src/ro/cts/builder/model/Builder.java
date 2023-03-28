package ro.cts.builder.model;

public class Builder implements AbstractBuilder{

    private Reservation reservation;

    public Builder() {
        this.reservation=new Reservation(false,false,false,false,null);
    }

    @Override
    public Reservation buildReservation() {
        return this.reservation;
    }

    public Builder setIsNearWindow(Boolean isNearWindow)
    {
        this.reservation.setNearWindow(isNearWindow);
        return this;
    }

    public Builder setIsErgoChairs(boolean ergoChairs) {
        this.reservation.setErgoChairs(ergoChairs);
        return this;
    }

    public Builder setIsDecoratedTable(boolean decoratedTable) {
        this.reservation.setDecoratedTable(decoratedTable);
        return this;
    }

    public Builder setIsAmbientalMusic(boolean ambientalMusic) {
        this.reservation.setAmbientalMusic(ambientalMusic);
        return this;
    }

    public Builder setMusicGenre(String musicGenre) {
        this.reservation.setMusicGenre(musicGenre);
        return this;
    }

}
