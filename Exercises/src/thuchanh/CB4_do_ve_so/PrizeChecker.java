package thuchanh.CB4_do_ve_so;

public abstract class PrizeChecker {
    protected PrizeChecker nextChecker;

    public PrizeChecker setNextChecker(PrizeChecker nextChecker) {
        this.nextChecker = nextChecker;
        return this.nextChecker;
    }

    public abstract void checkTicket(String ticketNumber);
}
