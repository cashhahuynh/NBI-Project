package NBIClasses.NewMatter;

import AbstractClass.NBI;

public class NewMatter extends NBI {

    int clientNumber;
    String clientName;

    public NewMatter(int clientNumber, String clientName, int nbi, String description, boolean conflictSearch) {
        super(nbi, description, conflictSearch);
        this.clientNumber = clientNumber;
        this.clientName = clientName;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {

        String formatClient = String.format("%s (%d)", getClientName(), getClientNumber());

        return "NBI" + getNbi()
                + "\nClient: " + formatClient
                + "\nDescription of matter: " + getDescription()
                + "\nNBIClasses.Conflicts required: " + isConflictSearch();
    }
}
