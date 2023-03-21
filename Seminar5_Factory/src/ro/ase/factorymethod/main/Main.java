package ro.ase.factorymethod.main;

import ro.ase.factorymethod.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory fBus=new BusFactory();
        Factory fTram=new TramFactory();
        Factory fTrolley=new TrolleyFactory();

        List<TransportVehicle> vehicleList=new ArrayList<>();
        vehicleList.add(fBus.createObject(10));
        vehicleList.add(fTram.createObject(15));
        vehicleList.add(fTrolley.createObject(50));

        for(TransportVehicle t:vehicleList)
        {
            t.showInfo();
            t.moveType();
        }
    }
}
