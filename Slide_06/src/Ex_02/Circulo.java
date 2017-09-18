package Ex_02;

import java.lang.Math;

public class Circulo extends FormaGeometrica
{

	public void calcularArea(float raio)
	{
		super.area = (float) Math.PI * (raio * raio);
	}

	public void calcularPerimetro(float raio)
	{
		super.perimetro = 2 * (float) Math.PI * raio;
	}
}
