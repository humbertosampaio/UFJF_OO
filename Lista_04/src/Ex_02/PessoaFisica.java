package Ex_02;

public class PessoaFisica extends Contribuinte
{
	private String cpf;

	public PessoaFisica(String nome, String cpf, float rendaBruta)
	{
		super(nome, rendaBruta);
		this.cpf = cpf;
	}
	
	public PessoaFisica(String nome, String cpf, double rendaBruta)
	{
		super(nome, (float)rendaBruta);
		this.cpf = cpf;
	}
	
	@Override
	protected float calculaImpostoDeRenda()
	{
		float imposto = 0;
		
		if(rendaBruta > 1400 && rendaBruta <= 2100)
			imposto = rendaBruta * 0.1f;
		
		else if(rendaBruta > 2100 && rendaBruta <= 2800)
			imposto = rendaBruta * 0.15f;
		
		else if(rendaBruta > 2800 && rendaBruta <= 3600)
			imposto = rendaBruta * 0.25f;
		
		else if(rendaBruta > 3600)
			imposto = rendaBruta * 0.3f;
		
		return imposto;
	}
	
	@Override
	public void imprimeImpostoDeRenda()
	{
		System.out.println("Tipo de Contribuinte: Pessoa Física");
		System.out.println("Nome: " + super.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Valor do imposto de renda: " + nf.format(this.calculaImpostoDeRenda()) + "\n");
	}
}