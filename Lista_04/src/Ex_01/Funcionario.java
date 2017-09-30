package Ex_01;

public abstract class Funcionario
{
	protected String nome;
	protected float salarioBase;
	protected int faltas;
	protected int horasExtras;
	protected int diasMensaisDeTrabalho;
	protected int horasDiariasDeTrabalho;
	protected float valorHoraExtra;
	
	public Funcionario(String nome, float salarioBase, int faltas, int horasExtras)
	{
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.faltas = faltas;
		this.horasExtras = horasExtras;
	}
	
	public abstract float getSalario();

}
