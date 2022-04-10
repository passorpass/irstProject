import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        Mythread mythread = new Mythread(num);
        mythread.start();
        try {
            mythread.join();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
class Mythread extends Thread {
     int num = 0;

    public Mythread(int num) {
        this.num = num;
    }
    public void run(){
        System.out.println("子线程计算结果为："+run(num));
    }


    public int run(int num) {
        if(num < 3){
            return 1;
        }
        else {
            return run(num-1)+run(num-2);
        }
    }
}

