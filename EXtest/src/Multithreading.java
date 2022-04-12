import java.util.ArrayList;
import java.lang.Thread;
public class Multithreading {
    public static void main(String[] args) {
        final InsertData_0 insertData0 = new InsertData_0();
        final InsertData_1 insertData1 = new InsertData_1();
        new Thread() {
            public void run() {
                insertData0.insert(Thread.currentThread());

            };
        }.start();

        new Thread(){
            public void run(){
                insertData0.insert(Thread.currentThread());
            };
        }.start();

        new Thread(){
            public void run(){
                insertData0.insert(Thread.currentThread());
            };
        }.start();

        for(int i = 0 ; i < 3 ; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    insertData1.insert1(Thread.currentThread());
                }
            }).start();
        }

    }
}

class InsertData_0 {


    private ArrayList<Integer> arrayList = new ArrayList<>();
    private Object object = new Object();

    public synchronized void insert(Thread thread) {
        synchronized (object) {
            for (int i = 0; i < 5; i++) {
                System.out.println(thread.getName() + "在插入数据" + i);
                arrayList.add(i);

            }
        }
    }
}
class InsertData_1{
    private static int num = 0;

    public synchronized void insert1(Thread thread){
        for(int i = 0  ; i <= 5 ; i++){
            num++;
            System.out.println(num);
        }
    }
}