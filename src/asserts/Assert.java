package asserts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author administrador1
 */
public class Assert {
    @Test
    public void test()
    {
        Calculadora b = null;
        Calculadora c = new Calculadora();
        Calculadora d = c;
        
        assertEquals(10, c.suma(5,5));
        
        assertTrue(true);
        
        assertFalse(false);
        
        assertNull(b);
        
        assertNotNull(c);
        
        assertSame(c,d);
        
        assertNotSame(b,c);
    }
}
