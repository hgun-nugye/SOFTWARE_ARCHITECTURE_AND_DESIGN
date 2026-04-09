package thuchanh.CB1_rut_tien;

public class DenominationDispenser extends MoneyDispenser {
    private int denomination;

    public DenominationDispenser(int amount) {
        this.denomination = amount;
    }

    @Override
    public void dispense(int amount) {
        if(amount>=denomination){
            int cout = amount/denomination;
            int remainder = amount%denomination;
            System.out.println("- " + cout +" to menh gia " + denomination);

            if(remainder!=0 && nextDispenser!=null){
                nextDispenser.dispense(remainder);
            } else if(remainder!=0){
                System.out.println("Khong the chi tra so tien " + remainder);
            }
        }
        else if(nextDispenser!=null){
            nextDispenser.dispense(amount);
        }
    }


}
