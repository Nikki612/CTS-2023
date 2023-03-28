package ro.cts.builder.model;

public class Reservation {
    private boolean isNearWindow;
    private boolean isErgoChairs;

    private boolean isDecoratedTable;
    private boolean isAmbientalMusic;
    private String musicGenre;

    protected Reservation(boolean isNearWindow, boolean isErgoChairs, boolean isDecoratedTable, boolean isAmbientalMusic, String musicGenre) {
        this.isNearWindow = isNearWindow;
        this.isErgoChairs = isErgoChairs;
        this.isDecoratedTable = isDecoratedTable;
        this.isAmbientalMusic = isAmbientalMusic;
        this.musicGenre = musicGenre;
    }

    protected void setNearWindow(boolean nearWindow) {
        isNearWindow = nearWindow;
    }

    protected void setErgoChairs(boolean ergoChairs) {
        isErgoChairs = ergoChairs;
    }

    protected void setDecoratedTable(boolean decoratedTable) {
        isDecoratedTable = decoratedTable;
    }

    protected void setAmbientalMusic(boolean ambientalMusic) {
        isAmbientalMusic = ambientalMusic;
    }

    protected void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reservation{");
        sb.append("isNearWindow=").append(isNearWindow);
        sb.append(", isErgoChairs=").append(isErgoChairs);
        sb.append(", isDecoratedTable=").append(isDecoratedTable);
        sb.append(", isAmbientalMusic=").append(isAmbientalMusic);
        sb.append(", musicGenre='").append(musicGenre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
