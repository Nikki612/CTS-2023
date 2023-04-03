package ro.cts.spital.ex1.model;

public class Pacient {
    private String name;
    private int age;
    private boolean isCuPatRabatabil;
    private boolean isCuMicDejun;
    private boolean isCuPapuci;
    private boolean isCuHalat;

    protected Pacient(String name, int age, boolean isCuPatRabatabil, boolean isCuMicDejun, boolean isCuPapuci, boolean isCuHalat) {
        this.name = name;
        this.age = age;
        this.isCuPatRabatabil = isCuPatRabatabil;
        this.isCuMicDejun = isCuMicDejun;
        this.isCuPapuci = isCuPapuci;
        this.isCuHalat = isCuHalat;
    }

    protected Pacient(String name,int age)
        {
            this.name = name;
            this.age = age;
            this.isCuPatRabatabil = false;
            this.isCuMicDejun = false;
            this.isCuPapuci = false;
            this.isCuHalat = false;
        }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected void setCuPatRabatabil(boolean cuPatRabatabil) {
        isCuPatRabatabil = cuPatRabatabil;
    }

    protected void setCuMicDejun(boolean cuMicDejun) {
        isCuMicDejun = cuMicDejun;
    }

    protected void setCuPapuci(boolean cuPapuci) {
        isCuPapuci = cuPapuci;
    }

    protected void setCuHalat(boolean cuHalat) {
        isCuHalat = cuHalat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", isCuPatRabatabil=").append(isCuPatRabatabil);
        sb.append(", isCuMicDejun=").append(isCuMicDejun);
        sb.append(", isCuPapuci=").append(isCuPapuci);
        sb.append(", isCuHalat=").append(isCuHalat);
        sb.append('}');
        return sb.toString();
    }
}
