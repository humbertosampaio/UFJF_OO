package Ex_03;

public abstract class Personagem
{
	protected String nome;
	protected int capacidade;
	
	public Personagem(String nome)
	{
		this.nome = nome;
	}
	
	public abstract int getCapacidade();

	public abstract void andar(int numeroCasas);
}
