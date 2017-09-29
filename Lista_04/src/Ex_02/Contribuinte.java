package Ex_02;

import java.text.NumberFormat;

public abstract class Contribuinte
{
	protected String nome;
	protected float rendaBruta;
	NumberFormat nf;
	
	public Contribuinte(String nome, float rendaBruta)
	{
		this.nome = nome;
		if (rendaBruta >= 0)
			this.rendaBruta = rendaBruta;
		else
			System.out.println("ERRO. A renda não pode ser menor do que R$0,00");
		
		nf = NumberFormat.getCurrencyInstance();
	}

	protected abstract float calculaImpostoDeRenda();
	
	public abstract void imprimeImpostoDeRenda();
}
