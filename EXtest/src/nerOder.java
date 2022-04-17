import java.lang.Thread;
public class nerOder {
    public static void main(String[] args) throws Exception {


        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        MYThread myThread = new MYThread("AA",c,b);
        MYThread myThread2 = new MYThread("CC",b,a);
        MYThread myThread1 = new MYThread("BB",a,c);


    myThread.start();

    myThread1.start();

    myThread2.start();










    }

}
class MYThread extends java.lang.Thread  {

    private String name;
    private Object prev;
    private Object self;
    public MYThread(String name, Object prev, Object self){
        this.name=name;
        this.prev=prev;
        this.self=self;
    }
    public void run(){
        int count = 5 ;
        while(count > 0){
            synchronized (prev){
                synchronized (self){
                    System.out.println("JavaThread" + name);
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
        System.
                exit(0);

    }
}