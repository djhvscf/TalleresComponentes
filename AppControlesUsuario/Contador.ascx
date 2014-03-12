<%@ Control Language="C#" AutoEventWireup="true" CodeFile="Contador.ascx.cs" Inherits="Contador" %>
<asp:Button ID="btnAbajo" runat="server" Text="<<" OnClick="btnAbajo_Click" />
<asp:Label ID="lblContador" runat="server" Width="50" Text="0"></asp:Label>
<asp:Button ID="btnArriba" runat="server" Text=">>" OnClick="btnArriba_Click" />
<input type="hidden" id="hidPaso" runat="server" value="3" />