package com.componentes.taller.ejemplodos;

import javax.portlet.GenericPortlet;
import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderResponse;
import javax.portlet.PortletException;
import java.io.IOException;
import javax.portlet.PortletRequestDispatcher;

/**
 * EjemploTallerDos Portlet Class
 */
public class EjemploTallerDos extends GenericPortlet {
    
    public void processAction(ActionRequest request, ActionResponse response) throws PortletException, IOException {
        String palabra = request.getParameter("palabra");
        String result;
        if (palabra != null && !palabra.isEmpty()) {
            try {
                boolean palabraToReturn = isPalindrome(palabra);
                if(palabraToReturn)
                {
                    result = "Es palindrome";
                }else
                {
                    result = "No es palindrome";
                }
                
                System.out.println("resultado:" + result);
                request.setAttribute("palindrome", result);
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    static boolean isPalindrome(String palabra) {
      String reverse="";
 
      int length = palabra.length();
      for ( int i = length - 1 ; i >= 0 ; i-- )
      {
         reverse = reverse + palabra.charAt(i);
      }
      
      if (palabra.equals(reverse))
      {
         return true;
      }
      else
      {
         return false;
      }
    }
    
    public void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        response.setContentType("text/html");        
        PortletRequestDispatcher dispatcher =
                getPortletContext().getRequestDispatcher("/WEB-INF/jsp/EjemploTallerDos_view.jsp");
        dispatcher.include(request, response);
    }

    public void doEdit(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        response.setContentType("text/html");        
        PortletRequestDispatcher dispatcher =
                getPortletContext().getRequestDispatcher("/WEB-INF/jsp/EjemploTallerDos_edit.jsp");
        dispatcher.include(request, response);
    }

    public void doHelp(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        
        response.setContentType("text/html");        
        PortletRequestDispatcher dispatcher =
                getPortletContext().getRequestDispatcher("/WEB-INF/jsp/EjemploTallerDos_help.jsp");
        dispatcher.include(request, response);
    }
}
