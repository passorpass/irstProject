package packpakc;
import java.util.*;
public class Arrays_oo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList list = new ArrayList();
    int length = sc.nextInt();
    for(int i = 0 ; i < length; i++){
        list.add(sc.next());

    }
        //修改
        list.set(0,"后刘");
        System.out.println(list.toString());
        //删除
        Object obj1 = list.get(0);
        Object obj2 = list.get(length-1);
        list.remove(obj1);
        list.remove(obj2);
        System.out.println(list.toString());
        //添加
        list.add("hello");
        list.add("educoder");
        System.out.println(list.toString());
        //修改
        list.set(2,"list");
        System.out.println(list.toString());
        System.out.println(list.size());
        for(int i = 0 ; i < length ; i++){
            System.out.println(list.get(i));
        }



    }
}
