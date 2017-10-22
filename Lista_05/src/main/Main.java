package main;

import ex_01.*;
import ex_02_Empresa.*;
import ex_03.*;

public class Main
{
	protected static void executarOperacoesConta(Conta c1, AtualizadorContas at_c1,
												 Conta c2, AtualizadorContas at_c2,
												 Conta c3, AtualizadorContas at_c3)
	{
		final float valorDeposito = 1000;
		c1.depositar(valorDeposito);
		c2.depositar(valorDeposito);
		c3.depositar(valorDeposito);
		
		at_c1.atualizar();
		at_c2.atualizar();
		at_c3.atualizar();

		c1.imprimirSaldo();
		c2.imprimirSaldo();
		c3.imprimirSaldo();
	}
	
	public static void main(String[] args)
	{
		Reader r = new Reader();
		
		System.out.println("###### Exercício 01 ######");
		System.out.print("Insira o número de linhas da matriz: ");
		int linhas = r.readInt();
		System.out.print("Insira o número de colunas da matriz: ");
		int colunas = r.readInt();

		MatrizInteiros m = new MatrizInteiros(linhas, colunas);

		for (int linha = 0; linha < linhas; linha++)
			for (int coluna = 0; coluna < colunas; coluna++)
				m.inserirElemento(linha + coluna, linha, coluna);

		System.out.print("A matriz ");
		if (!m.eQuadrada())
			System.out.print("não ");
		System.out.println("é quadrada.");

		System.out.print("Insira o valor que deseja encontrar na matriz: ");
		m.encontraValor(r.readInt());
		
		System.out.println("\n###### Exercício 02 #######");
		System.out.print("Digite o CNPJ da empresa: ");
		Empresa empresa = new Empresa(r.readString());
		
		Funcionario funcionario;
		char simNao;
		do {
			System.out.print("Deseja adicionar um funcionário à empresa? (S/N) ");
			simNao = r.readString().charAt(0);
			if(simNao == 'S')
			{
				System.out.print("Insira o nome do funcionário: ");
				String nomeFuncionario = r.readString();
				System.out.print("Insira o salário do funcionário: ");
				float salarioFuncionario = r.readFloat();
				funcionario = new Funcionario(nomeFuncionario, salarioFuncionario);
				empresa.adicionaFuncionario(funcionario);
			}
			else if(simNao != 'N')
				System.out.println("Opção inválida. Digite novamente.");
		} while(simNao != 'N');
		
		empresa.imprimeDadosEmpresa();
		System.out.print("\n");
		
		
		System.out.println("###### Exercício 03 ######");
		final float taxa = 0.1f;
		
		System.out.print("Insira o valor inicial da Conta: ");
		Conta c1 = new Conta(r.readFloat());
		System.out.print("Insira o valor inicial da Conta Poupança: ");
		ContaPoupanca cp1 = new ContaPoupanca(r.readFloat());
		System.out.print("Insira o valor inicial da Conta Corrente: ");
		ContaCorrente cc1 = new ContaCorrente(r.readFloat());		

		AtualizadorContas at_c1 = new AtualizadorContas(taxa, c1);
		AtualizadorContas at_cp1 = new AtualizadorContas(taxa, cp1);
		AtualizadorContas at_cc1 = new AtualizadorContas(taxa, cc1);
		
		executarOperacoesConta(c1, at_c1, cp1, at_cp1, cc1, at_cc1);
		
		System.out.print("\n");
		System.out.print("Insira o valor inicial da Conta: ");
		Conta c2 = new Conta(r.readFloat());
		System.out.print("Insira o valor inicial da Conta Poupança: ");
		Conta cp2 = new ContaPoupanca(r.readFloat());
		System.out.print("Insira o valor inicial da Conta Corrente: ");
		Conta cc2 = new ContaCorrente(r.readFloat());
		
		AtualizadorContas at_c2 = new AtualizadorContas(taxa, c2);
		AtualizadorContas at_cp2 = new AtualizadorContas(taxa, cp2);
		AtualizadorContas at_cc2 = new AtualizadorContas(taxa, cc2);
		
		executarOperacoesConta(c2, at_c2, cp2, at_cp2, cc2, at_cc2);	
	}
}
