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

    // methods
    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        ArrayList<String> availableChoices = new ArrayList<>();
        for (String s : choices.keySet())
            availableChoices.add(s);
        return availableChoices;
    }

    public void creatChoice(String choice){
        this.choices.put(choice, null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voting voting = (Voting) o;
        return isAnonymous == voting.isAnonymous;
    }

    public void vote(Person voter,ArrayList<String> voter_choices){
        if (isAnonymous){
            return;
        }
        Vote newVote = new Vote(voter,null);
        for (String i: choices.keySet()){
            //iteration over voter's choices
            for (String j:voter_choices){
                //checking if the choices we have in the field equals to the voters choice and adding a new vote to the values of the hashmap(it was set to null in the beginning)
                if (i.equals(j)){
                    choices.get(i).add(newVote);
                }
            }
        }
        if (!voters.contains(voter)){
            voters.add(voter);
        }
    }
}
