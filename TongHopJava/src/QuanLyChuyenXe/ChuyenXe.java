import java.util.Scanner;

public class ChuyenXe {
//    khai báo
    private String maSoChuyen, hoTenTaiXe, soXe;
    protected double doanhThu;
    Scanner input = new Scanner(System.in);
//    hàm tạo
    public ChuyenXe(){
//        super();
        this.maSoChuyen = "";
        this.hoTenTaiXe = "";
        this.soXe       = "";
        this.doanhThu   = 0;
    }

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu){
//        super();
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe       = soXe;
        this.doanhThu   = doanhThu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhapThongTinChuyenXe(){
        System.out.print("Nhập mã số chuyến: ");
        maSoChuyen = input.nextLine();
        System.out.println("Nhập họ tên tài xế: ");
        hoTenTaiXe = input.next();
        System.out.println("nhập số xe: ");
        soXe = input.next();
        System.out.println("Nhập doanh thu: ");
        doanhThu = input.nextDouble();
    }
    public String toString() {
        return "mã số chuyến: "+ this.maSoChuyen + "/nHọ tên tài xế: "+ this.hoTenTaiXe
                + "/nSố xe: "+ this.soXe + "/nDoanh thu: "+ this.doanhThu;
    }

}
