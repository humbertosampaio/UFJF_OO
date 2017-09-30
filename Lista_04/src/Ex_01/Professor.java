package Ex_01;

import java.text.NumberFormat;

public class Professor extends Funcionario
{
	public Professor(String nome, float salarioBase, int faltas, int horasExtras)
	{
		super(nome, salarioBase, faltas, horasExtras);
		this.diasMensaisDeTrabalho = 12;
		this.horasDiariasDeTrabalho = 8;
		this.valorHoraExtra = 2.5f;
	}
	
	@Override
	public float getSalario()
	{
		return super.salarioBase;
	}
	
	@Override
	public void imprimirDados()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		
	}
}
