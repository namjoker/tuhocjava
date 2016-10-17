package kethua.com;

/**
 * Created by joker on 16/10/2016.
 */
public class khachHangChinhThuc extends khachHang{

    @Override
    public int tinhLuong() {

        return 1500;
    }

    @Override
    public String toString() {
        // super.tostring la goi phuong thuc cha
        return super.toString() + "--> Khach Hang chinh thuc";
    }
}
