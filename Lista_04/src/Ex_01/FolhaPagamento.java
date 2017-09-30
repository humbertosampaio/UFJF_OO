package Ex_01;

import java.util.Dictionary;

public class FolhaPagamento
{
	private float salarioFinal;
	private Funcionario funcionario;
	private String mes;
	private String ano;
	
	public FolhaPagamento(String ano, String mes, Funcionario funcionario)
	{
		this.funcionario = funcionario;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String getMes()
	{
		return mes;
	}
	
	public String getAno()
	{
		return ano;
	}

	public float getSalarioFinal()
	{
		return salarioFinal;
	}
	
	public float getValorFolhaPagamento(Funcionario funcionario)
	{
		float salarioFinal = 0;
		
		if(funcionario instanceof Professor)
		{
			float valorHoraDeTrabalho = funcionario.salarioBase / (funcionario.diasMensaisDeTrabalho * funcionario.horasDiariasDeTrabalho);
			salarioFinal = funcionario.salarioBase;
			salarioFinal += valorHoraDeTrabalho * funcionario.valorHoraExtra * funcionario.horasExtras;
		}
		else if(funcionario instanceof FuncionarioAdministrativo)
		{
			float valorHoraDeTrabalho = funcionario.salarioBase / (funcionario.diasMensaisDeTrabalho * funcionario.horasDiariasDeTrabalho);
			salarioFinal = funcionario.salarioBase;
			salarioFinal -= valorHoraDeTrabalho * funcionario.horasDiariasDeTrabalho * funcionario.faltas;
			salarioFinal += valorHoraDeTrabalho * funcionario.valorHoraExtra * funcionario.horasExtras;
		}

		return salarioFinal;
	}
	
	public void imprimeDados()
	{
		
	}
}
