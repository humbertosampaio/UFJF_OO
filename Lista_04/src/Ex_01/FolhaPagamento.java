package Ex_01;

public class FolhaPagamento
{
	private float salarioFinal;
	private String mes;
	private String ano;
	
	public FolhaPagamento(String ano, String mes)
	{
		this.mes = mes;
		this.ano = ano;
	}
	
	public String getMes()
	{
		return mes;
	}
	
	public String getAno()
	{
		return ano;
	}

	public float getSalarioFinal()
	{
		return salarioFinal;
	}

	public void setSalarioFinal(float salarioFinal)
	{
		this.salarioFinal = salarioFinal;
	}
}
