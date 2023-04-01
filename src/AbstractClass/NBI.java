package AbstractClass;

//think about how to make NBI count nbi field automatically
public abstract class NBI {

    int nbi;
    String description;
    boolean conflictSearch;

    public NBI(int nbi, String description, boolean conflictSearch) {

        this.nbi = nbi;
        this.description = description;
        this.conflictSearch = conflictSearch;

    }

    public int getNbi() {
        return nbi;
    }

    public String getDescription() {
        return description;
    }

    public boolean isConflictSearch() {
        return conflictSearch;
    }

}
