package thuchanh.CC2_ql_sinh_vien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        QLSV qlsv = new QLSV();
        qlsv.themSV(new SinhVien("Nguyen Hong Son", sdf.parse("12/09/2000"), 7.5f));
        qlsv.themSV(new SinhVien("Tran Tien Dat", sdf.parse("11/12/2000"), 5.5f));
        qlsv.themSV(new SinhVien("Pham Thanh Nha", sdf.parse("02/11/2001"), 9.1f));

        System.out.println("\t\t\tSAP XEP THEO TEN");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();

        System.out.println("\n\t\t\tSAP XEP THEO DIEM");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
