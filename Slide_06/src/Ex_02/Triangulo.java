package Ex_02;

public class Triangulo extends FormaGeometrica
{

	public void calcularArea(float base, float altura)
	{
		super.area = (base * altura) / 2;
	}

	public void calcularPerimetro(float lado1, float lado2, float lado3)
	{
		super.perimetro = lado1 + lado2 + lado3;
	}

}
