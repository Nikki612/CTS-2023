package cts.unittesting.tests;

import cts.unittesting.mocks.FakePerson;
import cts.unittesting.model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PachetTuristicDiscountTest {

    @Test
    void shouldApplyDiscountForSeniors(){
        FakePerson fakePerson=new FakePerson();
        fakePerson.setGetAgeValue(66);
        fakePerson.setGetSexValue("M");
        PachetTuristic pachetTuristic=new PachetTuristic(fakePerson,"Teleorman",1000.0);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(850,pachetTuristic.getPret());
    }

    @Test
    void shouldNotApplyDiscount()
    {
        FakePerson fakePerson=new FakePerson();
        fakePerson.setGetAgeValue(50);
        fakePerson.setGetSexValue("M");
        PachetTuristic pachetTuristic=new PachetTuristic(fakePerson,"Oltenita",100.0);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(100,pachetTuristic.getPret());
    }

}