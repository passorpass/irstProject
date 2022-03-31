package workwork;
import java.util.*;
public class work_00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dName = sc.next();
        int dAge = sc.nextInt();
        String dFood = sc.next();

        String cName = sc.next();
        int cAge = sc.nextInt();
        String cFood = sc.next();


        int fNumber = sc.nextInt();
        sc.close();

        Dog d = new Dog();
        Cat c = new Cat();
        Family f = new Family();

        d.setName(dName);
        d.setFood(dFood);
        d.setAge(dAge);
        d.Dog(d.getName(), d.getAge(),d.getFood());

        d.toString();
        d.action();
        d.eat();
        d.speak();
        d.grap();



        f.setNumber(fNumber);
        f.Family(f.getNumber());
        f.action();
        f.eat();
        f.like();

        c.setName(cName);
        c.setAge(cAge);
        c.setFood(cFood);
        c.Cat(c.getName(),c.getAge(),c.getFood());

        c.toString();
        c.action();
        c.eat();
        c.speak();
        c.grap();



    }
}
interface Speak{
    abstract void speak();
}
abstract class Animal{
    private String name;
    private int age;
    private String food;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age=age;
    }
    public void setFood(String food){
        this.food=food;
    }
    public String getFood(){
        return this.food=food;
    }
    abstract void eat();
    abstract void action();
}
abstract class Dog_grap extends Animal{
    abstract void grap();
}
abstract class Cat_grap extends Animal{
    abstract void grap();
}
class Dog extends Dog_grap implements Speak{
    void Dog(){

    }
    void Dog(String name , int age , String food){
        this.setAge(getAge());
        this.setFood(getFood());
        this.setName(getName());
        //System.out.println(getName()+"---"+getAge()+"---"+getFood());
    }
    public void eat(){
        System.out.println("我家的狗叫："+getName()+"，今年："+getAge()+"岁了"+",喜欢吃："+getFood());
    }
    public void action(){
        System.out.println(getName()+"喜欢守家");
    }
    public void speak(){
        System.out.println("会汪汪叫");
   }
   public void grap(){
       System.out.println("不多管闲事");
   }
   public String toString(){
        return getName()+"---"+getAge()+"---"+getFood();
   }
}
class Cat extends Cat_grap implements Speak{
    public void Cat(){

    }
    public void Cat(String name,int age , String food){
        this.setName(getName());
        this.setAge(getAge());
        this.setFood(getFood());
        System.out.println(getName()+"---"+getAge()+"---"+getFood());
    }
    public void eat(){
        System.out.println("我家的猫叫："+getName()+"，今年："+getAge()+"岁了"+",喜欢吃："+getFood());

    }
    public void action(){
        System.out.println(getName()+"喜欢抓老鼠");
    }
    public void speak(){
        System.out.println("会喵喵叫");
    }
    public void grap(){
        System.out.println("喜欢多管闲事");
    }
    public String toString(){
        return getName()+"---"+getAge()+"---"+getFood();
    }
}
abstract class Like extends Animal{
    private String family_name;
    private int number;
    abstract void like();
    public void setFamily_name(String family_name){
        this.family_name = family_name;
    }
    public String getFamily_name(){
        return this.family_name;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number=number;
    }

}
class Family extends Like{
    void Family(){

    }
    void Family( int number){

        this.setNumber(getNumber());
        System.out.println("相亲相爱的一家"+getNumber()+"口人都十分的喜欢这些动物");
    }
    public void like(){
        System.out.println("尤其是小狗");
    }
    public void action(){
        System.out.println("喜欢和狗狗一起玩");
    }
    public void eat(){
        System.out.println("也经常给狗狗喂食");
    }
}
