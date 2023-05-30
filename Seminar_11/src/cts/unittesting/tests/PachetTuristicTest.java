package cts.unittesting.tests;

import cts.unittesting.mocks.StubPersoanaMinora;
import cts.unittesting.mocks.StubPerson;
import cts.unittesting.model.IPersoana;
import cts.unittesting.model.PachetTuristic;
import cts.unittesting.model.Persoana;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PachetTuristicTest {

    @Test
    void poateRezerva()
    {
        IPersoana persoana=new StubPerson();
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Destinatie",20.25 );
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    void testNuPoateRezerva()
    {
        IPersoana persoana=new StubPersoanaMinora();
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Destinatie",20.25 );
        assertTrue(!pachetTuristic.poateRezerva());
    }

//    private int getValoare(){
//        return 10;
//    }
//
//    private boolean getBoolean()
//    {
//        return true;
//    }
//
//    private List<Object> getLista()
//    {
//        List<Object> lista=new ArrayList<>();
//        lista.add(new Integer(6));
//        return lista;
//    }
//
//    private List<Object> getListaNULL()
//    {
//        return null;
//    }
//    @Test
//    public void testDemonstrativ()
//    {
//        assertEquals(10,getValoare());
//        assertEquals(true,getBoolean());
//        assertTrue(getBoolean());
//        assertTrue(!getBoolean());
//        assertNotNull(getLista());
//        assertNull(getListaNULL());
//    }

}