package Main;

import Ex_01.*;
import Ex_02.*;
import Ex_03.*;

public class Main
{
	public static void main(String[] args)
	{
		Reader r = new Reader();
		
		System.out.println("#### Exerc�cio 01 ####");
		
		FolhaPagamento fp = new FolhaPagamento("2017", "08");
		
		System.out.println("Insira o nome, sal�rio em reais, n�mero de faltas e horas extras do professor:");	
		Professor p = new Professor(r.readString(), r.readFloat(), r.readInt(), r.readInt());
		
		System.out.println("Insira o nome, sal�rio em reais, n�mero de faltas e horas extras do funcion�rio administrativo:");	
		FuncionarioAdministrativo fa = new FuncionarioAdministrativo(r.readString(), r.readFloat(), r.readInt(), r.readInt());
		
		fp.adicionarFuncionario(p);
		fp.adicionarFuncionario(fa);
		fp.imprimirFolhaPagamento();

		
		
		System.out.println("\n#### Exerc�cio 02 ####");
		
		System.out.println("Insira o nome, o CPF e a renda bruta da Pessoa F�sica:");
		PessoaFisica pf = new PessoaFisica(r.readString(), r.readString(), r.readFloat());
		
		System.out.println("Insira o nome, CNPJ e renda bruta da Pessoa Jur�dica:");
		PessoaJuridica pj = new PessoaJuridica(r.readString(), r.readString(), r.readFloat());
		
		pf.imprimeImpostoDeRenda();
		pj.imprimeImpostoDeRenda();
		

		
		System.out.println("#### Exerc�cio 03 ####");
		
		Homem h = new Homem("Homem");
		TransporteDuasRodas tdr = new TransporteDuasRodas("Transporte de Duas Rodas");
		Carro c = new Carro("Carro");
		Atleta a = new Atleta("Atleta");
		Bicicleta b = new Bicicleta("Bicicleta");
		Moto m = new Moto("Moto");
		CarroHibrido ch = new CarroHibrido("Carro H�brido");
		
		h.andar(1);
		tdr.andar(3);
		c.andar(10);
		a.andar(2);
		b.andar(4);
		m.andar(8);
		ch.andar(7);
	}
}
