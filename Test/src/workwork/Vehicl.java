package workwork;

public abstract class Vehicl {
    abstract String NoOfWheels();
}
class Car extends Vehicl {
    String NoOfWheels() {

        return "四轮车";
    }
}
class Motorbike extends Vehicl {
    String NoOfWheels() {
        return "双轮车";
    }
}

    interface Door {
        void openDoor();



        void closeDoor();
    }
abstract class SafeDoor implements Door{



    abstract void theftproof();

    abstract void waterproof();

    abstract void bulletproof();

}


class MyDoor extends SafeDoor implements Door {
    public void openDoor() {
        System.out.println("开门");
    }

    public void closeDoor() {
        System.out.println("关门");
    }

    void waterproof() {
        System.out.println("防水门");
    }

    void bulletproof() {
        System.out.println("防弹门");
    }

    void theftproof() {
        System.out.println("防盗门");
    }
}
interface Action{
    void action();
    abstract void move();
    abstract void Tv();
}
interface Singer{
    void sing();
}
interface Dancer{
    void dance();
}
abstract class StraterPerson implements Action,Singer,Dancer{
    String Person_name(String name){
        return name;
    }
}
class aidou extends StraterPerson implements Action,Singer,Dancer{
    public void action(){
        System.out.println("这个人是个动作明星");
    }
    public void move(){
        System.out.println("他演过电影");
    }
    public void Tv(){
        System.out.println("也演过电视剧");
    }
    public void sing(){
        System.out.println("同时也是一个唱跳选手");
    }
    public void dance(){
        System.out.println("跳舞也是一绝");
    }
    String Person_name(String name){
        return "那个人就是"+name;
    }
}









