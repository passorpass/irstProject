package workwork;

public class Include {
    public static void main(String[] args) {
       /*
        A.B  b = new A().new B();
        System.out.println(b.a);
        b.testB();


        */
        new A().new B().testB();
        E e = new E() {
            @Override
            public void test1() {

            }

            @Override
            public void test2() {

            }

            @Override
            public void test3() {

            }
        };
        e.test1();
        e.test2();
        e.test3();
    }
    G g = new G();
    G g2 = new G();
    {
        G g3 = new G();
    }
}
class A{
    public class B{
       private int a = 10;
        public void testB(){
            System.out.println("testB被调用了"+a);
        }
    }
}
interface E{
    void test1();
    void test2();
    void test3();
}
class G{
    public G(){
        System.out.println("G类的构造方法");
    }
    {
        System.out.println("G类的构造代码块");
    }
    static {
        System.out.println("G类的静态代码块");
    }
}