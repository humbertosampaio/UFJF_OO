package ex_06;

public class Cliente
{
	private String nome;
	private int tempoRestanteAtendimento;
	private boolean estaEmAtendimento;
	
	public Cliente(String nome)
	{
		this.nome = nome;
	}
	
	public Cliente(String nome, int minutosDeAtendimento, boolean estaEmAtendimento)
	{
		this.nome = nome;
		this.tempoRestanteAtendimento = minutosDeAtendimento;
		this.estaEmAtendimento = estaEmAtendimento;
	}

	public String getNome()
	{
		return nome;
	}
	
	public int getTempoRestanteAtentimento()
	{
		return this.tempoRestanteAtendimento;
	}
	
	public void setTempoRestanteAtendimento(int minutosRestantes)
	{
		this.tempoRestanteAtendimento = minutosRestantes;
	}
	
	public void decrementarTempoRestanteAtendimento()
	{
		this.tempoRestanteAtendimento--;
	}

	public boolean isEstaEmAtendimento()
	{
		return estaEmAtendimento;
	}

	public void setEstaEmAtendimento(boolean estaEmAtendimento)
	{
		this.estaEmAtendimento = estaEmAtendimento;
	}
}
