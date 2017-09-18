package Ex_03;

public class Mamifero extends Animal
{	
	public Mamifero()
	{
		super();
		super.ambiente = "Terra";
	}

	public Mamifero(String nome, String comprimento, int numeroPatas, String cor, String ambiente, String velocidade)
	{
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
	}
	
	public Mamifero(String nome, String comprimento, int numeroPatas, String cor, String velocidade)
	{
		super(nome, comprimento, numeroPatas, cor, "Terra", velocidade);
	}
}
