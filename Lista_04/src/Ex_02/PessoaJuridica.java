package Ex_02;

public class PessoaJuridica extends Contribuinte
{
	private String cnpj;
	
	public PessoaJuridica(String nome, String cnpj, float rendaBruta)
	{
		super(nome, rendaBruta);
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica(String nome, String cnpj, double rendaBruta)
	{
		super(nome, (float)rendaBruta);
		this.cnpj = cnpj;
	}

	@Override
	protected float calculaImpostoDeRenda()
	{
		return super.rendaBruta * 0.1f;
	}

	@Override
	public void imprimeImpostoDeRenda()
	{
		System.out.println("Tipo de Contribuinte: Pessoa Jurídica");
		System.out.println("Nome: " + super.nome);
		System.out.println("Valor do imposto de renda = " + nf.format(this.calculaImpostoDeRenda()) + "\n");
	}
}