package Thread;

import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        Mythread mythread = new Mythread("子线程A");
        mythread.start();
        for(int i = 0 ; i < 30 ; i++){
            System.out.println("main"+i);

        }try {
            mythread.join();

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("main is over");

    }
}
class Mythread extends Thread{
    private String name;
    public Mythread (String name){
        this.name = name;
    }
    public void run(){
        System.out.println("我是子程序，我开始运行了");
    for(int i = 0 ; i < 30 ; i++){
        System.out.println("子线程" + name + "运行" + i);
    try {

        Thread.sleep(500);
    }catch (Exception e){
        e.printStackTrace();
    }
    }
        System.out.println("子程序运行结束");
    }


}