package lopInterface;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by joker on 16/10/2016.
 */
public class TestNhanVien {
    public static void main(String[] args) {
        ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
        nv.add(new NhanVien("A1","Nam"));
        nv.add(new NhanVien("A2","Hanh"));
        nv.add(new NhanVien("A3","Anh"));
        nv.add(new NhanVien("A4","Zung"));
        nv.add(new NhanVien("A5","Jay"));
        System.out.println("Danh sach sinh vien");
        for (NhanVien nhanVien : nv)
        {
            System.out.println(nhanVien.getName());
        }
        Collections.sort(nv);
        System.out.println("Danh sach sinh vien da sap xep");
        for (NhanVien nhanVien : nv)
        {
            System.out.println(nhanVien.getName());
        }

    }
}
