package ro.ase.factorymethod;

public abstract class TransportVehicle {
    protected int noSeats;

    public TransportVehicle(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("has");
        sb.append(" ").append(noSeats);
        sb.append("seats.");
        return sb.toString();
    }

    public abstract void showInfo();
    public abstract void moveType();
}
