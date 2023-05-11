package ro.cts.strategy.model;

public class PlataCardCalatori implements ITipPlata{
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata a fost efectuata cu cardul de calatorii. S-a debitat cu "+pretBilet);
    }
}
