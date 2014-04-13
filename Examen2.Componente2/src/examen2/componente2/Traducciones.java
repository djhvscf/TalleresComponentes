/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.componente2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dennis
 */
public class Traducciones {
    
    List listaIngles = new ArrayList();
    List listaItaliano = new ArrayList();
    List listaBase = new ArrayList();
    
    public Traducciones()
    {
        setTraduccionIngles();
        setTraduccionItaliano();
        setTraduccionBase();
    }
    
    private void setTraduccionBase()
    {
        listaBase.add("musica");
        listaBase.add("computadora");
        listaBase.add("teclado");
        listaBase.add("raton");
        listaBase.add("profesor");
        listaBase.add("escritorio");
        listaBase.add("mesa");
        listaBase.add("frijol");
        listaBase.add("arroz");
        listaBase.add("rojo");
        listaBase.add("azul");
        
    }
    
    private void setTraduccionIngles()
    {
        listaIngles.add("Music");
        listaIngles.add("Computer");
        listaIngles.add("Keyboard");
        listaIngles.add("Mouse");
        listaIngles.add("Teacher");
        listaIngles.add("Desk");
        listaIngles.add("Board");
        listaIngles.add("Beans");
        listaIngles.add("Rice");
        listaIngles.add("Red");
        listaIngles.add("Blue");
        
    }
    
    private void setTraduccionItaliano()
    {
        listaItaliano.add("Musica");
        listaItaliano.add("Computer");
        listaItaliano.add("Tastiera");
        listaItaliano.add("Topo");
        listaItaliano.add("Professore");
        listaItaliano.add("Tavolo");
        listaItaliano.add("Asse");
        listaItaliano.add("Fagiolo");
        listaItaliano.add("Riso");
        listaItaliano.add("Rosso");
        listaItaliano.add("Blu");
    }
    
    public String getTraduccion(String lenguaje, String palabra)
    {
        String traduccion = "Desconocida";
        if(lenguaje.equals("Ingles"))
        {
            for(int i = 0; i < listaBase.size(); i++)
            {
                if(listaBase.get(i).equals(palabra.toLowerCase()))
                {
                    traduccion = listaIngles.get(i).toString();
                }
            }
        }
        else if(lenguaje.equals("Italiano"))
        {
            for(int i = 0; i < listaBase.size(); i++)
               {
                   if(listaBase.get(i).equals(palabra.toLowerCase()))
                   {
                       traduccion = listaItaliano.get(i).toString();
                   }
               }   
        }
        
        return traduccion;
    }
}
