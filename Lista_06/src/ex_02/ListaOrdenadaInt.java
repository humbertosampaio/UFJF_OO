package ex_02;

import java.util.*;

public class ListaOrdenadaInt
{
	private LinkedList<Integer> listaOrd;
	
	public ListaOrdenadaInt()
	{
		listaOrd = new LinkedList<Integer>();
	}

	public void inserir(int valor)
	{
		listaOrd.add(valor);
		ordenarLista();
	}
	
	public void inserir(ListaOrdenadaInt novaLista)
	{
		listaOrd.addAll(novaLista.listaOrd);
		ordenarLista();
	}
	
	private void ordenarLista()
	{
		Collections.sort(listaOrd);
	}
	
	// Exercício 03 - Início
	/****************************************
	 * Insere 25 numeros aleatorios na lista
	 ****************************************/
	public void insereNumerosAleatorios()
	{
		Random generator = new Random();
		for(int i = 0; i < 25; i++)
			listaOrd.add(generator.nextInt(101));
		ordenarLista();
	}
	
	public int getSomaDeTodosElementos()
	{
		int soma = 0;
		for(int i = 0; i < listaOrd.size(); i++)
			soma += listaOrd.get(i);
		return soma;
	}
	
	public float getMediaDeTodosElementos()
	{
		return (float)getSomaDeTodosElementos() / listaOrd.size();
	}
	// Exercício 04 - Fim
	
	public void imprimirLista()
	{
		System.out.print("[ ");
		for(int i = 0; i < listaOrd.size(); i++)
			System.out.print(listaOrd.get(i) + " ");
		System.out.println("]");
		System.out.println();
	}
}
