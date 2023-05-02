package ro.cts.facade.model;

public class Facade {
    public void permiteIntrarea(Client client,Bilet bilet)
    {
        Politie politie=new Politie();
        if(client.getNume().equals(bilet.getNumeCumparator()))
        {
            if(!politie.areCazier(client.getCnp()))
            {
                System.out.println("Suporterul "+client.getNume()+ "intra pe stadion");
            }
            else
            {
                System.out.println("Are cazier");
            }
        }
        else
        {
            System.out.println("Biletul e al altcuiva!");
        }
    }
}
