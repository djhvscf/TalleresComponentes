/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arreglo.pruebas;

import com.arreglo.clases.ArrayMath;
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
 * @author FPC
 */
public class TestArreglo1 {
    
    public TestArreglo1() {
       
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
   
    @Test
     public void pruebaArreglo(){
         int n1 []={5,3,2};
         int n2 []={4,2,1};  
        
        Assert.assertEquals(n1.length, n2.length);
        System.out.println("Suma: " + Arrays.toString(ArrayMath.sumaArrays(n1, n2)));
        System.out.println("Multiplicacion: " + Arrays.toString(ArrayMath.multiplicaArrays(n1, n2)));
        System.out.println("Mayores: " + Arrays.toString(ArrayMath.mayoresArrays(n1, n2)));
        System.out.println("Diferentes: " + Arrays.toString(ArrayMath.obtenerDiferentes(n1, n2)));
        System.out.println("Fusion de los arreglos: " + Arrays.toString(ArrayMath.obtenerArrays(n1, n2)));
        
     }
   
     
    
    
}
