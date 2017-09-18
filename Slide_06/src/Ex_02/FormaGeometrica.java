package Ex_02;

public class FormaGeometrica
{
	protected float area;
	protected float perimetro;

	public float getArea()
	{
		return area;
	}

	public float getPerimetro()
	{
		return perimetro;
	}

	public void imprimirDados()
	{
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimetro: " + this.getPerimetro());
	}

}
