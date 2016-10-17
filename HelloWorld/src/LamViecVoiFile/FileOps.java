package LamViecVoiFile;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by joker on 17/10/2016.
 */
public class FileOps {
    // Param 1 la nguon di lieu muon luu tru la 1 tap cac khach hang
    //Param 2 la dia chi luu file
    public static boolean saveFile(ArrayList<KhachHangModel>dsKH,String path)
    {
        try {
            //Luu file vao o cung voi duong dan cua File, xuat tu RAM ra o cung
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            //Luu file voi dinh dang UTF-8
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            // Khoi tao 1 cai buffer de luu du lieu
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            for (KhachHangModel khachHangModel : dsKH)
            {
                String line = khachHangModel.getMaKH() + ";" + khachHangModel.getTenKH();
                // Lay buffer luu du lieu va o cung theo tung dong
                bufferedWriter.write(line);
                //Xuong dong
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<KhachHangModel>readFile(String path)
    {
        ArrayList<KhachHangModel>dsKH = new ArrayList<KhachHangModel>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // Doc file
            // Doc dong dau tien cua file
            String line = bufferedReader.readLine();
            while (line != null)
            {
                //Tach 2 truong ban dau cham phay
                String arr[] = line.split(";");
                // Neu mang nay co 2 phan tu thi lam
                if (arr.length ==2)
                {
                    // Khoi tao 1 doi tuong va truyen tham so cho no
                    KhachHangModel khachHangModel = new KhachHangModel(arr[0],arr[1]);
                    dsKH.add(khachHangModel);
                }
                // Doc tiep dong tiep theo
                line = bufferedReader.readLine();
            }
            fileInputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return dsKH;
    }
}
