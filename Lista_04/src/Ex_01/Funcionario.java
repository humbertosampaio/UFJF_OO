package Ex_01;

import java.util.Calendar;

public abstract class Funcionario
{
	protected String nome;
	protected float salarioBase;
	protected int faltas;
	protected int horasExtras;
	protected int diasMensaisDeTrabalho;
	protected int horasDiariasDeTrabalho;
	protected float valorHoraExtra;
	protected FolhaPagamento folhaPagamento;
	
	public Funcionario(String nome, float salarioBase, int faltas, int horasExtras)
	{
		Calendar c = Calendar.getInstance();
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.faltas = faltas;
		this.horasExtras = horasExtras;
		this.folhaPagamento = new FolhaPagamento(String.valueOf(c.get(Calendar.YEAR)), String.valueOf(c.get(Calendar.MONTH)+1));
	}
	
	public abstract float getSalario();
	
	public abstract float getFolhaPagamento();
	
	public abstract void imprimirDados();

}
