package behavioral.chain_of_responsibility.example;

public abstract class Approver {
    protected Approver nextApprover; //mat xich tiep theo trong chuoi

    //thiet lap nguoi xu ly tiep theo
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    //phuong thuc xu ly chung
    public abstract void processRequest(double amount);

}
