package ex_04;

import java.util.Stack;

public class PilhaChar
{
	protected Stack<Character> pilha;
	
	public PilhaChar()
	{
		pilha = new Stack<Character>();
	}
	
	public PilhaChar(String s)
	{
		pilha = new Stack<Character>();
		empilha(s);
	}
	
	public void empilha(String texto)
	{
		char[] array = texto.toCharArray();
		for (char c : array)
			empilha(c);
	}
	
	public void empilha(char caractere)
	{
		pilha.push(caractere);	
	}
	
	public char desempilha()
	{
		return pilha.pop();
	}
	
	public void imprimirNaOrdemInversa()
	{
		while(!pilha.isEmpty())
			System.out.print(desempilha());
		System.out.println("\n");
	}
}
