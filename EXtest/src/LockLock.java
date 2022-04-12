import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Thread;
public class LockLock {
    public static void main(String[] args) {

        final Insert_3 insert3 = new Insert_3();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                insert3.insert(Thread.currentThread());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                insert3.insert(Thread.currentThread());
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                insert3.insert(Thread.currentThread());
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
class Insert_3{
    public static int num ;

    public void insert(Thread thread){

        for(int i = 0 ; i < 5 ; i++){
            num++;
            System.out.println(num);
        }
    }
}
