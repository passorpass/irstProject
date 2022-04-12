
import  java.lang.*;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
public class THREAD {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"main has STRAT");
        Thread my = new Thread("A");
        my.start();
        for(int i = 0 ; i < 30 ; i++){
            System.out.println("main has run"+i);
        }
        try {
            my.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("main has over");

    }
}
class Thread extends java.lang.Thread{
    private String name;
    public Thread(){

    }
    public Thread(String name){
        this.name=name;
    }
    public void run(){
        for(int i = 0 ; i < 30 ; i++){
            System.out.println("this has run" + name +"STRAT" + i);
        }
        try {
            Thread.sleep(1210);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("has over ");
    }
}