package test_first;
import java.util.*;
public class String_more {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentDemo demo=new StudentDemo();
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        sc.close();
        List<String> list1=demo.splitPartition(str1);
        List<String> list2=demo.tokenPartition(str2);
        for(String s:list1){
            System.out.println(s);
        }
        System.out.println();
        for(String s:list2){
            System.out.println(s);
        }
    }
}

class StudentDemo{

    //使用String.split()方法分割
    public List<String> splitPartition(String str){
        List<String> list=new ArrayList<String>();

//请在此添加实现代码
/********** Begin **********/
    String[] splits = str.split("\\|");
    for(String s:splits){
        list.add(s);
    }

/********** End **********/


        return list;
    }

    //使用StringTokenizer类进行分割
    public List<String> tokenPartition(String str){
        List<String> list=new ArrayList<String>();
        //请在此添加实现代码
/********** Begin **********/
    String[] strArray = str.split("\\?");
    for(String s : strArray){
        list.add(s);
    }
/********** End **********/


        return list;
    }

}