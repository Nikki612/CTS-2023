package ro.cts.spital.ex1.model;

public class PacientBuilder implements AbstractBuilder{

    private String name;
    private int age;
    private boolean isCuPatRabatabil;
    private boolean isCuMicDejun;
    private boolean isCuPapuci;
    private boolean isCuHalat;

    public PacientBuilder() {
        this.name = null;
        this.age = 0;
        this.isCuPatRabatabil = false;
        this.isCuMicDejun = false;
        this.isCuPapuci = false;
        this.isCuHalat = false;
    }

    @Override
    public Pacient buildPacient(String name, int age) {
        return new Pacient(name,age,this.isCuPatRabatabil,this.isCuMicDejun,this.isCuPapuci,this.isCuHalat);
    }

    @Override
    public AbstractBuilder setCuPatRabatabil(boolean cuPatRabatabil) {
        this.isCuPatRabatabil=cuPatRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder setCuMicDejun(boolean cuMicDejun) {
        this.isCuMicDejun=cuMicDejun;
        return this;
    }

    @Override
    public AbstractBuilder setCuPapuci(boolean cuPapuci) {
        this.isCuPapuci=cuPapuci;
        return this;
    }

    @Override
    public AbstractBuilder setCuHalat(boolean cuHalat) {
        this.isCuHalat=cuHalat;
        return this;
    }

}
