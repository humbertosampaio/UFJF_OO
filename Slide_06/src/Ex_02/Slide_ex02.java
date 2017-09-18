package Ex_02;

public class Slide_ex02
{
	public static void main(String[] args)
	{
		Circulo c = new Circulo();
		Triangulo t = new Triangulo();
		Retangulo r = new Retangulo();
		Quadrado q = new Quadrado();

		c.calcularArea(10);
		c.calcularPerimetro(10);

		t.calcularArea(10, 15);
		t.calcularPerimetro(10, 15, 20);

		r.calcularArea(10, 20);
		r.calcularPerimetro(10, 20);

		q.calcularArea(10);
		q.calcularPerimetro(10);

		System.out.println("Circulo");
		c.imprimirDados();

		System.out.println("Quadrado");
		q.imprimirDados();

		System.out.println("Retangulo");
		r.imprimirDados();

		System.out.println("Triangulo");
		t.imprimirDados();
	}

}
