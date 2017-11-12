package ex_03;

import java.util.List;
import java.util.LinkedList;

public class Finder
{
	private List<String> palavras;
	private static int qtdPalavrasDuplicadas;

	public Finder(String str)
	{
		String tempStr = "";
		this.palavras = new LinkedList<String>();
		for(char c : str.toLowerCase().toCharArray())
		{
			if(Finder.ehValido(c))
				tempStr += c;
			else
			{
				if(!tempStr.isEmpty() && this.palavras.contains(tempStr))
					Finder.qtdPalavrasDuplicadas++;
				this.palavras.add(tempStr);
				tempStr = "";
			}
		}
		if(this.palavras.contains(tempStr))
			Finder.qtdPalavrasDuplicadas++;
		this.palavras.add(tempStr);

	}

	private static boolean ehValido(char c)
	{
		char[] charsValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		for(char ch : charsValidos)
			if(c == ch)
				return true;
		return false;
	}

	public int getQtdPalavrasDuplicadas()
	{
		return Finder.qtdPalavrasDuplicadas;
	}
}
