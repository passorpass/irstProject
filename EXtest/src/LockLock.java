import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Thread;
public class LockLock {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private Lock lock = new ReentrantLock();
    private int num = 0 ;
    public static void main(String[] args) {
        final LockLock lock = new LockLock();

        new Thread(){
            public void run(){

                lock.Insert_3(Thread.currentThread());
            };
        }.start();
        new Thread(){
        public void run(){
            lock.Insert_3(Thread.currentThread());
        };
        }.start();
        new Thread(){
            public void run(){
                lock.Insert_3(Thread.currentThread());
            };
        }.start();
    }





public void Insert_3(Thread thread){

        if(lock.tryLock()){
        try {
            System.out.println(thread.getName()+"得到了锁");
            for(int i = 0 ; i < 5 ; i++){
                arrayList
                        .add(i);
                num++;
                System.out.println(num);


                }

        }catch (Exception e){

                e.printStackTrace();
        }finally {
            System.out.println(thread.getName()+"释放了锁");
            lock.unlock();
        }
        }
        else {
            System.out.println(thread.getName()+"获取锁失败");
        }
}
}
