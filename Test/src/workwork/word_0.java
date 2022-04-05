package workwork;
import jdk.nashorn.internal.runtime.StoredScript;

import java.util.*;
import java.lang.*;
import java.util.Map.Entry;
public class word_0 {
    public static void main(String[] args) {


        /*
        String str = "ni hao wo shi ni baba";

        StringTokenizer stringTokenizer = new StringTokenizer(str);

        while(stringTokenizer.hasMoreTokens()){


            System.out.println(stringTokenizer.nextToken());

        }


        int len = str.indexOf(stringTokenizer.nextToken(str));
        System.out.println(len);

         */
        StudentDemo demo=new StudentDemo();
        Scanner sc=new Scanner(System.in);
        String next=sc.nextLine();
        sc.close();
        //统一单词计数


        Map<String, Integer> map = demo.getMap(next);
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            //System.out.println("单词："+entry.getKey()+"---首次出现的角标"+entry.getValue());
            System.out.println("该单词"+entry.getKey()+"---"+"出现的次数为:"+entry.getValue());
        }
        //统计单词出现的个数

        List<Map.Entry<String,Integer>> infos =
                new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(infos, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String,Integer> o1,
                               Map.Entry<String,Integer> o2){
                return (o2.getValue()) + o1.getValue();//+为降-为升
            }
        });



        }

    }

class StudentDemo {
    public Map<String, Integer> getMap(String str) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        //使用StringTokenizer进行字符串的输入
        int count;

        StringTokenizer st = new StringTokenizer(str);
        String s;//定义一个空的String类型的变量

        while(st.hasMoreTokens()){


            //将每一个输入的单词进行分开操作
            s=st.nextToken(" ");
            //System.out.println(s);

            int n = str.indexOf(s);
            //统计每一个单词出现的位置，角标
            //System.out.println(n);
            //将分开的单位，和统计的单词放入Hashmap中进行返回。
            //map.put(s,n);

            if(map.containsKey(s)){
                count = map.get(s);
                map.put(s,count+1);
            }else{
                map.put(s,1);
            }
        }

        return map;

    }



}



