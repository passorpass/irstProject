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
        System.out.println("??????????????????"+getName()+"????????????"+getAge()+"??????"+",????????????"+getFood());
    }
    public void action(){
        System.out.println(getName()+"????????????");
    }
    public void speak(){
        System.out.println("????????????");
   }
   public void grap(){
       System.out.println("???????????????");
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
        System.out.println("??????????????????"+getName()+"????????????"+getAge()+"??????"+",????????????"+getFood());

    }
    public void action(){
        System.out.println(getName()+"???????????????");
    }
    public void speak(){
        System.out.println("????????????");
    }
    public void grap(){
        System.out.println("??????????????????");
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
        System.out.println("?????????????????????"+getNumber()+"????????????????????????????????????");
    }
    public void like(){
        System.out.println("???????????????");
    }
    public void action(){
        System.out.println("????????????????????????");
    }
    public void eat(){
        System.out.println("????????????????????????");
    }
}
