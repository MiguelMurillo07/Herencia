package modelo;

public class Resta extends Operaciones
{
    public Resta(double x, double y)
    {
        super(x,y);
    }

    public void Restar()
    {
        this.resultado = this.x - this.y;
    }

    public double getResultado()
    {
        return resultado;
    }
}
