package ro.cts.facade.model;

public class Politie {
    public boolean areCazier(String cnp)
    {
        return (Integer.valueOf(cnp.charAt(cnp.length()-1))%2==0);
    }

}

