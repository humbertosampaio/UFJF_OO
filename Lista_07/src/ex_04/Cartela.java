package ex_04;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Cartela
{
	private Random randomizer;
	private Set<Integer> numerosRestantes;
	
	public Cartela(int qtdNumerosNaCartela, int maiorNumeroPossivel)
	{
		this.randomizer = new Random();
		this.numerosRestantes = new LinkedHashSet<>(qtdNumerosNaCartela);
		while(numerosRestantes.size() < qtdNumerosNaCartela)
			this.numerosRestantes.add(this.randomizer.nextInt(maiorNumeroPossivel) + 1);
	}
	
	public boolean marcarNumero(int numero)
	{
		return this.numerosRestantes.remove(numero);
	}
	
	public void imprimirNumeros()
	{
		System.out.println(this.numerosRestantes.toString());
	}
}
