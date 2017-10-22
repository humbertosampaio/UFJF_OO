package ex_03;

public class Banco
{
	private Conta[] contas;
	private static int totalContas;
	private static int maxContas = 10;
	
	public Banco()
	{
		contas = new Conta[maxContas];
	}
	
	public void adicionarConta(Conta conta)
	{
		if(totalContas < maxContas)
			this.contas[totalContas] = conta;
		else
			System.out.println("ERRO. Número máximo de Contas atingido.");
	}

	public Conta getConta(int idConta)
	{
		return this.contas[idConta] != null ? this.contas[idConta] : null;
	}
	
	public int getTotalContas()
	{
		return Banco.totalContas;
	}
}
