/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arreglo.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dennis Hernandez
 */
public class OperacionesArrayMath {
    
    public static int sumar(int a, int b)
    {
        return a+b;
    }
    
    public static int multiplicar(int a, int b)
    {
        return a*b;
    }
    
    public static int getMinLength(int[] array1, int[] array2)
    {
        int minLength = 0;
        if(array1.length >= array2.length)
        {
            minLength = array2.length;
        }else   
        {
            minLength = array1.length;
        }
        
        return minLength;
    }
    
    public static int getMinValue(int[] array)
    {
        Arrays.sort(array);
        return array[0];     
    }
    
    public static int getMaxValue(int[] array)
    {
        Arrays.sort(array);  
        return array[array.length-1];
    }
    
    public static int[] getArrayFromList(ArrayList lista)
    {
        int[] ret = new int[lista.size()];
        Iterator<Integer> iterator = lista.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }
    
    public static ArrayList deleteDuplicate(int[] array)
    {
        ArrayList lista = new ArrayList();
        Arrays.sort(array);
        int different = array[0];
        int num;
        lista.add(different);
        for (int i = 1; i < array.length; i++) 
        {
            num = array[i];
            if(different != num){
                lista.add(num);
            }
            different = num;
        }
        return lista;
    }
}
