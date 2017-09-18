package Main;

import Ex_02.*;
import Ex_03.*;
import Ex_04.*;
import Ex_05.*;
import Ex_06.*;
import Ex_07.*;

public class Main
{
    private static float CalculaGastosLanHouse(float valorHora, float horasDiarias)
    {
        return valorHora * horasDiarias * 30;
    }
    
    public static void main(String args[])
    {
        System.out.println("Exercicio 01:");
        float gasto = CalculaGastosLanHouse(1.0f, 1.0f);
        System.out.println("R$" + gasto + " foram gastos na lan house.");
        
        System.out.println("\nExercicio 02:");
        Quadrado q1 = new Quadrado(2);
        Quadrado q2 = new Quadrado(3);
        Quadrado q3 = new Quadrado(4);
        
        q1.ImprimePropriedades();
        q2.ImprimePropriedades();
        q3.ImprimePropriedades();
                
        System.out.println("\nExercicio 03:");
        Retangulo r = new Retangulo();
        System.out.println("Altura do retangulo = " + r.GetAltura());
        System.out.println("Largura do retangulo = " + r.GetLargura());
        r.SetAltura(25f);
        r.SetAltura(10.5f);
        r.SetLargura(50.94f);
        r.SetLargura(15.0f);
        System.out.println("Altura do retangulo = " + r.GetAltura());
        System.out.println("Largura do retangulo = " + r.GetLargura());
        
        System.out.println("\nExercicio 04:");
        Lampada l = new Lampada();
        l.VerificarEstado();
        l.Acender();
        l.VerificarEstado();
        l.Apagar();
        l.VerificarEstado();
        
        System.out.println("\nExercicio 05:");
        //Data data = new Data(31, 2, 2017);
    	//Data data = new Data(18, "Fevereiro", 2015);
    	Data data = new Data(48, 2015);
        data.ToString("dd/mm/aa");
        data.ToString("MM/dd/aaaa");
        data.ToString("ddd/aaaa");
    	
    	System.out.print("\nExercicio 06:");
    	ContaBancaria conta = new ContaBancaria("Humberto", 100);
    	conta.ImprimeDados();
    	conta.Sacar(200.55);
    	conta.Sacar(40.38);
    	conta.AlterarTitular("Ronaldo");
    	conta.ImprimeDados();
        
        System.out.println("Exercicio 07:");
        Locadora locadora = new Locadora();
        System.out.println("Quantidade total de DVDs alugados: " + locadora.GetQtdTotalAlugados());
        locadora.ImprimeQtdTotalAlugados();
        locadora.ImprimePercentualTotalAlugados();
    }
}
