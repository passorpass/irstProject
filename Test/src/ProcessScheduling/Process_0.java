package ProcessScheduling;

public class Process_0 extends Thread {



    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
static class Mythread implements Runnable{

        private Thread mythread;

        public void run(){
            for(int i = 0 ; i < 10 ; i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
        public void start(){
            if(mythread == null){
                mythread = new Thread(this);
                mythread.start();
            }
        }

}

    public static void main(String[] args) {
        Process_0 p = new Process_0();
        p.run();
        Mythread my = new Mythread();
        my.start();

    }
}