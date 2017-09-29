package Ex_03;

public class TransporteDuasRodas extends Personagem
{

	public TransporteDuasRodas(String nome)
	{
		super(nome);
		this.capacidade = 3;
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
