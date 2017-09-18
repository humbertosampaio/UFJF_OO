package Ex_03;

public class Seguro
{
	private String contratante;
    private int idade;
    private boolean casado;
    private float aliquota;
    private float valorFranquia;

    public Seguro(String contratante, int idade, boolean ehCasado, float valorFranquia) {
        this.setAliquota(0.0f);
        this.contratante = contratante;
        this.idade = idade;
        this.casado = ehCasado;
        this.valorFranquia = valorFranquia;
    }

    public String GetContratante() {
        return contratante;
    }

    public int GetIdade() {
        return idade;
    }

    public boolean EstadoCivilCasado() {
        return casado;
    }
    
    public float GetAliquota() {
        return aliquota;
    }

    public float GetValorFranquia() {
        return valorFranquia;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEhCasado(boolean ehCasado) {
        this.casado = ehCasado;
    }
    
    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }

    public void setValorFranquia(float valorFranquia) {
        this.valorFranquia = valorFranquia;
    }
}
