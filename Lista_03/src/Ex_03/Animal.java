package Ex_03;

public class Animal
{
	protected static int numeroDeAnimais;
	
	protected String nome;
	protected String comprimento;
	protected int numeroPatas;
	protected String cor;
	protected String ambiente;
	protected String velocidade;
	
	public Animal()
	{ 
		if (numeroDeAnimais <= 10)
		{
			System.out.println("Novo numero de animais no zoologico: " + Animal.numeroDeAnimais);
			numeroDeAnimais++;
		}
		else
			System.out.println("ERRO. Numero maximo de animais atingido.");
	}
	
	public Animal(String nome, String comprimento, int numeroPatas, 
					String cor, String ambiente, String velocidade)
	{
		if (numeroDeAnimais <= 10)
		{
			this.nome = nome;
			this.comprimento = comprimento;
			this.numeroPatas = numeroPatas;
			this.cor = cor;
			this.ambiente = ambiente;
			this.velocidade = velocidade;
			numeroDeAnimais++;
		}
		else
			System.out.println("ERRO. Numero maximo de animais atingido.");
	}
	
	public void imprimeDados()
	{
		System.out.println("\nNome: " + this.nome);
		System.out.println("Comprimento: " + this.comprimento + " cm");
		System.out.println("Numero de patas: " + this.numeroPatas);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ambiente: " + this.ambiente);
		System.out.println("Velocidade: " + this.velocidade + " m/s");
	}
}
