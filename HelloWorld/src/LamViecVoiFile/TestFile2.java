package LamViecVoiFile;

import java.util.ArrayList;

/**
 * Created by joker on 18/10/2016.
 */
public class TestFile2 {
    public static void TestLuuFile()
    {
        ArrayList<KhachHangModel> ds = new ArrayList<KhachHangModel>();
        ds.add(new KhachHangModel("1","le hoai nam"));
        ds.add(new KhachHangModel("2","le 1oai nam"));
        ds.add(new KhachHangModel("3","le 2oai nam"));
        ds.add(new KhachHangModel("4","le 3oai nam"));
        boolean check = FileSerializable.saveFile(ds,"/home/joker/dulieu2.txt");
        if (check == true)
        {
            System.out.println("Luu thanh cong");
        }
        else {
            System.out.println("Luu that bai");
        }
    }

    public static void main(String[] args) {
//        TestLuuFile();
        //        TestLuuFile();
        ArrayList<KhachHangModel> dsKH = FileSerializable.readFile("/home/joker/dulieu2.txt");
        System.out.println("Ma KH" + "\t" + "Ten KH");
        for (KhachHangModel kh : dsKH)
        {
            System.out.println(kh.getMaKH() + "\t" + kh.getTenKH());
        }

    }
}
