package DaTienTring;

/**
 * Created by joker on 17/10/2016.
 */
public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " i= " + i);
        }
    }
}
