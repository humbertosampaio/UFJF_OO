package ex_02_Empresa;

public class Empresa
{
	private static int maxFuncionarios = 10;
	private static int qtdAtualFuncionarios;
	private String cnpj;
	private Funcionario[] funcionarios;
	
	public Empresa(String cnpj)
	{
		this.cnpj = cnpj;
		this.funcionarios = new Funcionario[maxFuncionarios];
	}

	public void adicionaFuncionario(Funcionario funcionario)
	{
		if(qtdAtualFuncionarios <= maxFuncionarios)
			this.funcionarios[qtdAtualFuncionarios] = funcionario;
		Empresa.qtdAtualFuncionarios++;
	}
	
	public void adicionaFuncionario(Funcionario[] funcionarios)
	{
		for(int i = 0; i < funcionarios.length; i++)
			this.adicionaFuncionario(funcionarios[i]);
	}
	
	public void imprimeDadosEmpresa()
	{
		System.out.println("\nDados da Empresa:\nCNPJ: " + this.cnpj);
		for(int i = 0; i < qtdAtualFuncionarios; i++)
			if(funcionarios[i] != null)
				funcionarios[i].imprimeDadosFuncionario();
	}
}
