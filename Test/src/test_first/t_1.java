package test_first;
import java.util.*;
public class t_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pppName = sc.next();
        int pppAge = sc.nextInt();
        String bpName = sc.next();
        int bpAge = sc.nextInt();
        String ppcName = sc.next();
        int ppcAge = sc.nextInt();
        String bcName = sc.next();
        int bcAge = sc.nextInt();
        // 测试运动员(乒乓球运动员和篮球运动员)
        // 乒乓球运动员
        // 通过带参构造函数实例化PingPangPlayer对象ppp
        // 输出'name---age'
        // 分别调用sleep()、eat()、study()、speak()方法
        /********* begin *********/
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName(pppName);
        ppp.setAge(pppAge);
        ppp.PingPangPlayer(ppp.getName(),ppp.getAge());
        ppp.sleep();
        ppp.eat();
        ppp.study();
        ppp.speak();
        /********* end *********/
        System.out.println("----------------");
        // 篮球运动员
        // 通过带参构造函数实例化BasketballPlayer对象bp
        // 输出'name---age'
        // 分别调用sleep()、eat()、study()方法
        /********* begin *********/
        BasketballPlayer bp = new BasketballPlayer();
        bp.BasketballPlayer(bpName,bpAge);
        bp.sleep();
        bp.eat();
        bp.study();
        /********* end *********/
        System.out.println("----------------");
        // 测试教练(乒乓球教练和篮球教练)
        // 乒乓球教练
        // 通过带参构造函数实例化PingPangCoach对象ppc
        // 输出'name---age'
        // 分别调用sleep()、eat()、teach()、speak()方法
        /********* begin *********/
        PingPangCoach ppc = new PingPangCoach();
        ppc.PingPangCoach(ppcName,ppcAge);
        ppc.sleep();
        ppc.eat();
        ppc.teach();
        ppc.speak();
        /********* end *********/
        System.out.println("----------------");
        // 篮球教练
        // 通过带参构造函数实例化BasketballCoach对象bc
        // 输出'name---age'
        // 分别调用sleep()、eat()、teach()方法
        /********* begin *********/
        BasketballCoach bc = new BasketballCoach();
        bc.BasketballCoach(bcName,bcAge);
        bc.sleep();
        bc.eat();
        bc.teach();
        /********* end *********/
        System.out.println("----------------");
    }
}

// 说英语接口 声明抽象方法speak()
interface SpeakEnglish {
    /********* begin *********/
    abstract void speak();
    /********* end *********/
}

// 定义人的抽象类Person 封装name和age
// 无参构造函数
// 有参构造函数初始化name和age
// 定义具体方法sleep() 输出'人都是要睡觉的'
// 抽象方法eat()（吃的不一样）
abstract class Person {
    /********* begin *********/
    private String name;
    private int age;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name = name;
    }
    public void Person(){

    }
    public void Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(getName()+"---"+getAge());
    }
    public void sleep(){
        System.out.println("人都是要睡觉的");
    }
    abstract void eat();
    /********* end *********/
}

// 定义运动员Player（抽象类）继承自Person类
// 无参构造函数
// 有参构造函数初始化name和age
// 运动员学习内容不一样，抽取为抽象 定义抽象方法study()
abstract class Player extends Person {
    /********* begin *********/

    public void Player(){

    }
    public void Player(String name , int age){

        System.out.println(getName()+"---"+getAge());
    }
    abstract void study();
    /********* end *********/
}

// 定义教练Coach（抽象类）继承自Person类
// 无参构造函数
// 有参构造函数初始化name和age
// 教练教的不一样 定义抽象方法teach()
abstract class Coach extends Person {
    String name;
    int age;
    /********* begin *********/
    public void Coach(){

    }
    public void Coach(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name+"---"+age);
    }
    abstract void teach();
    /********* end *********/
}

// 定义乒乓球运动员具体类PingPangPlayer 继承自Player类并实现SpeakEnglish类（兵乓球运动员需要说英语）
// 无参构造函数
// 有参构造函数初始化name和age
// 实现自己的eat()方法 输出'乒乓球运动员吃大白菜，喝小米粥'
// 实现自己的study()方法 输出'乒乓球运动员学习如何发球和接球'
// 实现自己的speak()方法 输出'乒乓球运动员说英语'
class PingPangPlayer extends Player implements SpeakEnglish {
    String name;
    int age;
    /********* begin *********/
    public void PingPangPlayer(){

    }
    public void PingPangPlayer(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println(name+"---"+age);

    }
    public void eat(){
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");
    }
    public void study(){
        System.out.println("乒乓球运动员学习如何发球和接球");
    }
    public void speak(){
        System.out.println("乒乓球运动员说英语");
    }
    /********* end *********/
}

// 定义篮球运动员具体类BasketballPlayer 继承自Player类 不需要继承接口，因为他不需要说英语
// 无参构造函数
// 有参构造函数初始化name和age
// 实现自己的eat()方法 输出'篮球运动员吃牛肉，喝牛奶'
// 实现自己的study()方法 输出'篮球运动员学习如何运球和投篮'
class BasketballPlayer extends Player {
    String name;
    int age;
    /********* begin *********/
    public void BasketballPlayer(){

    }
    public void BasketballPlayer(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(name+"---"+age);
    }
    public void eat(){
        System.out.println("篮球运动员吃牛肉，喝牛奶");
    }
    public void study(){
        System.out.println("篮球运动员学习如何运球和投篮");
    }
    /********* end *********/
}

// 定义乒乓球教练具体类 PingPangCoach 继承自Coach类并实现SpeakEnglish类（兵乓球教练需要说英语）
// 无参构造函数
// 有参构造函数初始化name和age
// 实现自己的eat()方法 输出'乒乓球教练吃小白菜，喝大米粥'
// 实现自己的teach()方法 输出'乒乓球教练教如何发球和接球'
// 实现自己的speak()方法 输出'乒乓球教练说英语'
class PingPangCoach extends Coach implements SpeakEnglish {
    /********* begin *********/
    public void PingPangCoach(){

    }
    public void PingPangCoach(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println(name+"---"+age);
    }
    public void eat(){
        System.out.println("乒乓球教练吃小白菜，喝大米粥");
    }
    public void teach(){
        System.out.println("乒乓球教练教如何发球和接球");
    }
    public void speak(){
        System.out.println("乒乓球教练说英语");
    }
    /********* end *********/
}

// 定义篮球教练具体类BasketballCoach 继承自Coach类 不需要继承接口，因为他不需要说英语
// 无参构造函数
// 有参构造函数初始化name和age
// 实现自己的eat()方法 输出'篮球教练吃羊肉，喝羊奶'
// 实现自己的teach()方法 输出'篮球教练教如何运球和投篮'
class BasketballCoach extends Coach {
    /********* begin *********/
    public void BasketballCoach(){

    }
    public void BasketballCoach(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println(name+"---"+age);

    }
    public void eat(){
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }
    public void teach(){
        System.out.println("篮球教练教如何运球和投篮");
    }
    /********* end *********/
}
/* 2.1.3方法的重写规则
1).参数列表必须完全与被重写方法的相同；
2).返回类型必须完全与被重写方法的返回类型相同；
3).访问权限不能比父类中被重写的方法的访问权限更低；
4).父类的成员方法只能被它的子类重写；
5).声明为final的方法不能被重写；
6).声明为static的方法不能被重写，但是能够被再次声明；
7).子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为private和final的方法；
8).子类和父类不在同一个包中，那么子类只能够重写父类的声明为public和protected的非final方法；
9).重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常，但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以；
10).构造方法不能被重写；
11).如果不能继承一个方法，则不能重写这个方法。
*/
/*2.2.2重载规则
1).被重载的方法必须改变参数列表(参数个数或类型或顺序不一样)；
2).被重载的方法可以改变返回类型；
3).被重载的方法可以改变访问修饰符；
4).被重载的方法可以声明新的或更广的检查异常；
5).方法能够在同一个类中或者在一个子类中被重载；
6).无法以返回值类型作为重载函数的区分标准。
*/
/*
重写与重载之间的区别
区别点            重载方法        重写方法
参数列表       必须修改        一定不能修改
返回类型       可以修改        一定不能修改
异常                可以修改        可以减少或删除，一定不能抛出新的或者更广的异常
访问                可以修改        一定不能做更严格的限制（可以降低限制）
总结
方法的重写和重载是Java多态性的不同表现，重写是父类与子类之间多态性的一种表现，重载是一类中多态性的一种表现。
*/
/*访问控制修饰符
Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java支持4种不同的访问权限。
默认的，也称为 default，在同一包内可见，不使用任何修饰符；
私有的，以 private 修饰符指定，在同一类内可见；
共有的，以 public 修饰符指定，对所有类可见；
受保护的，以 protected 修饰符指定，对同一包内的类和所有子类可见。
我们可以可以通过以下表来说明访问权限：
访问控制
修饰符      当前类      同一包内     子孙类      其他包
public             Y                   Y                  Y                   Y
protected      Y                   Y                  Y                  N
default           Y                   Y                  N                 N
private            Y                  N                  N                 N
*/
/*3，Java多态
多态就是同一个接口，使用不同的实例执行不同操作。
3.1 多态的实现方式 重写、接口、抽象类和抽象方法。
*/
/*4，Java抽象类
1).使用abstract class来定义抽象类，抽象类不能被实例化；
2).抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类；
3).抽象类中的抽象方法只是声明，不包含方法体；
4).构造方法，类方法（用static修饰的方法）不能声明为抽象方法；
5).任何子类必须重写父类的抽象方法，或者声明自身为抽象类。
*/
/*abstract class Employee{
    //抽象方法
    public abstract double computePay();
}
/*4.2继承抽象类
 *//*
class Salary extends Employee{
    public double computePay(){
        return 0;
    }
}
/*
5，Java封装
封装（英语：Encapsulation）是指，一种将抽象性函式接口的实现细节部份包装、隐藏起来的方法。
封装的优点：
1).良好的封装能够减少耦合；
2).类内部的结构可以自由修改；
3). 可以对成员变量进行更精确的控制；
4). 隐藏信息，实现细节。
实现Java封装的步骤：
1). 修改属性的可见性来限制对属性的访问；
2).对每个值属性提供对外的公共方法访问。
*/
/*
6，Java接口
1).接口，在Java编程语言中是一个抽象类型，是抽象方法的集合，接口通常以interface来声明；
2).一个实现接口的类，必须实现接口内所描述的所有方法，否则就必须声明为抽象类；
3).接口不能包含成员变量，除了 static 和 final 变量；
4).接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 public abstract；
5).接口中可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量；
6).接口中的方法是不能在接口中实现的，只能由实现接口的类来实现接口中的方法；
7).类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常；
8).类在重写方法时要保持一致的方法名，并且应该保持相同或者相兼容的返回值类型；
9).接口的继承使用extends关键字,允许多重继承,可能定义或继承相同的方法。
*/