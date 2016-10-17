package LamViecVoiFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by joker on 18/10/2016.
 */
public class FileSerializable {
    public static boolean saveFile(ArrayList<KhachHangModel>dsKH, String path)
    {
        try {
            // Lay duong dan de luu
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            // Ma hoa doi tuong de luu
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            // Ghi doi tuong
            objectOutputStream.writeObject(dsKH);
            objectOutputStream.close();
            fileOutputStream.close();
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<KhachHangModel>readFile (String path)
    {
        ArrayList<KhachHangModel> dsKH = new ArrayList<KhachHangModel>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            // Khoi tao 1 doi tuong de luu thang da doc trong file
            Object data = objectInputStream.readObject();
            // Ep kieu thang Data vao thang DSKH
            dsKH = (ArrayList<KhachHangModel>) data;
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dsKH;
    }
}
