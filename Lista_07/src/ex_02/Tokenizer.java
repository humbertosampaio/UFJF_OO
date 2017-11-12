package ex_02;

import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Tokenizer
{
	private Set<String> listaTokens;
	private StringTokenizer tokenizer;

	public Tokenizer(String input)
	{
		this.tokenizer = new StringTokenizer(input);
		this.listaTokens = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		this.popularTreeSet();
	}
	
	private void popularTreeSet()
	{
		while(tokenizer.hasMoreTokens())
			listaTokens.add(tokenizer.nextToken());
	}
	
	public void imprimirEmOrdemAlfabetica()
	{
		for(String s : listaTokens)
			System.out.println(s);
	}
	

}
