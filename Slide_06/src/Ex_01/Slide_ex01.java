package Ex_01;

public class Slide_ex01
{
	public static void main(String[] args)
	{
		Soma s = new Soma();
		Divisao div = new Divisao();
		Subtracao sub = new Subtracao();
		Multiplicacao mult = new Multiplicacao();

		s.ajustaValores(10.25f, 39.75f);
		div.ajustaValores(25, 5);
		sub.ajustaValores(3, 10);
		mult.ajustaValores(10, 10);

		System.out.println("10.25 + 39.75 = " + s.calcular());
		System.out.println("25 / 5 = " + div.calcular());
		System.out.println("3 - 10 = " + sub.calcular());
		System.out.println("10 * 10 = " + mult.calcular());
	}

}
