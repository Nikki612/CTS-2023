package singleton.ase.cts;

public class Director {
    private String nume;
    private int varasta;

    private static Director director=null;

    private Director(String nume, int varasta) {
        this.nume = nume;
        this.varasta = varasta;
    }

    public static synchronized Director getInstance(String nume)
    {
        if(director==null)
        {
            director=new Director(nume,40);
        }
        return director;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Director{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varasta=").append(varasta);
        sb.append('}');
        return sb.toString();
    }
}
