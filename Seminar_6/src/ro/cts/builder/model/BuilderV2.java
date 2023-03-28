package ro.cts.builder.model;

public class BuilderV2 implements AbstractBuilder{

    private boolean isNearWindow;
    private boolean isErgoChairs;

    private boolean isDecoratedTable;
    private boolean isAmbientalMusic;
    private String musicGenre;

    @Override
    public Reservation buildReservation() {
        return new Reservation(isNearWindow,isErgoChairs,isDecoratedTable,isAmbientalMusic,musicGenre);
    }

    public BuilderV2() {
        this.isNearWindow = false;
        this.isErgoChairs = false;
        this.isDecoratedTable = false;
        this.isAmbientalMusic = false;
        this.musicGenre = null;
    }

    @Override
    public AbstractBuilder setIsNearWindow(Boolean isNearWindow) {
        this.isNearWindow = isNearWindow;
        return this;
    }

    @Override
    public AbstractBuilder setIsErgoChairs(boolean ergoChairs) {
        this.isErgoChairs = ergoChairs;
        return this;
    }

    @Override
    public AbstractBuilder setIsDecoratedTable(boolean decoratedTable) {
        this.isDecoratedTable = false;
        return this;
    }

    @Override
    public AbstractBuilder setIsAmbientalMusic(boolean ambientalMusic) {
        this.isAmbientalMusic = false;
        return this;
    }

    @Override
    public AbstractBuilder setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
        return this;
    }
}
