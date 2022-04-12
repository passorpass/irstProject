package ProcessScheduling;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class Process_1 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        CallableThreadTest cts = new CallableThreadTest();
        // 接收
        FutureTask<Integer> ft = new FutureTask<Integer>(cts);
        new Thread(ft, "有返回值的线程").start();
        for (int i = 0; i < 30; i++) {
            System.out.println( "main" + " 的循环变量i的值：" + i);
        }
        try {
            System.out.println("子线程的返回值：" + ft.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

         */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        ThreadCallable t1 = new ThreadCallable(num);
        FutureTask<Integer> ft1 = new FutureTask<>(t1);
        Thread thread1 = new Thread(ft1,"thread1");
        thread1.start();
        try {
            System.out.println("线程的返回值为："+ft1.get());

        }catch (Exception e){
            e.printStackTrace();
        }

        /*
        Scanner sc = new Scanner(System.in);
        int count  = sc.nextInt();
        sc.close();
        CallThreadable callThreadable = new CallThreadable(count);
        FutureTask<Integer> futureTask = new FutureTask<>(callThreadable);
        Thread thread = new Thread(futureTask,"thread");
        thread.start();
        try {
            System.out.println("线程的返回值为："+futureTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }

         */


    }
}
/*class CallableThreadTest implements Callable<Integer> {
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
}

 */

class ThreadCallable implements Callable<Integer>{
    int num ;
    ThreadCallable(int num) {
        this.num = num;
    }
    ThreadCallable(){

    }
    public Integer call() throws Exception{
        return getNum(num);

    }
    private int getNum(int num){
        if(num < 3){
            return 1;
        }
        else {
            return getNum(num-1)+getNum(num-2);
        }
    }
}


/*class CallThreadable implements Callable<Integer>{
    int count ;
    CallThreadable(int count){
        this.count = count;
    }
    CallThreadable(){

    }
    public Integer call() throws Exception{
        return getCount(count);
    }
    private int getCount(int count){
        int i =0 ;
        while (count<=3){
            for( ; i < 10000 ; i++){
                if(i % 55 ==0){
                    count++;
                    System.out.println(count);
                }else {
                   return i;
                }

            }
        }
        return count;
    }
    }

*/