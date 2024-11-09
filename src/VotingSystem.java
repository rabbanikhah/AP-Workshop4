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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VotingSystem that = (VotingSystem) o;
        return Objects.equals(getVotingList(), that.getVotingList());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getVotingList());
    }
}

