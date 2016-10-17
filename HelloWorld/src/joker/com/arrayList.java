package joker.com;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by joker on 10/10/2016.
 */
public class arrayList {
    public static void main(String[] args) {
        ArrayList danhsach = new ArrayList();
        danhsach.add("x");
        danhsach.add("y");
        danhsach.add("z");
        // Cach 1:
        for (int i= 0; i< danhsach.size();i++)
        {
            System.out.println(danhsach.get(i) + " ");
        }

        System.out.println("=========================");
        // Cach 2:

        for (Object print : danhsach)
        {
            System.out.println(print + "");
        }


    }
}
