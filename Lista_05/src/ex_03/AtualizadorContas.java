package ex_03;

public class AtualizadorContas
{
	private float taxa;
	private Conta conta;

	public AtualizadorContas(float taxa, Conta conta)
	{
		this.taxa = taxa;
		this.conta = conta;
	}
	
	public float getTaxa()
	{
		return this.taxa;
	}
	
	public void atualizar()
	{
		this.conta.atualizarSaldo(this.taxa);
	}
}
