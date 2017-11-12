package ex_04;

public class Participante
{
	private String nome;
	private Cartela cartela;
	private int qtdAcertos;

	public Participante(String nome, int qtdNumerosCartela, int maiorNumeroPossivelCartela)
	{
		this.nome = nome;
		this.qtdAcertos = 0;
		this.cartela = new Cartela(qtdNumerosCartela, maiorNumeroPossivelCartela);
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public int getQtdAcertos()
	{
		return this.qtdAcertos;
	}
	
	public void imprimirNumerosCartela()
	{
		System.out.print("Cartela do Participante " + this.nome + ": ");
		this.cartela.imprimirNumeros();
	}

	public boolean marcarNumero(int numeroDaRodada)
	{
		if(this.cartela.marcarNumero(numeroDaRodada))
		{
			this.qtdAcertos++;
			return true;
		}
		return false;
	}
}
