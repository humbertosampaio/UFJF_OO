package Ex_07;

public class Locadora
{
    private final int qtdTotalDVDs;
    private final int qtdDVDsJF;
    private final int qtdDVDsRJ;
    
    public Locadora()
    {
        this.qtdTotalDVDs = 4000;
        this.qtdDVDsJF = 1620;
        this.qtdDVDsRJ = 1710;
    }
    
    public int GetQtdTotalAlugados()
    {
        return qtdTotalDVDs - qtdDVDsJF - qtdDVDsRJ;
    }
    
    public void ImprimeQtdTotalAlugados()
    {
        System.out.println("Existem " + ((qtdTotalDVDs/2) - qtdDVDsJF) + " DVDs alugados em JF");
        System.out.println("Existem " + ((qtdTotalDVDs/2) - qtdDVDsRJ) + " DVDs alugados em RJ");
    }
    
    public void ImprimePercentualTotalAlugados()
    {
        float percAlugadosJF = 100.0f - ((float)qtdDVDsJF*100) / (qtdTotalDVDs/2);
        float percAlugadosRJ = 100.0f - ((float)qtdDVDsRJ*100) / (qtdTotalDVDs/2);

        System.out.println(percAlugadosJF + "% dos DVDs de JF estão alugados.");
        System.out.println(percAlugadosRJ + "% dos DVDs do RJ estão alugados.");
    }
}
