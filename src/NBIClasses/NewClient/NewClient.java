package NBIClasses.NewClient;

import AbstractClass.NBI;

public class NewClient extends NBI {

    String clientName;

    public NewClient(String clientName, int nbi, String description, boolean conflictSearch) {
        super(nbi, description, true);
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "NBI" + getNbi()
                + "\nDescription of matter: " + getDescription()
                + "\nNBIClasses.Conflicts required: " + isConflictSearch();
    }
}
