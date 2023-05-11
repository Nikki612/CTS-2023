package ro.cts.state.model;

public class BusInRoute implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusInService)
        {
            System.out.println("The bus "+bus.getNrAutobuz()+" has left in a new route.");
        }
        else {
            System.out.println("The bus cannot be in route.");
        }
    }
}
