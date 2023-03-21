package ro.ase.factorymethod;

public class Tram extends TransportVehicle{
    public Tram(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("The tram "+super.toString());
    }

    @Override
    public void moveType() {
        System.out.println("The tram moves by rails.");
    }
}
