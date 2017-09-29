package Ex_03;

public class Homem extends Personagem
{

	public Homem(String nome)
	{
		super(nome);
		this.capacidade = 1;
	}

	@Override
	public void andar(int numeroCasas)
	{
		if (numeroCasas <= this.capacidade)
		{
			System.out.println("O personagem " + this.nome + " anda " + numeroCasas + " casas...");
		}
	}

	@Override
	public int getCapacidade()
	{
		return super.capacidade;
	}

}
