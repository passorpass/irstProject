package packpakc;
import java.util.*;
class Hashmap {
    public static void main(String[] args) {
        Map<String,Integer> menuDict = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++){
            menuDict.put(sc.next(), sc.nextInt());
        }
        sc.close();
        System.out.println(menuDict.toString());
        menuDict.put("lamb",50);
        System.out.println(menuDict.toString());
        System.out.println(menuDict.get("fish"));
        System.out.println(menuDict.toString());
        //修改fish的value值
        menuDict.put("fish",100);
        System.out.println(menuDict.toString());
        menuDict.remove("noodles");
        System.out.println(menuDict.toString());
/*
pizza
40
noodles
30
carrot
20
turkey
34
fish
37

 */
    }
}
