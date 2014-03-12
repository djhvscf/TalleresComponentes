using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Contador : System.Web.UI.UserControl
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void btnAbajo_Click(object sender, EventArgs e)
    {
        int cont;
        cont = int.Parse(this.lblContador.Text);
        if (cont > 0)
        {
            cont -= Paso;
            this.lblContador.Text = cont.ToString();
        }
        else
        {
            NumeroNegativo();
        }
    }

    protected void btnArriba_Click(object sender, EventArgs e)
    {
        int cont;
        cont = int.Parse(this.lblContador.Text);
        cont += Paso;
        this.lblContador.Text = cont.ToString();
    }

    public delegate void NumeroNegativoEventHandler();
    public event NumeroNegativoEventHandler NumeroNegativo;

    public int Paso
    {
        set
        {
            hidPaso.Value = value.ToString();
        }
        get
        {
            return int.Parse(hidPaso.Value);
        }
    }

    public int NumeroInicial
    {
        set
        {
            lblContador.Text = value.ToString();
        }
        get
        {
            return int.Parse(lblContador.Text);
        }
    }

}