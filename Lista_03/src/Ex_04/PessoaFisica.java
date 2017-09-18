package Ex_04;

public class PessoaFisica extends Pessoa
{
	private String cpf;

	public PessoaFisica(String cpf, float rendaBruta)
	{
		super(rendaBruta);
		this.cpf = cpf;
	}
	
	public PessoaFisica(String cpf, double rendaBruta)
	{
		super((float)rendaBruta);
		this.cpf = cpf;
	}
	
	@Override
	public float calculaImpostoDeRenda()
	{
		float imposto = 0;
		
		if(rendaBruta > 1500f && rendaBruta <= 2500f)
			imposto = rendaBruta * 0.075f;
		
		else if(rendaBruta > 2500 && rendaBruta <= 3750f)
			imposto = rendaBruta * 0.1f;
		
		else if(rendaBruta > 3750f && rendaBruta <= 4500f)
			imposto = rendaBruta * 0.15f;
		
		else if(rendaBruta > 4500f)
			imposto = rendaBruta * 0.22f;
		
		return imposto;
	}
	
	@Override
	public void imprimeImpostoDeRenda()
	{
		System.out.println("Valor do imposto de renda (Pessoa Física) = R$" + this.calculaImpostoDeRenda());
	}
}