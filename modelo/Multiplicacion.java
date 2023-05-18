package modelo;

public class Multiplicacion extends Operaciones
{
    public Multiplicacion(double x, double y)
    {
        super(x,y);
    }
    
    public void Multiplicar()
    {
        this.resultado = this.x * this.y;
    }    

    public double getResultado()
    {
        return resultado;
    }
}
