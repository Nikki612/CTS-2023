package singleton.ase.cts;

public class Papa {
    private String nume;
    private int nrAniFunctie;
    private int indexPapa;

    private static Papa papa=new Papa("Benedict",2,276);

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrAniFunctie() {
        return nrAniFunctie;
    }

    public void setNrAniFunctie(int nrAniFunctie) {
        this.nrAniFunctie = nrAniFunctie;
    }

    public int getIndexPapa() {
        return indexPapa;
    }

    public void setIndexPapa(int indexPapa) {
        this.indexPapa = indexPapa;
    }

    private Papa(String nume, int nrAniFunctie, int indexPapa) {
        this.nume = nume;
        this.nrAniFunctie = nrAniFunctie;
        this.indexPapa = indexPapa;
    }

    public static Papa getPapa()
    {
        return papa;
    }
}
