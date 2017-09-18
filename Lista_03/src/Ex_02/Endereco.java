package Ex_02;

public class Endereco
{
	private String rua, numero, bairro, cidade;
	
	public Endereco(String rua, String numero, String bairro, String cidade)
	{
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	private boolean isNullOrEmpty(String s)
	{
		return s == null || s.trim().isEmpty();
	}
	
	public String consultarEndereco()
	{
		return "Rua " + rua + ", " + numero + " - Bairro " + bairro + " (" + cidade + ")";
	}
	
	public void alterarEndereco(String rua, String numero, String bairro, String cidade)
	{
		if(!isNullOrEmpty(rua))
			this.rua = rua;
		if(!isNullOrEmpty(numero))
			this.numero = numero;
		if(!isNullOrEmpty(bairro))
			this.bairro = bairro;
		if(!isNullOrEmpty(cidade))
			this.cidade = cidade;
	}
}
