package ro.ase.factorymethod;

public class Bus extends TransportVehicle{

    public Bus(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("The bus "+super.toString());
    }

    @Override
    public void moveType() {
        System.out.println("The bus moves by wheels.");
    }
}
