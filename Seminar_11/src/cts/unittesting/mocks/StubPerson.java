package cts.unittesting.mocks;

import cts.unittesting.model.IPersoana;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class StubPerson implements IPersoana {
    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 18;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
