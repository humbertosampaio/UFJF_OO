package ex_05;

import java.util.Stack;

import ex_04.*;

public class Palindromo extends PilhaChar
{	
	private String str;
	
	public Palindromo()
	{
		super();
		this.str = new String();
	}

	public Palindromo(String s)
	{
		super.pilha = new Stack<Character>();
		this.str = s;
	}
	
	public boolean verificaPalindromo()
	{
		// Limpando os caracteres não desejados da string
		String tempStr = "";
		for(char c : this.str.toCharArray())
		{
			if(Character.isAlphabetic(c))
				tempStr += c;
		}
		
		char[] array = tempStr.toCharArray();
		int i;
		for (i = 0; i < array.length / 2; i++)
		{
			char c = array[i];
			super.empilha(c);
		}
		
		if(array.length % 2 == 1)
			i++;
		
		while(i < array.length)
		{
			if(super.desempilha() != array[i])
				return false;
			i++;
		}
		
		return true;
	}
}
