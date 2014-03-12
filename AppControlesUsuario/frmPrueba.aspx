<%@ Page Language="C#" AutoEventWireup="true" CodeFile="frmPrueba.aspx.cs" Inherits="frmPrueba" %>
<%@ Register Src="Contador.ascx" TagName="Contador" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:Label ID="lblMensaje" runat="server" Text="Label"></asp:Label>
        <uc1:Contador id="Contador1" runat="server" OnNumeroNegativo="Contador_NumeroNegativo" Paso="1" NumeroInicial="4">
      </uc1:Contador>
    </div>
    </form>
</body>
</html>
