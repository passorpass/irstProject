package workwork;
import java.util.*;
import java.lang.*;
import java.util.Map.Entry;
public class word_0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        String str = "ni hao wo shi ni baba";

        StringTokenizer stringTokenizer = new StringTokenizer(str);

        while(stringTokenizer.hasMoreTokens()){


            System.out.println(stringTokenizer.nextToken());

        }


        int len = str.indexOf(stringTokenizer.nextToken(str));
        System.out.println(len);

         */
        StudentDemo demo = new StudentDemo();
        String str = sc.nextLine();
        Map<String,Integer> map = demo.getMap(str);
        Set<Entry<String,Integer>> entrySet = map.entrySet();
        for(Entry<String,Integer> entry : entrySet){
            System.out.println("单词："+entry.getKey()+"---首次出现的角标"+entry.getValue());
        }



    }
}
class StudentDemo {
    public Map<String, Integer> getMap(String str) {
        Map<String, Integer> map = new HashMap<String, Integer>();


    }



}



