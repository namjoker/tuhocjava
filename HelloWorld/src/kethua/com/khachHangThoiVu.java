package kethua.com;

/**
 * Created by joker on 16/10/2016.
 */
public class khachHangThoiVu extends khachHang {

    @Override
    public int tinhLuong() {

        return 1000;
    }

    @Override
    public String toString() {
        return super.toString() + "Khach hang thoi vu";
    }
}
