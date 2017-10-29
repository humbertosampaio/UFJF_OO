package ex_01;

import java.util.LinkedList;

public class ListaConcatenada
{
	private LinkedList<Character> lista;
	
	public ListaConcatenada()
	{
		this.lista = new LinkedList<Character>();
	}
	
	public ListaConcatenada(String s)
	{
		this.lista = new LinkedList<Character>();
		this.concatenar(s);
	}
	
	public ListaConcatenada(char c)
	{
		this.concatenar(c);
	}
	
	public ListaConcatenada(LinkedList<Character> lista)
	{
		this.concatenar(lista);
	}
	
	public void concatenar(String s)
	{
		for(int i = 0; i < s.length(); i++)
			lista.add(s.charAt(i));
	}
	
	public void concatenar(char c)
	{
		this.lista.add(c);
	}

	public void concatenar(LinkedList<Character> lista)
	{
		this.lista.addAll(lista);
	}

	public void imprimirLista()
	{
		for (Character c : lista)
		{
			System.out.print(c);
		}
		System.out.println("\n");
	}
}
