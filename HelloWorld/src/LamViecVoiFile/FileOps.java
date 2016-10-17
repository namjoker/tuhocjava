package LamViecVoiFile;

import java.io.FileOutputStream;
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

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
