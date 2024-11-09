import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    // field and attribute
    private int type;
    private String question;
    private HashMap<String, HashSet<Vote>> choices;
    private boolean isAnonymous;
    private ArrayList<Person> voters;

    // constructor
    public Voting (int type, String question, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;
    }
}
