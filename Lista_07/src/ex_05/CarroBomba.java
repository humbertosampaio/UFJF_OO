package ex_05;

import java.util.Random;

public class CarroBomba
{
	public class SuperAquecimentoException extends Exception
	{
	}

	public class FogoException extends Exception
	{
	}

	Random r = new Random();

	public void ligar()
	{
	}

	public void mover() throws SuperAquecimentoException, FogoException
	{
		/* 
		 * Resposta da pergunta do enunciado:
		 * Sempre será lançada a exceção FogoException pois o método Random.nextFloat
		 * utilizado apenas produz resultados entre 0 e 1.
		 */
		float temperatura = r.nextFloat();
		if(temperatura > 100.0)
		{
			throw new SuperAquecimentoException();
		}
		throw new FogoException();
	}

	public void desligar()
	{
		System.out.println("desligar o motor!!!");
	}

}
