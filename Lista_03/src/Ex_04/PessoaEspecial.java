package Ex_04;

public class PessoaEspecial extends Pessoa
{
	private String numeroSocial;
	
	public PessoaEspecial(String numeroSocial, float rendaBruta)
	{
		super(rendaBruta);
		this.numeroSocial = numeroSocial;
	}
	
	public PessoaEspecial(String numeroSocial, double rendaBruta)
	{
		super((float)rendaBruta);
		this.numeroSocial = numeroSocial;
	}
}