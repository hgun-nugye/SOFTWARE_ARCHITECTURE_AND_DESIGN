package thuchanh.CB4_do_ve_so;

public class StandardPrizeChecker extends PrizeChecker {
    private String prizeName;
    private String[] winningNumbers;

    public StandardPrizeChecker(String prizeName, String[] winningNumbers) {
        this.prizeName = prizeName;
        this.winningNumbers = winningNumbers;
    }

    @Override
    public void checkTicket(String ticketNumber) {
        boolean isWon = false;
        for(String winningNumber : winningNumbers){
            if(ticketNumber.endsWith(winningNumber)){
                isWon = true;
                break;
            }
        }

        if (isWon) {
            for(String winningNumber : winningNumbers){
                System.out.println("giai "+prizeName+" có số cuối là "+winningNumber);
                if(ticketNumber.endsWith(winningNumber)){
                     System.out.println("CHÚC MỪNG!\nVé số "+ticketNumber+" đã trúng giải " + prizeName + " với số cuối là " + winningNumber);
                }
            }
            System.out.println("CHÚC MỪNG!\nVé số "+ticketNumber+" đã trúng giải " + prizeName);
        } else if(nextChecker!=null){
            nextChecker.checkTicket(ticketNumber);
        }
        else System.out.println("Chúc bạn may mắn lần sau! ");
    }

}
