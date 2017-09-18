package Ex_06;

import java.text.NumberFormat;

public class ContaBancaria
{
	private String titular;
	private double saldo;
	NumberFormat numberFormat;

	public ContaBancaria(String titular, double saldo)
	{
		this.titular = titular;
		this.saldo = saldo;
		numberFormat = NumberFormat.getCurrencyInstance();
	}

	public void AlterarTitular(String titular)
	{
		this.titular = titular;
	}

	public double GetSaldo()
	{
		return saldo;
	}

	public void Depositar(double valor)
	{
		double novoValor = valor * 0.95;
		saldo += novoValor;
		System.out.println("O seu saldo aumentou em " + numberFormat.format(novoValor));
	}

	private boolean ValorValidoParaSaque(double valor)
	{
		return valor <= saldo;
	}

	public void Sacar(double valor)
	{
		if (ValorValidoParaSaque(valor))
		{
			saldo -= valor;
			System.out.println("O seu saldo diminuiu em " + numberFormat.format(valor));
		} 
		else
			System.out.println("ERRO. O valor inserido eh maior que o saldo.");
	}

	public void ImprimeDados()
	{
		System.out.println("\nTitular: " + titular + "\nSaldo: " + numberFormat.format(saldo) + "\n");
	}
}
