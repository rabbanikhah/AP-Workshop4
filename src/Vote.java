import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(getVoter(), vote.getVoter()) && Objects.equals(getDate(), vote.getDate());
    }
}
