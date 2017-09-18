package Ex_02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Compra
{
	private Pessoa pessoa;
	private Produto produto;
	private int quantidade;
	private Date data;
	
	public Compra(String nomeProduto, String nomeComprador, String rua, String numero, 
					String bairro, String cidade, Date dataDaCompra, int quantidade)
	{
		this.pessoa = new Pessoa(nomeComprador, rua, numero, bairro, cidade);
		this.produto = new Produto(nomeProduto, quantidade);
		this.data = new Date();
		this.quantidade = quantidade;
	}
	
	public Compra(Pessoa pessoa, Produto produto, Date dataDaCompra, int quantidade)
	{
		this.pessoa = pessoa;
		this.produto = produto;
		this.data = dataDaCompra;
		this.quantidade = quantidade;
	}
	
	public void comprar()
	{
		if(verificarCompra(produto, quantidade))
		{
			int qtdComprada = quantidade;
			produto.setQuantidade(produto.getQuantidade() - qtdComprada);
			System.out.println("Foi(foram) debitada(s) " + qtdComprada + " unidade(s) do produto " + produto.getNome());
		}
		else
		{
			System.out.println("ERRO. A quantidade solicitada eh maior que a em estoque para este produto.\n");
			produto.imprimeDadosCompletos();
		}
	}
	
	public boolean verificarCompra(Produto produto, int quantidade)
	{	
		return quantidade <= produto.getQuantidade();
	}
	
	public void imprimeDadosCompra()
	{
		System.out.println("Dados do comprador:");
		pessoa.imprimeDadosCompletos();
		System.out.print("\n");
		
		System.out.println("Dados do produto comprado:");
		produto.imprimeDadosCompletos();
		System.out.print("\n");
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("Dados da compra:");
		System.out.println("- Data: " + dateFormat.format(data));
		System.out.println("- Quantidade: " + quantidade + " unidade(s)");
	}
	
	
}
