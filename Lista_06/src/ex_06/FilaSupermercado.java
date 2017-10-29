package ex_06;

import java.util.*;

public class FilaSupermercado
{
	Queue<Cliente> filaClientes;
	
	public FilaSupermercado()
	{
		filaClientes = new LinkedList<Cliente>();
	}
	
	private int getQtdMinutosProximoCliente()
	{
		Random randomizador = new Random();
		return (randomizador.nextInt(4) + 1);
	}
	
	private Cliente getClienteAleatorio()
	{
		String[] nomes = { "Anastor", "Gosicleide", "Bertolda", "Doralice", "Josevaldo", "Gumercindo", "Durval",
				"Anastacia", "Ronaldo", "Juvencio", "Rosineia", "Amanda", "Isabela", "Luana", "Ana Júlia", "Maria",
				"Beatriz", "Lara", "Mariana", "Bruna", "Larissa", "Sofia", "Camila", "Laura", "Valentina", "Carolina",
				"Letícia", "Yasmin", "Bruno", "Gustavo", "Pedro", "Diego", "Henrique", "Rafael", "Eduardo", "João",
				"Rodrigo", "Enzo", "Leonardo", "Valentim", "Gabriel", "Lucas", "Vinícius", "Guilherme", "Miguel",
				"Vitor", "Antônio", "Rubens" };
		Random randomizador = new Random();
		return new Cliente(nomes[randomizador.nextInt(10)], getTempoAtendimentoCliente(), false);
	}
	
	private int getTempoAtendimentoCliente()
	{
		Random randomizador = new Random();
		return (randomizador.nextInt(4) + 1);
	}
	
	public void processarFila(int totalMinutosFuncionamento)
	{
		int minutoAtual = 0;
		int minutosProximoCliente = getQtdMinutosProximoCliente();
		Cliente clienteEmAtendimento = null;
		Cliente novoCliente;
		
		while(minutoAtual < totalMinutosFuncionamento)
		{
			// Quando um novo Cliente chega na fila
			if(minutosProximoCliente == 0)
			{
				System.out.print("[" + minutoAtual + "] minutos: ");
				novoCliente = getClienteAleatorio();
				if(filaClientes.isEmpty() && clienteEmAtendimento == null)
				{
					novoCliente.setEstaEmAtendimento(true);
					clienteEmAtendimento = novoCliente;
					System.out.println(novoCliente.getNome() + " começou a ser atendido(a).");
				}
				else
				{
					filaClientes.offer(novoCliente);
					System.out.println(novoCliente.getNome() + " entrou na fila.");
				}

				// Agendamento do próximo cliente
				minutosProximoCliente = getQtdMinutosProximoCliente();
			}
			
			// Quando um Cliente termina de ser atendido
			if(clienteEmAtendimento != null && clienteEmAtendimento.getTempoRestanteAtentimento() == 0)
			{
				System.out.print("[" + minutoAtual + "] minutos: ");
				System.out.println(clienteEmAtendimento.getNome() + " terminou de ser atendido(a).");
				if(!filaClientes.isEmpty())
				{
					clienteEmAtendimento = filaClientes.poll();
					System.out.print("[" + minutoAtual + "] minutos: ");
					System.out.println(clienteEmAtendimento.getNome() + " começou a ser atendido(a).");
				}
				else
					clienteEmAtendimento = null;
			}
			
			// Atualização das variáveis
			minutoAtual++;
			minutosProximoCliente--;
			if(clienteEmAtendimento != null)
				clienteEmAtendimento.decrementarTempoRestanteAtendimento();
		}
	}
}
