package Ex_03;

public class Veiculo
{
	private String marca;
    private String modelo;
    private int ano;
    private Seguro seguro;
    private static float valorTabelaFipe = 80000f;

    public Veiculo(String marca, String modelo, int ano, String contratante,
        int idade, boolean casado, float valorFranquia) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.seguro = new Seguro(contratante, idade, casado, valorFranquia);   
    }
    
    public String GetMarca()
    {
    	return marca;
    }
    
    public String GetModelo()
    {
    	return modelo;
    }
    
    public int GetAno()
	{
		return ano;
	}

	public float ValorSeguro() {
        
        if (this.seguro.GetIdade() <= 30)
            this.seguro.setAliquota(0.05f);
        else
            this.seguro.setAliquota(0.03f);
        
        if (this.seguro.EstadoCivilCasado())
            this.seguro.setAliquota(this.seguro.GetAliquota() - 0.02f);
        
        this.seguro.setAliquota(this.seguro.GetAliquota() + (100/this.seguro.GetValorFranquia()));
        
        this.seguro.setAliquota(this.seguro.GetAliquota() + (2017 - this.ano)/100);
                
        return this.valorTabelaFipe * this.seguro.GetAliquota();
    }
}
