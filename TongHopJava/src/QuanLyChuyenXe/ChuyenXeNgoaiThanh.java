public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh(){
        super();
        this.noiDen = "";
        this.soNgayDiDuoc = 0;
    }

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc){
        super();
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String toString(){
        return super.toString() + "/n Nơi đến: "+ this.noiDen
                + "/n Số ngày đi được: "+ this.soNgayDiDuoc;
    }
}
