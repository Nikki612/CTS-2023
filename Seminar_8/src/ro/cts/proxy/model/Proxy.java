package ro.cts.proxy.model;

public class Proxy  implements ITicketOffice{

    private ITicketOffice office;

    public Proxy(ITicketOffice office) {
        this.office = office;
    }

    @Override
    public void sellTicket(Client client) {
        if(client.getAge()>=15)
        {
            office.sellTicket(client);
        }
        else
        {
            System.out.println("Client "+client.getName()+" is too young.");
        }
    }
}
