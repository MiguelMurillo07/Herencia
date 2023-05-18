package modelo;

public class Operaciones
{
    protected double x;
    protected double y;
    protected double resultado;


    public Operaciones(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double mostrarResultado()
    {
        return this.resultado;
    }

}

