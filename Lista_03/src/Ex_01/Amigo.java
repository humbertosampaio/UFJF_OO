package Ex_01;

public class Amigo extends Pessoa
{
    private String diaAniversario;

    public Amigo() { }

    public Amigo(String diaAniversario, String nome, char sexo, int idade)
    {
        super(nome, sexo, idade);
        this.diaAniversario = diaAniversario;
    }

	public String getDiaAniversario()
	{
		return diaAniversario;
	}

	public void setDiaAniversario(String diaAniversario)
	{
		this.diaAniversario = diaAniversario;
	}
}
