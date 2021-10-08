import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ChuyenXeNoiThanh> arrChuyenXeNoiThanh = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> arrChuyenXeNgoaiThanh = new ArrayList<>();
        int soChuyenNoiThanh, soChuyenNgoaiThanh;
        double doanhThuXeNoiThanh = 0;
        double doanhThuXeNgoaiThanh = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số chuyến nội thành: ");
        soChuyenNoiThanh = input.nextInt();
        System.out.println("Nhập số chuyến ngoại thành: ");
        soChuyenNgoaiThanh = input.nextInt();

        System.out.println("Nhập thông tin chuyến xe nội thành: ");
        for(int i = 0; i<soChuyenNoiThanh; i++){
            System.out.println("Nhập thông tin chuyến xe thứ "+ (i+1) + ":");
            ChuyenXeNoiThanh CXNT = new ChuyenXeNoiThanh();
            CXNT.nhapThongTinChuyenXe();
            doanhThuXeNoiThanh += ChuyenXeNoiThanh.getDoanhThu();
        }
    }
}
