package DaTienTring;

/**
 * Created by joker on 17/10/2016.
 */
public class TestThread2 {
    public static void main(String[] args) {
        Thread th3 = new Thread(new MyThread2());
        th3.setName("Tien trinh 3");
        th3.start();
        Thread th4 = new Thread(new MyThread2());
        th4.setName("Tien trinh 4");
        th4.start();
    }

}
