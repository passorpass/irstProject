package packpakc;
import java.util.*;
public class gather {
    public static void main(String[] args) {
        /*
        Java中的集合分为两大家族，一个是Collection家族，
        Collection家族有三大成员：List、Queue、Set，
        这三大成员有三个子类（实际还有很多，这里不一一列举）分别是，
        ArrayList，LinkedList，HashSet，这个家族有一个特点，
        那就是他们都是单身，集合中的元素都是独立存在的。
        另一个就是Map家族了，这个家族的特点就是他们都是成双成对
        （key和value）一起出现的，让Collection家族很是羡慕啊^_^。

        */
        /*
        //Linkedlist集合
        LinkedList list = new LinkedList();
        list.add("www.educoder.net");
        //HashSet集合
        HashSet set = new HashSet();
        set.add("www.educoder.net");
        //HashMap集合
        HashMap map = new HashMap();
        map.put("address", "www.educoder.net");
        //ArraysList集合
        ArrayList lIst = new ArrayList();
        lIst.add("www.educoder.net");


         */

/*
        System.out.println(lIst.toString());
        System.out.println(map.toString());
        System.out.println(set.toString());
        System.out.println(list.toString());

 */
        gather g = new gather();
        Map map = g.getHashMap();
        System.out.println(map.get("adress"));
        LinkedList list = g.getLinkedList();
        System.out.println(list.get(0));
        ArrayList arr = g.getArrayList();
        System.out.println(arr.get(0));
        HashSet set = g.getHashSet();
        Scanner sc =new Scanner(System.in);


        for (Object object : set) {
            System.out.println(object);
        }
            List<String> list2 = new ArrayList<String>();
        for(int i = 0 ; i < 3 ; i++) {
            list2.add(sc.next());
        }


            for(int j = 0 ; j < list2.size() ; j++){
                System.out.println("集合的第"+(j+1)+"个数据为："+list2.get(j));
            }


        sc.close();

    }

    public Map getHashMap() {
        HashMap map = new HashMap();
        map.put("adress", "www.educoder.net");
        return map;
    }

    public LinkedList getLinkedList() {
        /********** Begin **********/
        LinkedList list = new LinkedList();
        list.add("www.educoder.net");
        return list;
    }

    public ArrayList getArrayList() {
        /********** Begin **********/
        ArrayList arr = new ArrayList();
        arr.add("www.educoder.net");
        return arr;
    }

    public HashSet getHashSet() {
        /********** Begin **********/
        HashSet set = new HashSet();
        set.add("www.educoder.net");
        return set;
    }
}