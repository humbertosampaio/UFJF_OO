package Main;

import Ex_01.*;
import Ex_02.*;
import Ex_03.Veiculo;
import Ex_04.Funcionario;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Exercício 01:");
        Estoque e1 = new Estoque("Impressora Jato de Tinta", 13, 6);
        Estoque e2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
        Estoque e3 = new Estoque("Mouse Óptico", 6, 2);
        
        e1.RetirarDoEstoque(5);
        e2.ReporEstoque(7);
        e3.RetirarDoEstoque(4);
        e1.VerificaNecessidadeReposicao();
        e2.VerificaNecessidadeReposicao();
        e3.VerificaNecessidadeReposicao();
        e1.MostrarDados();
        e2.MostrarDados();
        e3.MostrarDados();
        
        System.out.println("\nExercício 02:");
        Venda v1 = new Venda("Centro", 10.0f, "12345", "Produto 1", 50, 30);
        v1.Vender(60);
        v1.Vender(20);
        v1.ObterEstatisticasLocais();
        Venda.ObterEstatisticasGerais();
        
        Venda v2 = new Venda("Bairro", 5.21f, "54321", "Produto 2", 20, 15);
        v2.Vender(40);
        v2.Vender(15);
        v2.ObterEstatisticasLocais();
        Venda.ObterEstatisticasGerais();
    	
    	System.out.println("\nExercício 03:");
        Veiculo veiculo = new Veiculo("FIAT", "Uno", 2010, "Fábio Pontes", 35, true, 3000);
        System.out.println("Marca: " + veiculo.GetMarca());
        System.out.println("Modelo: " + veiculo.GetModelo());
        System.out.println("Ano: " + veiculo.GetAno());
        System.out.println("Valor do seguro: " + veiculo.ValorSeguro());

        
    	System.out.println("\nExercício 04:");
    	Funcionario f1 = new Funcionario();
    	f1.ImprimeDados();
    	
    	Funcionario f2 = new Funcionario("Roberto", 30);
    	f2.ImprimeDados();
    	
    	Funcionario f3 = new Funcionario("Gertrudes", "12345678", 2000.00f);
    	f3.ImprimeDados();
    }
}
