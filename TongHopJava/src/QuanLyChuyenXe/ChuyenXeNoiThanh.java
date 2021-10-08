public class ChuyenXeNoiThanh extends ChuyenXe {
    private String soTuyen;
    private double soKmDiDuoc;

    public ChuyenXeNoiThanh(){
        super();
    }

    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc){
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public void nhapThongTinChuyenXe(){
        super.nhapThongTinChuyenXe();
        System.out.println("Nhập số tuyến: ");
        soTuyen = input.next();
        System.out.println("Nhập số km đi được: ");
        soKmDiDuoc = input.nextDouble();
    }

    public String toString(){
        return super.toString() + "/n Số tuyến: "+ this.soTuyen
                + "/n Số km đi được: "+ this.soKmDiDuoc;
    }
}
