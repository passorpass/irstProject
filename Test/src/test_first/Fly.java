package test_first;

public class Fly {
    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly();
        Bird b = new Bird();
        b.fly();
        Nsum n1 = new Nsum();
        Njie n2 = new Njie();
        System.out.println(n1.Sum(5));
        System.out.println(n2.Sum(8));
    }
}
interface CanFly{
    public void fly();
}
class Plane implements CanFly{
    public void fly(){
        System.out.println("用机械引擎带动机械翅膀飞");
    }
}
class Bird implements CanFly{
    public void fly(){
        System.out.println("用肉做的翅膀飞");
    }
}
interface Math {
      public int Sum(int num);
}
class Nsum implements Math{
    int sum = 0 ;
    public int Sum (int num){
        for(int i = 0 ; i <= num ; i++){
            sum+=i;
        }
        return sum;
    }
}
class Njie implements Math{
    int sum = 1 ;
    public int Sum(int num){
        for(int i = 1 ; i <= num ; i++){
            sum = sum * i;
        }
        return sum;

    }
}