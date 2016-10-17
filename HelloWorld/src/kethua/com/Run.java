package kethua.com;

/**
 * Created by joker on 16/10/2016.
 */
public class Run {
    public static void main(String[] args) {
        khachHang teo = new khachHangChinhThuc();
        teo.setTen("Teo");
        teo.setCmnd("1345434543");
        System.out.println(teo);
        // Demo tinh da hinh
        teo = new khachHangThoiVu();
        teo.setTen("teo");
        teo.setCmnd("34334343434");
        System.out.println(teo);
    }
}
