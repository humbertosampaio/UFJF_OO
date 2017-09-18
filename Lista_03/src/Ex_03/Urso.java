package Ex_03;

public class Urso extends Mamifero
{
	private String alimentoPreferido;
	
	public Urso()
	{
		super();
		this.numeroPatas = 4;
		this.cor = "Castanho";
		this.alimentoPreferido = "Mel";
	}

	public Urso(String nome, String comprimento, String cor, String ambiente, String velocidade)
	{
		super(nome, comprimento, 4, cor, ambiente, velocidade);
		this.alimentoPreferido = "Mel";
	}

	public Urso(String nome, String comprimento, String cor, String velocidade)
	{
		super(nome, comprimento, 4, cor, velocidade);
		this.alimentoPreferido = "Mel";
	}
	
	@Override
	public void imprimeDados()
	{
		super.imprimeDados();
		System.out.println("Alimento preferido: " + this.alimentoPreferido);
	}

}
