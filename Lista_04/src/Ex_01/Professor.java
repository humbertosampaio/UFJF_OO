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
		super.folhaPagamento.setSalarioFinal(this.getFolhaPagamento());
	}
	
	@Override
	public float getSalario()
	{
		return super.salarioBase;
	}

	@Override
	public float getFolhaPagamento()
	{
		return this.calculaFolhaPagamento();
	}
	
	public float calculaFolhaPagamento()
	{
		float valorHoraDeTrabalho = salarioBase / (diasMensaisDeTrabalho * horasDiariasDeTrabalho);
		float salarioFinal = super.salarioBase;
		salarioFinal += valorHoraDeTrabalho * valorHoraExtra * horasExtras;	
		return salarioFinal;
	}
	
	@Override
	public void imprimirDados()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		String mesAno = this.folhaPagamento.getMes() + "/" + this.folhaPagamento.getAno();
		System.out.println("Salário base: R$" + super.salarioBase);
		System.out.println("Folha de pagamento do mês " + mesAno + ": " + nf.format(this.folhaPagamento.getSalarioFinal()));
	}
}
