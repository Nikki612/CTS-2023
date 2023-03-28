package ro.cts.builder.model;

public interface AbstractBuilder {
    public abstract Reservation buildReservation();

    public AbstractBuilder setIsNearWindow(Boolean isNearWindow);

    public AbstractBuilder setIsErgoChairs(boolean ergoChairs);

    public AbstractBuilder setIsDecoratedTable(boolean decoratedTable);

    public AbstractBuilder setIsAmbientalMusic(boolean ambientalMusic);

    public AbstractBuilder setMusicGenre(String musicGenre);
}
