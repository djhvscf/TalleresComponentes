/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arreglo.clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author FPC
 */
public class ArrayMath {
        
    public static int[] sumaArrays(int[] ar1, int[] ar2){
        
        int[] resul = new int [OperacionesArrayMath.getMinLength(ar1, ar2)];
        
        for(int i=0;i<resul.length;i++)
        { 
           resul[i]= OperacionesArrayMath.sumar(ar1[i],ar2[i]); 
        }
        return resul;
    }
    
    public static int[] multiplicaArrays(int[] ar1, int[] ar2){

        int[] resul = new int [OperacionesArrayMath.getMinLength(ar1, ar2)];
         
        for(int i=0;i<resul.length;i++) 
        { 
            resul[i]= OperacionesArrayMath.multiplicar(ar1[i],ar2[i]);
        }
        return resul;        
    }
        
    public static int [] mayoresArrays(int [] ar1, int[] ar2)
    {
        int [] arResul = new int [2];
        
        arResul[0] = OperacionesArrayMath.getMaxValue(ar1);
        arResul[1] = OperacionesArrayMath.getMaxValue(ar2);
        
        return arResul;
    }
    
    public static int[] obtenerDiferentes(int [] ar1, int[] ar2)
    {
        ArrayList arrayDif = new ArrayList();
        int[] auxArray1;
        int[] auxArray2;
        int[] arrayCombinacion;
        int[] arrayDifferents;
        int posicion = 0;
        
        arrayDif = OperacionesArrayMath.deleteDuplicate(ar1);
        auxArray1 = OperacionesArrayMath.getArrayFromList(arrayDif);
        arrayDif= OperacionesArrayMath.deleteDuplicate(ar2);
        auxArray2 = OperacionesArrayMath.getArrayFromList(arrayDif);
        
        arrayCombinacion = new int[auxArray1.length + auxArray2.length];
        for (int i = 0; i < auxArray1.length; i++) {
            arrayCombinacion[posicion] = auxArray1[i];
            posicion ++;
        }
        for (int j = 0; j < auxArray2.length; j++) {
            arrayCombinacion[posicion] = auxArray2[j];
            posicion ++;
        }
        arrayDif = OperacionesArrayMath.deleteDuplicate(arrayCombinacion);
        arrayDifferents = OperacionesArrayMath.getArrayFromList(arrayDif);
        
        return arrayDifferents;
    }
    
    public static int[] obtenerArrays(int[] ar1, int[] ar2)
    {
        int arResult[] = new int[ar1.length + ar2.length]; 
        ArrayList arrayDif = new ArrayList();
        
        System.arraycopy(ar1, 0, arResult, 0, ar1.length);
        
        System.arraycopy(ar2, 0, arResult, ar1.length, ar2.length);
        
        arrayDif = OperacionesArrayMath.deleteDuplicate(arResult);
        arResult = OperacionesArrayMath.getArrayFromList(arrayDif);
        
        return arResult;
    }
}