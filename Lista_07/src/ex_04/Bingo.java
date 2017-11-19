package ex_04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Bingo
{
	private List<Participante> listaParticipantes;
	private List<String> listaVencedores;
	private Set<Integer> numerosJaSorteados;
	private Random randomizer;
	private int qtdParticipantes;
	private int qtdNumerosNaCartela;
	private int maiorNumeroCartela;
	private int maxQtdAcertos;

	public Bingo(int qtdParticipantes, int qtdNumerosNaCartela, int maiorNumeroCartela)
	{
		this.qtdParticipantes = qtdParticipantes;
		this.qtdNumerosNaCartela = qtdNumerosNaCartela;
		this.maiorNumeroCartela = maiorNumeroCartela;
		this.randomizer = new Random();
		this.numerosJaSorteados = new HashSet<Integer>();
		this.listaParticipantes = new ArrayList<>(qtdParticipantes);
		this.listaVencedores = new ArrayList<>(qtdParticipantes);
	}

	public void adicionarParticipante(String nome)
	{
		if(this.listaParticipantes.size() <= this.qtdParticipantes)
			this.listaParticipantes.add(new Participante(nome, this.qtdNumerosNaCartela, this.maiorNumeroCartela));
		else
			System.out.println("ERRO. Número máximo de participantes alcançado.");
	}

	public void iniciarBingo()
	{
		this.imprimirCartelasDosParticipantes();
		int i = 1;
		while(this.maxQtdAcertos < this.qtdNumerosNaCartela)
		{
			int numeroDaRodada = this.sortearNumero();
			System.out.println("\n[Rodada " + i + "] - Numero sorteado: [" + numeroDaRodada + "]");
			this.atualizarCartelas(numeroDaRodada);
			i++;
		}
	}

	private int sortearNumero()
	{
		int numeroSorteado;
		do
		{
			numeroSorteado = randomizer.nextInt(this.maiorNumeroCartela) + 1;
		}while(this.numerosJaSorteados.contains(numeroSorteado));
		return numeroSorteado;
	}

	private void atualizarCartelas(int numeroDaRodada)
	{
		if(numerosJaSorteados.add(numeroDaRodada))
		{
			for(Participante p : listaParticipantes)
			{
				if(p.marcarNumero(numeroDaRodada))
				{
					System.out.println("+1 ponto para o participante " + p.getNome() + "! (Pontos: " + p.getQtdAcertos() + ")");
					if(p.getQtdAcertos() >= this.maxQtdAcertos)
					{
						this.maxQtdAcertos = p.getQtdAcertos();
						if(this.maxQtdAcertos == this.qtdNumerosNaCartela)
							this.listaVencedores.add(p.getNome());
					}
				}
			}
			
			if(!listaVencedores.isEmpty())
			{
				if(listaVencedores.size() == 1)
					System.out.println("Vencedor: " + listaVencedores.get(0));
				else
					System.out.println("Vencedores: " + listaVencedores.toString());
			}
		}
	}

	private void imprimirCartelasDosParticipantes()
	{
		for(Participante p : listaParticipantes)
			p.imprimirNumerosCartela();
	}
}
