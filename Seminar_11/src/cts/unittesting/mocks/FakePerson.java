package cts.unittesting.mocks;

import cts.unittesting.model.IPersoana;

public class FakePerson implements IPersoana {

    private String getSexValue;
    private int getAgeValue;
    private boolean getCheckCNPValue;

    public void setGetSexValue(String getSexValue) {
        this.getSexValue = getSexValue;
    }

    public void setGetAgeValue(int getAgeValue) {
        this.getAgeValue = getAgeValue;
    }

    public void setGetCheckCNPValue(boolean getCheckCNPValue) {
        this.getCheckCNPValue = getCheckCNPValue;
    }

    @Override
    public String getSex() {
        return getSexValue;
    }

    @Override
    public int getVarsta() {
        return getAgeValue;
    }

    @Override
    public boolean checkCNP() {
        return getCheckCNPValue;
    }
}
