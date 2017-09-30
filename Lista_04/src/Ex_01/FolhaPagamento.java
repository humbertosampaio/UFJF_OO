package Ex_01;

import java.text.NumberFormat;

public class FolhaPagamento
{
	private String texto;
	private String mes;
	private String ano;
	
	public FolhaPagamento(String ano, String mes)
	{
		this.texto = "";
		this.mes = mes;
		this.ano = ano;
	}
	
	private static String formatar(String s, int length) {
	    return String.format("%1$-" + length + "s", s);
	}
	
	public void adicionarFuncionario(Funcionario funcionario)
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		if(this.texto != null && !this.texto.isEmpty())
			this.texto += System.lineSeparator();
		this.texto += "Funcionário: " + formatar(funcionario.nome, 30) + 
						"Salário base: " + formatar(nf.format(funcionario.getSalario()), 20) +
						"Valor: " + nf.format(calculaValor(funcionario));
	}
	
	public float calculaValor(Funcionario funcionario)
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
	
	public void imprimirFolhaPagamento()
	{
		System.out.println("Folha de Pagamento de " + mes + "/" + ano + ":");
		System.out.println(this.texto + "\n");
	}
}
