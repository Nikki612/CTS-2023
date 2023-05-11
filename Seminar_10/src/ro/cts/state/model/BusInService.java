package ro.cts.state.model;

public class BusInService implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute)
        {
            System.out.println("The bus "+bus.getNrAutobuz()+" mesaj");
        }
    }
}
