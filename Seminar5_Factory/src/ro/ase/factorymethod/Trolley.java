package ro.ase.factorymethod;

public class Trolley extends TransportVehicle{
    public Trolley(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("The trolley "+super.toString());
    }

    @Override
    public void moveType() {
        System.out.println("The trolley moves by electricity");
    }
}
