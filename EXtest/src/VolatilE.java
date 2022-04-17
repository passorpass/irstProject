
public class VolatilE {
    public volatile int inc = 0;
//请在此添加实现代码
    /********** Begin **********/
    public synchronized void increase() {
        inc++;
    }


    /********** End **********/

    public static void main(String[] args) {
        final VolatilE test = new VolatilE();
        for (int i = 0; i < 10; i++) {
            new Thread() {
                public void run() {
                    for (int j = 0; j < 1000; j++)
                        test.increase();
                };
            }.start();

        }

        while (Thread.activeCount() > 1) // 保证前面的线程都执行完
            Thread.yield();

        System.out.println(test.inc);

    }
}
