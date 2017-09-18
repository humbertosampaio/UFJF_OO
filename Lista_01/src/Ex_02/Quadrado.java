package Ex_02;

public class Quadrado
{
    private final int lado;
    
    public Quadrado(int lado)
    {
        this.lado = lado;
    }
    
    public int getLado()
    {
        return this.lado;
    }
    
    public int CalcularArea()
    {
        return lado * lado;
    }
    
    public int CalcularPerimetro()
    {
        return 4 * lado;
    }
    
    public void ImprimePropriedades()
    {
        System.out.println("Lado = " + getLado() + "; Área = " + CalcularArea() + "; Perímetro = " 
                            + CalcularPerimetro());
    }
}
