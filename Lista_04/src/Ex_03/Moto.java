package Ex_03;

public class Moto extends TransporteDuasRodas
{
	private float litrosCombustivel;
	
	public Moto(String nome)
	{
		super(nome);
		this.capacidade = 6;
		this.litrosCombustivel = 50;
	}

	@Override
	public void andar(int numeroCasas)
	{
		if (litrosCombustivel > 5)
		{
			super.andar(numeroCasas);
			litrosCombustivel -= numeroCasas / 3;
		}
	}
}
