package Ex_03;

public class Retangulo
{
    private float largura;
    private float altura;
    
    public Retangulo()
    {
        largura = altura = 1;
    }
    
    public float GetLargura()
    {
        return largura;
    }
    
    public float GetAltura()
    {
        return altura;
    }
    
    public void SetLargura(float largura)
    {
        if (largura < 0.0 || largura > 20.0)
            System.out.println("Erro. Largura inváida.");
        else
        {
            System.out.println("Nova largura = " + largura);
            this.largura = largura;
        }
    }
    
    public void SetAltura(float altura)
    {
        if (altura < 0 || altura > 20)
           System.out.println("Erro. Altura inválida.");
        else
        {
            System.out.println("Nova altura = " + altura);
            this.altura = altura;
        }
    }
    
    public float CalculaArea()
    {
        return largura * altura;
    }
    
    public float CalcularPerimetro()
    {
        return 2 * largura + 2 * altura;
    }
    
    
    
}
