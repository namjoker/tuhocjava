package joker.com;

/**
 * Created by joker on 10/10/2016.
 */
public class HocCachXuLyChuoi
{
    public static void main(String[] args) {
        String baiHat = "D:\\Music\\Nhac Tre\\Chung ta khong thuoc ve nhau.mp4";
        int viTri = baiHat.lastIndexOf("\\");
        int viTriDauCham = baiHat.lastIndexOf(".");
        String tenBaiHat = baiHat.substring(viTri + 1,viTriDauCham);
        System.out.println(tenBaiHat);
        // Cach xu ly 1 so tinh huong
        String username = "   Le     Hoai    Nam";
        String newName = "";
        //Nhiem vu loai bo khoang trang
        for(int i =0; i< username.length();i++)
        {
            if(!Character.isSpaceChar(username.charAt(i)))
            {
                newName += (username.charAt(i) + "");
            }
        }
        System.out.println(newName);
        // Nhiem vu cach nhau bang khoang trang
        String s = username.trim();
        String arr[] = s.split(" ");
        String newName2 = "";
        for (String tu : arr)
        {
            if(tu.length() != 0)
            {
                newName2 += tu + " ";
            }
        }
        System.out.println(newName2);
    }
}

