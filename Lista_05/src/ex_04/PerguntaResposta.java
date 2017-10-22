package ex_04;

public class PerguntaResposta
{

	public PerguntaResposta()
	{
		// Respostas das perguntas da questão 4
		
		/*
		 * Item A:
		 * 
		 * No estado atual do programa, nenhum método ficaria melhor como abstrato do que concreto.
		 * Além do fato de existirem objetos instanciados de Conta, o que faria com que as ações tomadas
		 * sobre eles se tornassem inválidas, listarei os métodos e motivos de estarem melhores como já estão:
		 * 
		 * - getSaldo e sacar: Se fossem abstratos, todas as classes filhas iriam ter que implementá-los, o que
		 * 			   		   traria retrabalho para o programador
		 * 
		 * - depositar: apenas uma classe o implementa de forma diferente da classe pai, o que nos leva a concluir
		 * 				que não é um comportamento que cada filha implementará diferentemente uma da outra
		 * 
		 * - atualizarSaldo e imprimirSaldo: este método seria um bom candidato a método abstrato (se não houvessem 
		 * 									 objetos deste tipo instanciados), pois é implementado de forma diferente 
		 * 									 em cada uma das classes filhas
		 */
		
		/*
		 * Item B:
		 * 
		 * Não seria possível instanciar objetos da classe Conta, apenas de seus filhos ContaPoupanca ou ContaCorrente
		 */
		
		/*
		 * Item C
		 * 
		 * Caso apenas a classe se torne abstrata, mas se mantenha a implementação do método, não acontecerá nada
		 */
		
		
		/*
		 * Item D
		 * 
		 * Quando o método atualizarSaldo for invocado, ela utilizará o código da classe Conta
		 */
		
		/*
		 * Item E
		 * 
		 * Ele deve existir na classe para que os objetos instanciados dela possam realmente ser instanciados.
		 * Se existisse apenas nas classes filhas, objetos instanciados como Conta não poderiam implementar este método.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
