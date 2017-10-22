package ex_03;

import ex_05.*;

public class ContaCorrente extends Conta implements Tributavel
{

	public ContaCorrente(float saldo)
	{
		super(saldo);
	}
	
	@Override
	public void atualizarSaldo(float taxa)
	{
		super.atualizarSaldo(taxa * 2);
	}
	
	@Override
	public void depositar(float valor)
	{
		super.depositar(valor - 0.1f);
	}

	@Override
	public float calcularTributo()
	{
		return 0.01f;
	}

}
