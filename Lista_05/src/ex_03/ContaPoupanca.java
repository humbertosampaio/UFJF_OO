package ex_03;

import ex_05.Tributavel;

public class ContaPoupanca extends Conta implements Tributavel
{

	public ContaPoupanca(float saldo)
	{
		super(saldo);
	}

	@Override
	public void atualizarSaldo(float taxa)
	{
		super.atualizarSaldo(taxa * 3);
	}

	@Override
	public float calcularTributo()
	{
		return 50;
	}
}
