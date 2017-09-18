package Ex_05;

public class Data
{
    private String dia, mes, ano;
    
    public Data(int dia, int mes, int ano)
    {
    	if(dia <= 31 && dia > 0 && mes <= 12 && mes > 0)
    	{
            this.dia = String.valueOf(dia);
            this.mes = String.valueOf(mes);
            this.ano = String.valueOf(ano);    		
    	}
    	else
    		System.out.println("ERRO. Data inválida");
    }
    
    public Data(int dia, String mes, int ano)
    {
    	int mesInt = Integer.parseInt(MesParaCaracterNumerico(mes));
    	if(dia <= 31 && dia > 0 && mesInt <= 12 && mesInt > 0)
    	{
            this.dia = String.valueOf(dia);
            this.mes = String.valueOf(mesInt);
            this.ano = String.valueOf(ano);    		
    	}
    	else
    		System.out.println("ERRO. Data inválida");
    }
    
    public Data(int qtdDias, int ano)
    {
    	if(qtdDias > 0 && qtdDias <= 360)
    	{
    		this.ano = String.valueOf(ano);
    		this.mes = String.valueOf(qtdDias / 30 + 1);
    		this.dia = String.valueOf(qtdDias - ((Integer.valueOf(mes) - 1) * 30));
    	}
    	else
    		System.out.println("ERRO. Data inválida");    	
    }
    
    private String AdicionaZero(String valor)
    {
    	int valorInteiro = Integer.parseInt(valor);
    	if (valorInteiro < 9 && valorInteiro > -9)
    		return "0" + valor;
    	else
    		return valor;
    }
    
    public String MesPorExtenso(String mes)
    {
    	int mesInteiro = Integer.parseInt(mes);
    	switch(mesInteiro)
    	{
    		case 1: return "Janeiro";
    		case 2: return "Fevereiro";
    		case 3: return "Março";
    		case 4: return "Abril";
    		case 5: return "Maio";
    		case 6: return "Junho";
    		case 7: return "Julho";
    		case 8: return "Agosto";
    		case 9: return "Setembro";
    		case 10: return "Outubro";
    		case 11: return "Novembro";
    		case 12: return "Dezembro";
    	}
    	return "ERRO. O parâmetro informado não corresponde a um mês.";
    }

    public String MesParaCaracterNumerico(String mes)
    {
    	String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
    	    	
    	for(int i = 0, length = meses.length; i < length; i++)
    	{
    		if(mes.toLowerCase().equals(meses[i]))
    			return String.valueOf(i+1);
    	}
    	return "0";
    }
    
    public void ToString(String formato)
    {
    	switch(formato)
    	{
	    	case "dd/mm/aa":
	    		System.out.println(AdicionaZero(dia) + "/" + AdicionaZero(mes) + "/" + ano);
	    		break;
	    	case "MM/dd/aaaa":
	    		System.out.println(MesPorExtenso(mes) + " " + AdicionaZero(dia) + ", " + ano);
	    		break;
	    	case "ddd/aaaa":
	    		System.out.println(String.valueOf((Integer.valueOf(mes) - 1) * 30 + Integer.valueOf(dia)) + "/" + ano);
	    		break;
    	}
    }
}
