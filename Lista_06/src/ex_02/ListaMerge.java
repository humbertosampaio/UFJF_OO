package ex_02;

public class ListaMerge
{
	ListaOrdenadaInt lista;
	
	public ListaMerge()
	{
		lista = new ListaOrdenadaInt();
	}

	public ListaMerge merge(ListaOrdenadaInt lista1, ListaOrdenadaInt lista2)
	{
		lista.inserir(lista1);
		lista.inserir(lista2);
		return this;
	}
	
	public void imprimirLista()
	{
		System.out.println("Conteúdo da ListaMerge:");
		this.lista.imprimirLista();
		System.out.println();
	}
}
