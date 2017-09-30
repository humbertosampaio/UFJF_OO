package Ex_01;

import java.text.NumberFormat;

public class FuncionarioAdministrativo extends Funcionario
{
	public FuncionarioAdministrativo(String nome, float salarioBase, int faltas, int horasExtras)
	{		
		super(nome, salarioBase, faltas, horasExtras);
		super.diasMensaisDeTrabalho = 30;
		super.horasDiariasDeTrabalho = 8;
		super.valorHoraExtra = 1.5f;
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
