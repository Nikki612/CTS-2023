package registry.nerecomandat;

public class Firma {
    private String nume;
    private int nrAngajati;

    protected Firma(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Firma{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }


}
