package registry.ase.cts;

import java.util.HashMap;
import java.util.Map;

public class Firma {
    private String nume;
    private int cifraAfaceri;
    private int numarAngajati;

    private static Map<String,Firma> firme=new HashMap<>();

    private Firma(String nume, int cifraAfaceri, int numarAngajati) {
        this.nume = nume;
        this.cifraAfaceri = cifraAfaceri;
        this.numarAngajati = numarAngajati;
    }

    public static synchronized Firma getFirma(String numeFirma)
    {
        if (!firme.containsKey(numeFirma))
        {
            Firma firma=new Firma(numeFirma,0,0);
            firme.put(numeFirma,firma);
        }
        return firme.get(numeFirma);
    }

    public void angajare()
    {
        this.numarAngajati++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Firma{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
