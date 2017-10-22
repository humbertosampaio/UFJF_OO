package ex_01;

public class MatrizInteiros
{
	private int[][] matriz;

	public MatrizInteiros(int numeroLinhas, int numeroColunas)
	{
		this.matriz = new int[numeroLinhas][numeroColunas];
	}
	
	public void inserirElemento(int val, int linha, int coluna)
	{
		if((linha <= this.matriz.length) &&
			(coluna <= this.matriz[0].length))
			this.matriz[linha][coluna] = val;
		else
			System.out.println("ERRO. Tentativa de inserção de valor em uma posição inválida.");
	}
	
	public boolean eQuadrada()
	{
		return (matriz.length == matriz[0].length);
	}
	
	public int somaValor()
	{
		int soma = 0;
		
		for(int linha = 0; linha < matriz.length; linha++)
			for(int coluna = 0; coluna < matriz[0].length; coluna++)
				soma += matriz[linha][coluna];
		return soma;
	}
	
	public void encontraValor(int val)
	{		
		for(int linha = 0; linha < matriz.length; linha++)
			for(int coluna = 0; coluna < matriz[0].length; coluna++)
				if(matriz[linha][coluna] == val)
				{
					System.out.println("O valor foi encontrado na posição [" + linha + "][" + coluna + "].");
					return;
				}
		System.out.println("O valor não foi encontrado na Matriz.");
	}	
}
