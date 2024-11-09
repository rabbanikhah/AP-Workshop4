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
}
