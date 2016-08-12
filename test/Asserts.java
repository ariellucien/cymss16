/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author administrador1
 */
public class Asserts {
    Calculadora c;
    public Asserts() {
    }
    
    @Before
    public void crearInstancias()
    {
        c = new Calculadora();
    }
    
    @Test
    public void test()
    {
        Calculadora b = null;        
        Calculadora d = c;
      
        assertEquals(10, c.suma(5,5));       
        assertTrue(true);     
        assertFalse("no es falso", false);        
        assertNull("es nulo", b);        
        assertNotNull(c);        
        assertSame(c,d);        
        assertNotSame(b,c);
    }
    
    @Test
    public void multiplicaChars()
    {
        assertEquals(9506, c.multiplicacion('a', 'b'));
    }
    
    @Test
    public void divisionCero()
    {
        assertEquals(0, c.division(3, 0));
    }    
}
