import java.util.*;

public class VotingSystem {
    // field and attribute
    private ArrayList<Voting> votingList;

    // constructor
    public VotingSystem(){

    }

    // methods
    public Voting getVoting(int index){
        return votingList.get(index);
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }
}

