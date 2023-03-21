package ro.ase.factorymethod;

public class TrolleyFactory implements Factory{
    @Override
    public TransportVehicle createObject(int noSeats) {
        return new Trolley(noSeats);
    }
}
