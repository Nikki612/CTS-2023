package ro.cts.spital.ex1.model;

public interface AbstractBuilder {
    public Pacient buildPacient(String name,int age);

    public AbstractBuilder setCuPatRabatabil(boolean cuPatRabatabil);

    public AbstractBuilder setCuMicDejun(boolean cuMicDejun);

    public AbstractBuilder setCuPapuci(boolean cuPapuci);

    public AbstractBuilder setCuHalat(boolean cuHalat);

}
