/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javalabra.Logiikka;
import javalabra.Pelaaja;
import javalabra.Rata;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tme
 */
public class javalabraTest {
    
    public javalabraTest() {
    }

    @Before
    public void setUp() {
        
    }
    
    @Test
    public void RadanKonstruktoriAsettaaOikeanNimen(){
        Rata r = new Rata("rata");
        assertEquals("rata", r.getNimi());
    }
    

    
    @Test
    public void RataAsettaaVaylatOikein(){
        Rata r = new Rata("rata");
        ArrayList<Integer> testivaylat = new ArrayList<Integer>();
        testivaylat.add(3);
        testivaylat.add(4);
        r.setVaylat(testivaylat);
        
        int odotettuPAR = 3;
        int haettuPAR = r.getVaylat().get(0);
        int odotettuPAR1 = 4;
        int haettuPAR1 = r.getVaylat().get(1);
        
        assertEquals(odotettuPAR, haettuPAR);
        assertEquals(odotettuPAR1, haettuPAR1);
    }
    
    @Test
    public void PelaajanKonstruktoriAsettaaOikeanNimen(){
        Pelaaja p = new Pelaaja("player");
        assertEquals("player", p.getNimi());
    }
    
   
    
    
}
