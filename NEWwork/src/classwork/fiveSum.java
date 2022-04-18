package classwork;

import java.util.concurrent.locks.ReentrantLock;

public class fiveSum {
    public static void main(String[] args) {
        Sum sum1 = new Sum();
        Sum sum2 = new Sum();
        Sum sum3 = new Sum();
        Sum sum4 = new Sum();
        Sum sum5 = new Sum();
try {
    sum1.start();
    sum1.sleep(100);
    sum2.start();
    sum2.sleep(100);
    sum3.start();
    sum3.sleep(100);
    sum4.start();
    sum4.sleep(100);
    sum5.start();

}catch (Exception e){
    e.printStackTrace();
}

    }
}
class Sum extends Thread {
    private static ReentrantLock lock = new ReentrantLock();
    private int sum = 0;

    public void run() {
        while (true) {
            try {
                lock.lock();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i <= 100; i++) {
                    sum += i;
                    System.out.println(sum);
                }

                System.exit(0);
            }finally {
                lock.unlock();
            }
        }
    }
}
