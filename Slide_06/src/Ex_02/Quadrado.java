package Ex_02;

public class Quadrado extends Retangulo
{

	public void calcularArea(float lado)
	{
		super.area = lado * lado;
	}

	public void calcularPerimetro(float lado)
	{
		super.perimetro = 4 * lado;
	}
}
