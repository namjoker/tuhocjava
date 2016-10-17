package joker.com;

import java.util.HashMap;

/**
 * Created by joker on 16/10/2016.
 */
public class hashMap {
    public static void main(String[] args) {
        HashMap <Integer, String> ds = new HashMap<Integer,String>();
        ds.put(1, "Le Hoai Nam");
        ds.put(2, "Le Minh Hoan");
        ds.put(3, "Le Quang Hiep");
        System.out.println(ds.get(1));
    }
}