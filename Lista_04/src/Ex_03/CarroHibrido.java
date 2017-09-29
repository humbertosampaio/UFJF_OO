package Ex_03;

public class CarroHibrido extends Carro
{
	private float nivelBateria;
	
	public CarroHibrido(String nome)
	{
		super(nome);
		nivelBateria = 100;
	}

	@Override
	public void andar(int numeroCasas)
	{
		if (this.nivelBateria < 2)
		{
			super.andar(numeroCasas);
		}
		else
		{
			System.out.println("O personagem " + this.nome + " anda " + numeroCasas + " casas...");
			nivelBateria -= numeroCasas * 5;
		}
	}
}
