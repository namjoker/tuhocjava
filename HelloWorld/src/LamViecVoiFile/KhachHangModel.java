package LamViecVoiFile;

/**
 * Created by joker on 17/10/2016.
 */
public class KhachHangModel {
    private String maKH;
    private String tenKH;

    public KhachHangModel(String maKH, String tenKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
    }

    public KhachHangModel() {
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "KhachHangModel{" +
                "maKH='" + maKH + '\'' +
                ", tenKH='" + tenKH + '\'' +
                '}';
    }
}
