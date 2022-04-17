import java.util.concurrent.locks.ReentrantLock;

public class sala {
    public static void main(String[] args) {
      Station station1 = new Station();
      Station station2 = new Station();
      Station station3 = new Station();

      station1.start();
      station2.start();
      station3.start();
    }
}
class Station extends Thread {

    private static ReentrantLock lock = new ReentrantLock();
    public static int i = 20;

    public void run() {
        while (true) {
            try {
                lock.lock();
                if (i > 0) {
                    try {
                        java.lang.Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("卖出了第" + i + "张票");
                    i--;
                } else {
                    System.out.println("票卖完了");
                    System.exit(0);
                }

            } finally {
                lock.unlock();
            }


        }
    }
}

