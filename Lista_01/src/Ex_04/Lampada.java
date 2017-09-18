package Ex_04;

public class Lampada
{
    boolean acesa;
    
    public Lampada()
    {
        this.acesa = false;
    }
    
    public void Acender()
    {
        System.out.println("Acendendo lampada...");
        this.acesa = true;
    }
    
    public void Apagar()
    {
        System.out.println("Apagando lampada...");
        this.acesa = false;
    }
    
    public String VerificarEstado()
    {
        if(acesa)
            return "Acesa";
        else
            return "Apagada";
    }
}
