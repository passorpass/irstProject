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
    Object obj1 = list.get(0);
    list.remove(obj1);
    list.remove(list.lastIndexOf(obj1));
    list.add("hello");
    list.add("educoder");
    list.set(2,list);
    System.out.println(list.toString());

    }
}
