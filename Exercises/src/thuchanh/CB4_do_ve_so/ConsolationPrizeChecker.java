package thuchanh.CB4_do_ve_so;

public class ConsolationPrizeChecker extends PrizeChecker {
    String specialNumber;

    public ConsolationPrizeChecker(String specialNumber) {
        this.specialNumber = specialNumber;
    }

    @Override
    public void checkTicket(String ticketNumber) {
        String last5OfSpecial = specialNumber.substring(1);
        if (!ticketNumber.equals(specialNumber) && ticketNumber.endsWith(last5OfSpecial)) {
            System.out.println("CHÚC MỪNG!\nVé số " + ticketNumber + " đã trúng giải khuyến khích");
        } else if (nextChecker != null) {
            nextChecker.checkTicket(ticketNumber);
        }
    }
}
