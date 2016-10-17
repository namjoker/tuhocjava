package joker.com;

/**
 * Created by joker on 17/10/2016.
 */
public class TryCatch {
    public static void main(String[] args) {
        try {
            int i =5/0;
        }catch (Exception e){
            e.printStackTrace();
            //Xuat chi tiet loi de kiem tra
        }
    }
}
