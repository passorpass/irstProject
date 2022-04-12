package Thread;

import java.util.Scanner;

public class Yield {
    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getName()+"主线程开始运行");
        MyThread_0 my_1 = new MyThread_0("A");
        MyThread_0 my_2 = new MyThread_0("B");
        my_1.start();
        my_2.start();
        System.out.println(Thread.currentThread().getName()+
                "主线程运行结束!");

        Object a =new Object();
        Object b =new Object();
        Object c =new Object();
        MyThread_1 ta = new MyThread_1("E",c,b);
        MyThread_1 tb = new MyThread_1("D",b,a);
        MyThread_1 tc = new MyThread_1("U",a,c);


        new Thread(ta).start();
        Thread.sleep(100);
        new Thread(tb).start();
        Thread.sleep(100);
        new Thread(tc).start();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        MyThread_3 my_3 = new MyThread_3(num);
        sc.close();
        my_3.start();
        System.exit(0);


    }

}
class MyThread_0 extends Thread{
    private String name;
    public MyThread_0(){

    }
    public MyThread_0(String name){
        this.name=name;
    }
    public void run(){
        for(int i = 0 ; i < 50 ; i++){
            System.out.println(name + "线程" + "执行" + i);
            if(i == 10){
                this.yield();
            }
        }
    }
}
class MyThread_1 implements Runnable{
    private String name;
    private Object prev;
    private Object self;
    public MyThread_1(String name, Object prev, Object self){
        this.name=name;
        this.prev=prev;
        this.self=self;
    }
    public void run(){
        int count = 5 ;
        while(count > 0){
            synchronized (prev){
                synchronized (self){
                    System.out.println(name);
                    count--;

                    self.notify();
                }
                try {
                    prev.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
class MyThread_3 extends Thread{
     int num = 0 ;
    public MyThread_3(){

    }
    public MyThread_3(int num){
        this.num=num;
    }
    public void run(){
        System.out.println(run(num));
    }
    public int run(int num){
        if(num < 3){
            return 1;

        }else{
         return run(num-1)+run(num-2);
        }

    }

}