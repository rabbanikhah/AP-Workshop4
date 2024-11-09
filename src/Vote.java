public class Vote {
    // field and attribute
    private final Person voter;
    private final String date;

    // constructor
    public Vote(Person voter, String date) {
        this.voter = voter;
        this.date = date;
    }

    // methods
    public Person getVoter() {
        return voter;
    }

    public String getDate() {
        return date;
    }
}
