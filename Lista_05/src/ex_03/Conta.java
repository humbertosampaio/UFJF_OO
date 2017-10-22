package ex_03;

import java.text.NumberFormat;

public class Conta
{
	private float saldo;
	NumberFormat nf;

	public Conta(float saldo)
	{
		this.saldo = saldo;
		nf = NumberFormat.getCurrencyInstance();
	}

	public float getSaldo()
	{
		return saldo;
	}
	
	public void depositar(float valor)
	{
		this.saldo += valor;
	}
	
	public void sacar(float valor)
	{
		if(valor <= this.saldo)
			saldo -= valor;
		else
			System.out.println("ERRO. O valor informado é maior que o saldo atual.");
	}
	
	public void atualizarSaldo(float taxa)
	{
		if(taxa > 0)
			this.saldo += saldo * taxa;
		else
			System.out.println("ERRO. A taxa deve ser maior que zero.");
	}

	public void imprimirSaldo()
	{
		if(this instanceof ContaPoupanca)
			System.out.print("[Conta Poupança]");
		else if(this instanceof ContaCorrente)
			System.out.print("[Conta Corrente]");
		else if(this instanceof Conta)
			System.out.print("[Conta]");
		
		System.out.println(" Saldo: " + nf.format(this.saldo));
	}
}
