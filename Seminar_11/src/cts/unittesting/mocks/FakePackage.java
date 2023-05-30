package cts.unittesting.mocks;

import cts.unittesting.model.IPachetTuristic;

public class FakePackage implements IPachetTuristic {

    private Double specialPrice;
    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    public void setSpecialPrice(Double specialPrice) {
        this.specialPrice = specialPrice;
    }

    @Override
    public Double getPret() {
        return specialPrice;
    }
}
