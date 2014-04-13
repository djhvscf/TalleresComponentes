<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ page import="javax.portlet.*"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%-- Uncomment below lines to add portlet taglibs to jsp


<%PortletPreferences prefs = renderRequest.getPreferences();%> 
--%>
<portlet:defineObjects />
<h3>Palabra palidrome</h3>
<form action="<portlet:actionURL/>" method="post">
    Ingrese la palabra:
    <input type="text" name="palabra" /><br/>
    <button type="submit">Verificar si es palindrome</button>
    <div>
        Resultado: ${palindrome}
    </div>
</form>