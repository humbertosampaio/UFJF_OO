package Ex_02;

public class Pessoa
{
	private String nome;
	private Endereco endereco;
	
	public Pessoa(String nome, String rua, String numero, String bairro, String cidade)
	{
		this.nome = nome;
		this.endereco = new Endereco(rua, numero, bairro, cidade);
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public String consultarEndereco()
	{
		return endereco.consultarEndereco();
	}
	
	public void alterarEndereco(String rua, String numero, String bairro, String cidade)
	{
		endereco.alterarEndereco(rua, numero, bairro, cidade);
	}
	
	public void imprimeDadosCompletos()
	{
		System.out.println("- Nome: " + this.getNome());
		System.out.println("- Endereco: " + this.consultarEndereco());
	}
}
