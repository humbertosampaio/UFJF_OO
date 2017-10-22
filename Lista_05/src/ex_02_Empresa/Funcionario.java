package ex_02_Empresa;

import java.text.NumberFormat;

public class Funcionario
{
	private String nome;
	private float salario;
	private NumberFormat nf;

	public Funcionario(String nome, float salario)
	{
		nf = NumberFormat.getCurrencyInstance();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome()
	{
		return nome;
	}

	public float getSalario()
	{
		return salario;
	}

	public void setSalario(float salario)
	{
		this.salario = salario;
	}
	
	public void imprimeDadosFuncionario()
	{
		System.out.println("Dados do Funcionário:\nNome: " + this.nome);
		System.out.println("Salário: " + nf.format(this.salario));
	}
}
