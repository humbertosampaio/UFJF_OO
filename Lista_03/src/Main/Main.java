package Main;

import java.util.Date;

import Ex_01.*;
import Ex_02.*;
import Ex_03.*;
import Ex_04.*;

public class Main
{
	
	public static void main(String[] args)
	{
		// Exerício 02
		System.out.println("#### Exercício 02 ####");
		Produto prod1 = new Produto("Caneta esferiografica", 50);
		Produto prod2 = new Produto("Caixa de lapis", 10);
		
		Ex_02.Pessoa pess1 = new Ex_02.Pessoa("Ronaldo", "Jose Lourenco Kelmer", "1005", "Sao Pedro", "Juiz de Fora");
		Ex_02.Pessoa pess2 = new Ex_02.Pessoa("Marta", "das Palmeiras", "2365", "Centro", "Belo Horizonte");
		
		Compra compra = new Compra(pess1, prod2, new Date(), 9);
		compra.comprar();
		compra.imprimeDadosCompra();
		
		
		// Exercicio 03
		System.out.println("\n#### Exercicio 03 ####");
		Mamifero camelo = new Mamifero("Camelo", "150", 4, "Amarelo", "2,0");
		Peixe tubarao = new Peixe("Tubarao", "300", "1,5");
		Urso ursoCanada = new Urso("Urso do Canada", "180", "Vermelho", "0,5");
		
		camelo.imprimeDados();
		tubarao.imprimeDados();
		ursoCanada.imprimeDados();
		
		// Exercicio 04
		System.out.println("\n#### Exercício 04 ####");
		PessoaJuridica pj = new PessoaJuridica("987654321", 20000.00);
		PessoaEspecial pe = new PessoaEspecial("73452766", 2000.00);
		PessoaFisica pf = new PessoaFisica("123456789-12", 1000.00);
		
		pj.imprimeImpostoDeRenda();
		pe.imprimeImpostoDeRenda();
		pf.imprimeImpostoDeRenda();	
		
	}
	
}
