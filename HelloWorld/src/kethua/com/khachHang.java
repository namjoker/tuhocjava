package kethua.com;

/**
 * Created by joker on 16/10/2016.
 */
public abstract class khachHang {
    private String ten;
    private String cmnd;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public abstract int tinhLuong();

    @Override
    public String toString() {
        return "khachHang{" +
                "ten='" + ten + '\'' +
                ", cmnd='" + cmnd + '\'' + " " + tinhLuong() +
                '}';
    }
}
