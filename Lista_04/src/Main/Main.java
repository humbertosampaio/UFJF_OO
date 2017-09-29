package Main;

import java.util.Scanner;

import Ex_01.*;
import Ex_02.*;
import Ex_03.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("#### Exerc�cio 01 ####");
		Professor p1 = new Professor("Professor 1", 2500, 10, 0);
		//System.out.println("Insira o nome, sal�rio em reais, n�mero de faltas e horas extras do professor:");	
		//Professor p1 = new Professor(s.nextLine(), s.nextFloat(), s.nextInt(), s.nextInt());
		p1.imprimirDados();
		//System.out.println("Insira o nome, sal�rio em reais, n�mero de faltas e horas extras do funcion�rio administrativo:");	
		//Professor fa1 = new Professor(s.nextLine(), s.nextFloat(), s.nextInt(), s.nextInt());
		FuncionarioAdministrativo fa1 = new FuncionarioAdministrativo("Funcion�rio Adminitrativo", 2000, 2, 8);
		fa1.imprimirDados();

		System.out.println("\n#### Exerc�cio 02 ####");
		PessoaFisica pf = new PessoaFisica("Pessoa F�sica", "123456789-76", 2000);
		PessoaJuridica pj = new PessoaJuridica("Pessoa Jur�dica", "987654321/0000", 30000);
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
		

		s.close();
	}

}
