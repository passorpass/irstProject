package workwork;

public class ALlout {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.NoOfWheels());
        Motorbike motorbike = new Motorbike();
        System.out.println(motorbike.NoOfWheels());
        System.out.println("--------------------");
        MyDoor myDoor = new MyDoor();
        myDoor.closeDoor();
        myDoor.openDoor();
        myDoor.bulletproof();
        myDoor.theftproof();
        myDoor.waterproof();
        System.out.println("--------------------");

        aidou aidou = new aidou();
        String[] arr = {"张三","李四","王五"
        };
        for(int i = 0 ; i < 3 ; i ++){
            aidou.action();
            aidou.move();
            aidou.Tv();
            aidou.dance();
            aidou.sing();
            System.out.println(aidou.Person_name(arr[i]));
            System.out.println("----------------------");
        }
    }
}
