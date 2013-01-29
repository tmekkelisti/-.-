/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javalabra.Rata;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teeyoshi
 */
public class RataTest {
    
    Rata r;
    
    public RataTest() {
    }
    
    @Before
    public void setUp(){
        r = new Rata("rata");
    }
    
    @Test
    public void RadanKonstruktoriAsettaaOikeanNimen(){
 
        assertEquals("rata", r.getNimi());
    }
    
    @Test
    public void RataAsettaaVaylatOikein(){

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
    public void toStringPalauttaaOikein(){ //koska load/save toimii toStringin mukaan
        assertEquals("rata", r.toString());
    }
}
