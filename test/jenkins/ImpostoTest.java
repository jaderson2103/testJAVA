/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trollador
 */

/**
public class ImpostoTest {
    
    public ImpostoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcula method, of class Imposto.
     */
  
/**
@Test
    public void testCalcula() {
        System.out.println("calcula");
        Orcamento orcamento = null;
        Imposto instance = new Imposto();
        double expResult = 0.0;
        double result = instance.calcula(orcamento);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
*/

/**
 *
 * @author trollador
 */
import jenkins.Imposto;
import jenkins.Orcamento;
import org.junit.Assert;
import org.junit.Test;

public class ImpostoTest {
    @Test
    public void deveCalcularImpostoDeDezPorCento() {
        Orcamento orcamento = new Orcamento(100.0);
        Imposto imposto = new Imposto();
        Assert.assertEquals((double)10.0, (double)imposto.calcula(orcamento), (double)Double.MIN_VALUE);
    }
}