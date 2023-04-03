package ro.cts.spital.ex2ex3.model;

public class PersonalSpitalFactory {
    public PersonalSpital createObject(TipPersonal tip,String name)
    {
        switch(tip)
        {
            case BRANCARDIER:
                return new Bracardier(name);
            case MEDIC:
                return new Medic(name);
            case ASISTENT:
                return new Asistent(name);
            default:
                throw new IllegalArgumentException("No such type!");
        }
    }
}
