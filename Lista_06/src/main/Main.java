package main;

import ex_01.*;
import ex_02.*;
import ex_04.*;
import ex_05.*;
import ex_06.FilaSupermercado;

public class Main
{
	static private Reader r;
	
	private static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	        if (!Character.isDigit(c)) 
	        	return false;
	    return true;
	}
	
	private static void preencherListaOrdenada(ListaOrdenadaInt lista)
	{
		String input;
		do
		{
			System.out.print("Insira um item na Lista de Inteiros, ou S para sair: ");
			input = r.readString();
			if(isNumeric(input))
				lista.inserir(Integer.parseInt(input));
			else if(!input.equals("S"))
				System.out.println("ERRO. O caractere inserido não é um número inteiro.");
			
		} while(!input.equals("S"));
	}
	
	public static void main(String[] args)
	{
		r = new Reader();
		System.out.println("##### Exercício 01 #####");
		System.out.println("Escreva a primeira cadeia de caracteres:");
		String listaChar1 = r.readString();
		ListaConcatenada listaChar = new ListaConcatenada(listaChar1);
		System.out.println("Escreva a cadeia de caracteres a ser concatenada:");
		listaChar.concatenar(r.readString());
		listaChar.imprimirLista();
		
		System.out.println("##### Exercício 02 #####");
		ListaMerge listaMerge = new ListaMerge();
		ListaOrdenadaInt listaOrdInt1 = new ListaOrdenadaInt();
		ListaOrdenadaInt listaOrdInt2 = new ListaOrdenadaInt();
		System.out.println("Lista de Inteiros 01");
		preencherListaOrdenada(listaOrdInt1);
		System.out.println("Lista de Inteiros 02");
		preencherListaOrdenada(listaOrdInt2);
		listaMerge.merge(listaOrdInt1, listaOrdInt2);
		listaMerge.imprimirLista();
		
		System.out.println("##### Exercício 03 #####");
		ListaOrdenadaInt listarandom = new ListaOrdenadaInt();
		listarandom.insereNumerosAleatorios();
		listarandom.imprimirLista();
		
		System.out.println("##### Exercício 04 #####");
		System.out.println("Insira a cadeia de caracteres a ser imprimida na ordem inversa:");
		PilhaChar p = new PilhaChar(r.readString());
		p.imprimirNaOrdemInversa();
		
		System.out.println("##### Exercício 05 #####");
		System.out.println("Insira o palíndromo:");
		Palindromo pal = new Palindromo(r.readString());
		System.out.print("A cadeia de caracteres inserida ");
		if(!pal.verificaPalindromo())
			System.out.print("NÃO ");
		System.out.println("É palíndroma.");
		
		System.out.println("##### Exercício 06 #####");
		FilaSupermercado filaSupermercado = new FilaSupermercado();
		filaSupermercado.processarFila(720);
	}
}
