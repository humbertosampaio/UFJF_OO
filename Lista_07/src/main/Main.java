package main;

import java.io.EOFException;
import java.io.IOException;
import java.util.Random;

import ex_01.ListaNomes;
import ex_02.Tokenizer;
import ex_03.Finder;
import ex_04.Bingo;
import ex_05.CarroBomba;
import ex_05.CarroBomba.FogoException;
import ex_05.CarroBomba.SuperAquecimentoException;
import ex_07.SomeException;

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
		Main.exercicio05();
		Main.exercicio06();

		try
		{
			Main.exercicio07();
		}
		catch(IOException e)
		{
			System.out.println("Erro de entrada de dados na aplicação.");
		}

		Main.exercicio08();
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
		}while(!input.equals("n"));

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
		}while(!input.equals("n"));
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

	private static void exercicio05()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("Iteração " + String.format("%02d", i) + ": ");
			try
			{
				CarroBomba c = new CarroBomba();
				try
				{
					c.ligar();
					c.mover();
				}
				catch(SuperAquecimentoException e)
				{
					System.out.println("vai fundir o motor!!!");
				}
				finally
				{
					c.desligar();
				}
			}
			catch(FogoException e)
			{
				System.out.println("vai explodir!!!");
			}
			finally
			{
				System.out.println();
			}
		}
	}

	private static void exercicio06()
	{
		try
		{
			System.out.print("Dividendo: ");
			int a = r.readInt();
			System.out.print("Divisor: ");
			int b = r.readInt();

			if(a % b != 0)
				throw new Exception("Atenção! A divisão causa perda de informação!");

			System.out.println("Resultado: " + a / b);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Erro! Somente números inteiros são permitidos. Tente novamente.");
			exercicio06();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Erro! Divisão por 0!");
			exercicio06();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			exercicio06();
		}
	}

	/*
	 * Resumidamente, este método sorteia um inteiro de 1 a 4, e dependendo deste
	 * número, lança uma das exceções apresentadas.
	 * 
	 * O "throws IOException" no método serve como um aviso àqueles que o chamarão,
	 * de que existe a chance de esta exceção ocorrer, o que permite que o
	 * programador que utiliza-lo prepare adequadamente a aplicação para tratar este
	 * erro.
	 */
	private static void exercicio07() throws IOException
	{
		System.out.println("Bloco	1");
		try
		{
			System.out.println("Bloco	2");
			try
			{
				System.out.println("Bloco	3");
				try
				{
					switch(Math.abs(new Random().nextInt()) % 4 + 1)
					{
						default:
						case 1:
							throw new EOFException();
						case 2:
							throw new NullPointerException();
						case 3:
							throw new NumberFormatException();
						case 4:
							throw new IOException();
					}
				}
				catch(NumberFormatException e)
				{
					System.out.println("Trata	no	bloco	3");
				}
			}
			catch(NullPointerException e)
			{
				System.out.println("Trata	no	bloco	2");
			}
		}
		catch(EOFException e)
		{
			System.out.println("Trata	no	bloco	1");
		}
	}

	private static void exercicio08()
	{
		try
		{
			SomeException exception = new SomeException();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
