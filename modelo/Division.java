package modelo;

public class Division extends Operaciones
{
    public Division(double x, double y)
    {
        super(x,y);
    }
    
    public void Dividir()
    {
        this.resultado = this.x / this.y;
    }    

    public double getResultado()
    {
        return resultado;
    }
}
