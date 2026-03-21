package behavioral.observer.atm;

public class TaiKhoan implements ATMListener {
    String tenTK;
    int soDu;
    ATM atm;

    public TaiKhoan(String tenTK, int soDu, ATM atm) {
        this.tenTK = tenTK;
        this.soDu = soDu;
        this.atm = atm;
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        return (this.soDu - soTienRut) >= 50_000;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        System.out.println("\tBIẾN ĐỘNG SỐ DƯ");
        System.out.println("Số dư ban đầu: " +this.soDu);
        if(thanhCong){
            System.out.println("Rút tiền thành công: " +soTienRut);
            this.soDu-=soTienRut;
            System.out.println("Số dư còn lại: " +this.soDu);
        }
        else{
            System.out.println("Rút tiền không thành công: " +soTienRut);
            System.out.println("Số dư còn lại: " +this.soDu);
        }
    }

    public void duaThe(){
        atm.nhanThe(this);
    }

    public void nhanThe(){
        atm.traThe();
    }
}
