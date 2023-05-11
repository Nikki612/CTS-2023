package ro.cts.command.model;

public class CommandPleacreCursa implements ICommand {
    private int nrLinie;
    private IAutomobil automobil;

    public CommandPleacreCursa(int nrLinie, IAutomobil automobil) {
        this.nrLinie = nrLinie;
        this.automobil = automobil;
    }

    @Override
    public void execute() {
        automobil.plecareCursa(this.nrLinie);
    }
}
