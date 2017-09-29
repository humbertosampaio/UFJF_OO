package Ex_03;

public class Carro extends Personagem
{
	protected float litrosCombustivel;
	
	public Carro(String nome)
	{
		super(nome);
		this.litrosCombustivel = 50;
		this.capacidade = 12;
	}

	@Override
	public void andar(int numeroCasas)
	{
		if (litrosCombustivel >= 10 && numeroCasas <= this.capacidade)
		{
			System.out.println("O personagem " + this.nome + " anda " + numeroCasas + " casas...");
			litrosCombustivel -= numeroCasas / 2;
		}
	}

	@Override
	public int getCapacidade()
	{
		return super.capacidade;
	}

}
