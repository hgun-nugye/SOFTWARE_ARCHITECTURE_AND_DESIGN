package thuchanh.A4_Singleton;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void vote(String candidate){
//        Election election = Election.getInstance();
//        election.submitVote(candidate, this.name);
        Election.getInstance().submitVote(candidate, this.name);
    }


}
