package cts.unittesting.model;

import cts.unittesting.mocks.FakePackage;
import cts.unittesting.mocks.FakePerson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgentieTurismPretTotalTest {
    @Test
    void expectedPrice()
    {
        FakePackage pachetTuristic1=new FakePackage();
        FakePackage pachetTuristic2=new FakePackage();
        FakePackage pachetTuristic3=new FakePackage();
        pachetTuristic1.setSpecialPrice(100.0);
        pachetTuristic2.setSpecialPrice(200.0);
        pachetTuristic3.setSpecialPrice(300.0);
        AgentieTurism agentieTurism=new AgentieTurism();
        agentieTurism.adaugaPachet(pachetTuristic1);
        agentieTurism.adaugaPachet(pachetTuristic2);
        agentieTurism.adaugaPachet(pachetTuristic3);
        assertEquals(600,agentieTurism.calculareSumaTotalaPachete());
    }

}