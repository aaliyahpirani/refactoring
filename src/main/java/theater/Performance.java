package theater;

/**
 * Class representing a performance of a play..
 */
public class Performance {

    private String playID;
    private int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Returns the ID of the play being performed.
     * @return the play ID
     */
    public final String getplayID() {
        return playID;
    }

    public final int getAudience() {
        return audience;
    }
}

