package ro.cts.strategy.model;

public class PlataPrinSMS implements ITipPlata{
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata a fost efectuata prin SMS. S-a debitat cu "+pretBilet);
    }
}
