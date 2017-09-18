package Ex_02;

import java.text.NumberFormat;
import java.util.Date;

public class Venda
{
	private static int qtdTotalVendidas;
	private static float lucroTotal;
	private NumberFormat numberFormat;
	
	private String localidade;
	private float preco;
	private String codigo;
	private String descricao;
	private int qtdEmEstoque;
	private int qtdVendida;
	private Date data;
	private float lucroLocal;
	
	public Venda(String localidade, float preco, String codigo, String descricao, int qtdEmEstoque, int qtdVendida)
	{
		if(qtdEmEstoque > 0 && qtdVendida > 0)
		{
			numberFormat = NumberFormat.getCurrencyInstance();
			
			this.localidade = localidade;
			this.preco = preco;
			this.codigo = codigo;
			this.descricao = descricao;
			this.qtdEmEstoque = qtdEmEstoque;
			this.qtdVendida = qtdVendida;
			this.data = new Date();
			this.lucroLocal += preco * qtdVendida * 0.7;
			
			Venda.qtdTotalVendidas += qtdVendida;
			Venda.lucroTotal += preco * qtdVendida * 0.7;
		}
	}
	
	public void Vender(int qtd)
	{
		if(qtd <= qtdEmEstoque)
		{
			qtdVendida += qtd;
			qtdEmEstoque -= qtd;
			lucroLocal += preco * qtd * 0.7;
			Venda.qtdTotalVendidas += qtd;
			Venda.lucroTotal += preco * qtd * 0.7;
			
			System.out.println("Você realizou a venda de " + qtd + " unidade(s) do produto \"" + descricao + "\", de código \"" + codigo + "\".");
			System.out.println("O lucro obtido com a venda foi de " + numberFormat.format(Venda.lucroTotal) + ".");
		}
		else
			System.out.println("ERRO. A quantidade informada é maior que a quantidade em estoque.");
		
	}
	
	public void ObterEstatisticasLocais()
	{
		System.out.println("Localidade: " + localidade + " / Lucro na localidade: " + numberFormat.format(lucroLocal) + ".");
	}
	
	public static void ObterEstatisticasGerais()
	{
		System.out.println("Total de peças vendidas: " + qtdTotalVendidas + ".");
		System.out.println("Lucro total obtido: " + NumberFormat.getCurrencyInstance().format(lucroTotal) + ".");
	}

}
