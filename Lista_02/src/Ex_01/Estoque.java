package Ex_01;

public class Estoque
{
    private String nome;
    private int qtdAtual;
    private int qtdMinima;
    
    public Estoque(String nome, int qtdAtual, int qtdMinima)
    {
        if(qtdAtual < 0 || qtdMinima < 0)
            System.out.println("ERRO. Parametros invalidos.");
        else
        {
            this.nome = nome;
            this.qtdAtual = qtdAtual;
            this.qtdMinima = qtdMinima;
        }        
    }
    
    public void AlterarNome(String nome)
    {
        this.nome = nome;
        System.out.println("Nome do produto alterado para " + nome);
    }
    
    public void AlterarQtdMinima(int qtd)
    {
        this.qtdMinima = qtd;
        System.out.println("Quantidade mínima de " + nome + " alterado para " + qtdMinima);
    }
    
    public void ReporEstoque(int qtd)
    {
        this.qtdAtual += qtd;
        System.out.println("Quantidade atual de " + nome + " aumentada em " + qtd);
    }
    
    public void RetirarDoEstoque(int qtd)
    {
        if(qtd <= qtdAtual - qtdMinima)
        {
            qtdAtual -= qtd;
            System.out.println("Quantidade atual de " + nome + " diminuida em " + qtd);
        }
        else
            System.out.println("ERRO. Nao ha estoque suficiente para esta retirada.");
    }
    
    public void MostrarDados()
    {
        System.out.println("Nome: " + nome + "\nQuantidade Mínimma: " + qtdMinima + "\nQuantidade Atual: " + qtdAtual);
    }
    
    public boolean VerificaNecessidadeReposicao()
    {
        return qtdAtual <= qtdMinima + 10;
    }
    
    
    
}
