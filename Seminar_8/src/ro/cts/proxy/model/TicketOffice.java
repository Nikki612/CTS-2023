package ro.cts.proxy.model;

public class TicketOffice implements ITicketOffice{
    @Override
    public void sellTicket(Client client) {
        System.out.println("The ticket was sold to "+client.getName());
    }
}
