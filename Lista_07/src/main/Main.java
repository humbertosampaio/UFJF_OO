package main;

import ex_01.ListaNomes;
import ex_02.Tokenizer;
import ex_03.Finder;
import ex_04.Bingo;

public class Main
{
	private static Reader r;
	
	public static void main(String[] args)
	{	
		Main.r = new Reader();
		Main.exercicio01();
		Main.exercicio02();
		Main.exercicio03();
		Main.exercicio04();		
	}
	
	private static void exercicio01()
	{
		System.out.println("##### Exercício 01 #####");
		ListaNomes listaNomes = new ListaNomes();
		String input, nome;
		
		do 
		{
			System.out.print("Deseja adicionar um nome à lista? (S/N) ");
			input = r.readString().toLowerCase();
			if(input.equals("s"))
			{
				System.out.print("Nome: ");
				listaNomes.adicionar(r.readString());
			}
			else if(!input.equals("n"))
				System.out.println("ERRO. Caractere inválido.");
		} while(!input.equals("n"));
		
		do
		{
			System.out.print("Deseja verificar a existência de um nome na lista? (S/N) ");
			input = r.readString();
			if(input.equals("s"))
			{
				System.out.print("Nome: ");
				nome = r.readString();
				if(listaNomes.buscar(nome))
					System.out.println("O nome " + nome + " ESTÁ na lista.");
				else
					System.out.println("O nome " + nome + " NÃO ESTÁ na lista.");
			}
			else if(!input.equals("n"))
				System.out.println("ERRO. Caaractere inválido.");
		} while(!input.equals("n"));
	}
	
	private static void exercicio02()
	{
		System.out.println("\n##### Exercício 02 #####");
		System.out.println("Insira a frase a ser separada:");
		Tokenizer t = new Tokenizer(r.readString());
		System.out.println("Frase separada e em ordem alfabética");
		t.imprimirEmOrdemAlfabetica();
	}
	
	private static void exercicio03()
	{
		System.out.println("\n##### Exercício 03 #####");
		System.out.println("Insira a frase:");
		Finder f = new Finder(r.readString());
		System.out.println("A frase inserida possui " + f.getQtdPalavrasDuplicadas() + " palavras duplicadas.");
	}
	
	private static void exercicio04()
	{
		System.out.println("\n##### Exercício 04 #####");
		final int qtdParticipantes = 2;
		final int qtdNumerosNaCartela = 10;
		final int maiorNumeroDaCartela = 25;
		Bingo bingo = new Bingo(qtdParticipantes, qtdNumerosNaCartela, maiorNumeroDaCartela);
		for(int i = 1; i <= qtdParticipantes; i++)
		{
			System.out.print("Insira o nome do participante " + i + ": ");
			bingo.adicionarParticipante(Main.r.readString());
		}
		bingo.iniciarBingo();
	}

}
