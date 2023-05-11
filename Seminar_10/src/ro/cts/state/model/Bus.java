package ro.cts.state.model;

public class Bus {
    private IBusState state;
    private int nrAutobuz;

    public IBusState getState() {
        return state;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    protected void setState(IBusState state) {
        this.state = state;
    }

    public Bus(int nrAutobuz) {
        this.state = new BusAtEndOfRoute();
        this.nrAutobuz = nrAutobuz;
    }

    public void leaveForRoute()
    {
        IBusState route=new BusInRoute();
        route.changeState(this);
    }

    public void goInService()
    {
        IBusState service=new BusInService();
        service.changeState(this);
    }

    public void arriveAtEndOfRoute()
    {
        IBusState endOfLine=new BusAtEndOfRoute();
        endOfLine.changeState(this);
    }
}
