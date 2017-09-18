package Ex_03;

public class Peixe extends Animal
{
	private String caracteristica;
	
	public Peixe()
	{
		super();
		super.ambiente = "Mar";
		super.numeroPatas = 0;
		super.cor = "Cinzento";	
	}

	public Peixe(String nome, String comprimento, String cor, String velocidade)
	{
		super(nome, comprimento, 0, cor, "Mar", velocidade);
		this.caracteristica = "Possui basbatanas e cauda";
	}
	
	public Peixe(String nome, String comprimento, String velocidade)
	{
		super(nome, comprimento, 0, "Cinzento", "Mar", velocidade);
		this.caracteristica = "Possui basbatanas e cauda";
	}
	
	@Override
	public void imprimeDados()
	{
		super.imprimeDados();
		System.out.println("Caracteristica: " + this.caracteristica);
	}
}
