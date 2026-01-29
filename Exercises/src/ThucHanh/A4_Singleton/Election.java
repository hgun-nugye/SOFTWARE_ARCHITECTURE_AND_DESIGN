package ThucHanh.A4_Singleton;

import java.util.HashSet;
import java.util.Set;

public class Election {
    private static Election instance;
    private int trumpVotes =0, biddenVotes =0;

    private Set<String> userWhoVoted;
    private Election(){
        userWhoVoted = new HashSet<>();
    }

    public static Election getInstance(){
        if(instance == null){
            instance = new Election();
        }
        return instance;
    }

    public void submitVote(String candidate, String user){
        if(userWhoVoted.contains(user)){
            System.out.println(user + " đã bầu cử rồi!");
            return ;
        }

        if(candidate.equalsIgnoreCase("Donald Trump")){
            trumpVotes++;
        }
        else if(candidate.equalsIgnoreCase("Joe Biden")){
            biddenVotes++;
        }
        else {
            System.out.println("Ứng viên không hợp lệ!");
            return ;
        }
        userWhoVoted.add(user);
        System.out.println(user + " đã bầu cho " + candidate + " thành công!");
    }

    public void printResult(){
        System.out.println("\t--KẾT QUẢ BẦU CỬ--");
        System.out.println("Donald Trump: " + trumpVotes + " phiếu");
        System.out.println("Joe Biden: " + biddenVotes + " phiếu");

    }
}
