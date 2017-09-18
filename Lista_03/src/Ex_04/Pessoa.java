package Ex_04;

public class Pessoa
{
	protected float rendaBruta;
	
	public Pessoa(float rendaBruta)
	{
		if (rendaBruta >= 0)
			this.rendaBruta = rendaBruta;
		else
			System.out.println("ERRO. A renda não pode ser menor do que R$0,00");
	}

	public float calculaImpostoDeRenda()
	{
		return rendaBruta * 0.1f;
	}
	
	public void imprimeImpostoDeRenda()
	{
		if(this instanceof PessoaJuridica)
			System.out.println("Valor do imposto de renda (Pessoa Jurídica) = R$" + calculaImpostoDeRenda());

		if(this instanceof PessoaEspecial)
			System.out.println("Valor do imposto de renda (Pessoa Especial) = R$" + calculaImpostoDeRenda());
	}
}
