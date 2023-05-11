package ro.cts.state.main;

import ro.cts.state.model.Bus;
import ro.cts.state.model.IBusState;

public class Main {
    public static void main(String[] args) {
        Bus bus=new Bus(12);
        bus.goInService();
        bus.arriveAtEndOfRoute();
        bus.arriveAtEndOfRoute();
        bus.leaveForRoute();
        bus.goInService();
        bus.arriveAtEndOfRoute();
    }
}
