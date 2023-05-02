package ro.cts.proxy.main;

import ro.cts.proxy.model.Client;
import ro.cts.proxy.model.ITicketOffice;
import ro.cts.proxy.model.Proxy;
import ro.cts.proxy.model.TicketOffice;

public class Main {
    public static void main(String[] args) {
        Client underageClient=new Client("Maria",12);
        Client overageClient=new Client("Mircea",22);
        ITicketOffice ticketOffice=new TicketOffice();

        ticketOffice.sellTicket(underageClient);
        ticketOffice.sellTicket(overageClient);

        ITicketOffice proxy=new Proxy(ticketOffice);
        proxy.sellTicket(underageClient);
        proxy.sellTicket(overageClient);
    }
}