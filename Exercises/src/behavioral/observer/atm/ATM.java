package behavioral.observer.atm;

public class ATM {
    public ATMListener taiKhoan;

    public void nhanThe(ATMListener taiKhoan){
        this.taiKhoan=taiKhoan;
    }

    public void traThe(){
        this.taiKhoan=null;
    }

    public void rutTien(int soTienRut){
        if(taiKhoan==null){
            System.out.println("Mời đưa thẻ vào máy ATM!");
            return;
        }
        if(taiKhoan.kiemTraSoDu(soTienRut)){
            taiKhoan.nhanThongBao(soTienRut, true);
        }
        else taiKhoan.nhanThongBao(soTienRut, false);
    }

}
