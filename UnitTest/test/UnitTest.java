/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import examen2.componente2.Traducciones;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author Dennis
 */
public class UnitTest {

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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
   
    @Test
     public void UnitTest(){
         String lenguaje = "Ingles";
         String lenguaje2 = "Italiano";
        
        Traducciones traduc =  new Traducciones ();
        System.out.println("Traducción de Musica en Ingles: " + traduc.getTraduccion(lenguaje, "Musica"));
        System.out.println("Traducción de Rojo en Italiano: " + traduc.getTraduccion(lenguaje2, "Rojo"));
        System.out.println("Traducción de Musica2 en Ingles: " + traduc.getTraduccion(lenguaje, "Musica2"));
        System.out.println("Traducción de Musica2 en Italiano: " + traduc.getTraduccion(lenguaje2, "Musica2"));
     }
}
