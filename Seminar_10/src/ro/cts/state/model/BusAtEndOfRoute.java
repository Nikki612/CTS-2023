package ro.cts.state.model;

public class BusAtEndOfRoute implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusInRoute ||bus.getState() instanceof BusInService)
        {
            System.out.println("The bus "+bus.getNrAutobuz()+" has reached the end of the line.");
            bus.setState(this);
        }
        else
        {
            System.out.println("The bus can t reach the end of the line.");
        }
    }
}
