package ex_01;

import java.util.*;

public class ListaNomes
{
	private Set<String> listaNomes;

	public ListaNomes()
	{
		this.listaNomes = new HashSet<String>();
	}

	public void adicionar(String nome)
	{
		this.listaNomes.add(nome);
	}
	
	public void adicionar(Set<String> nomes)
	{
		Iterator<String> i = nomes.iterator();
		while(i.hasNext())
			this.adicionar(i.next());
	}
	
	public boolean buscar(String nome)
	{
		return listaNomes.contains(nome);
	}
	
}
