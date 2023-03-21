package ro.ase.factorymethod;

public interface Factory {
    public TransportVehicle createObject(int noSeats);
}
