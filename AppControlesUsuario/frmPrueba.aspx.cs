using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class frmPrueba : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        this.lblMensaje.Text = "";
    }

    protected void Contador_NumeroNegativo()
    {
        this.lblMensaje.Text = "No se pueden contar números negativos";
    }

}