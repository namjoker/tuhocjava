package joker.com;

/**
 * Created by joker on 10/10/2016.
 */
public class string {
    public static void main(String[] args) {
   /*     String str1 = "Happy";
        String str2 = "New Year";
        int chieuDai = str1.trim().length();
        System.out.print(chieuDai);
        // Lay 1 ki tu tai vi tri so 8
        char kiTuSo8 = str2.charAt(0);
        System.out.print("\n" +kiTuSo8);
        // Noi 2 chuoi su dung concat
        System.out.printf("\n"+str1.concat(str2));
        System.out.print("\n"+ str1.indexOf(str2));
  */
    // Dem xem trong String co bao nhieu chu Hoa, chu thuong, va so
        String string = "Day la Chuoi co do dai bang 200";
    // Cach 1 khong dung mang
        int chuHoa,chuThuong,chuSo;
        chuHoa = 0;
        chuThuong = 0;
        chuSo = 0;
        for (int i = 0; i< string.length();i++)
        {
            if (Character.isUpperCase(string.charAt(i)))
            {
                chuHoa += 1;
            }else {
                if(Character.isLowerCase(string.charAt(i)))
                {
                    chuThuong += 1;
                }
                else {
                    if (Character.isDigit(string.charAt(i)))
                    {
                        chuSo += 1;
                    }
                }
            }
        }
        System.out.println("Chu Hoa: " + chuHoa +"\n Chu Thuong: " + chuThuong+ "\n Chu So:" +
                chuSo);

        // cach 2 ; Bien 1 string thanh 1 mang roi xu ly

        char mang[] = string.toCharArray();
        // Cac buoc sau tuong tu buoc nay

    }
}
