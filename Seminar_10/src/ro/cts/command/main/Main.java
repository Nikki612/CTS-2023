package ro.cts.command.main;

import ro.cts.command.model.Autobuz;
import ro.cts.command.model.CommandPleacreCursa;
import ro.cts.command.model.IAutomobil;
import ro.cts.command.model.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi=new ManagerComenzi();
        IAutomobil autobuz=new Autobuz(13);
        managerComenzi.invocaComanda(new CommandPleacreCursa(10,new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPleacreCursa(11,autobuz));
        managerComenzi.invocaComanda(new CommandPleacreCursa(12,new Autobuz(3)));
        managerComenzi.invocaComanda(new CommandPleacreCursa(11,autobuz));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new CommandPleacreCursa(10,new Autobuz(23)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}