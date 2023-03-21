package ro.ase.factorymethod;

public class BusFactory implements Factory{
    @Override
    public TransportVehicle createObject(int noSeats) {
        return new Bus(noSeats);
    }
}
