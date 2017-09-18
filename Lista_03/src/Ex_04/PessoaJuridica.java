package Ex_04;

public class PessoaJuridica extends Pessoa
{
	private String cnpj;
	
	public PessoaJuridica(String cnpj, float rendaBruta)
	{
		super(rendaBruta);
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica(String cnpj, double rendaBruta)
	{
		super((float)rendaBruta);
		this.cnpj = cnpj;
	}
}