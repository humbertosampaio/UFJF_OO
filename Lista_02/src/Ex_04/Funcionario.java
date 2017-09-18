package Ex_04;

import java.text.NumberFormat;

public class Funcionario
{
	private String nome;
	private String matricula;
	private String idade;
	private String cargo;
	private float salario;
	private NumberFormat nf;
	private static int numeroFuncionarios;
	
	public Funcionario()
	{
		salario = 1500.0f;
		nf = NumberFormat.getCurrencyInstance();
		Funcionario.numeroFuncionarios++;
	}
	
	public Funcionario(String nome, int idade)
	{
		this.nome = nome;
		this.idade = String.valueOf(idade);
		nf = NumberFormat.getCurrencyInstance();
		Funcionario.numeroFuncionarios++;
	}
	
	public Funcionario(String nome, String matricula, float salario)
	{
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		nf = NumberFormat.getCurrencyInstance();
		Funcionario.numeroFuncionarios++;
	}
	
	public String GetNome()
	{
		return nome;
	}

	public void SetNome(String nome)
	{
		this.nome = nome;
	}

	public String GetMatricula()
	{
		return matricula;
	}

	public void SetMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public String GetIdade()
	{
		return idade;
	}

	public void SetIdade(String idade)
	{
		if (Integer.parseInt(idade) > 0)
			this.idade = idade;
		else
			System.out.println("ERRO. Idade inválida.");
	}

	public String GetCargo()
	{
		return cargo;
	}

	public void SetCargo(String cargo)
	{
		this.cargo = cargo;
	}

	public float GetSalario()
	{
		return salario;
	}
	
	public void SetSalario(float novoSalario)
	{
		if(novoSalario > 900.0f)
			this.salario = novoSalario;
		else
			System.out.println("ERRO. O novo salário deve ser mais alto que o valor informado.");
	}

	public void ImprimeDados()
	{
		System.out.println("Nome: " + nome + ";");
		System.out.println("Matrícula: " + matricula + ";");
		System.out.println("Idade: " + idade + ";");
		System.out.println("Cargo: " + cargo + ";");
		System.out.println("Salário: " + nf.format(salario) + ";");
		System.out.println("Quantidade total de funcionários cadastrados: " + numeroFuncionarios + ".\n");
	}
}
