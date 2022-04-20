import java.util.Arrays;
import java.util.Scanner;

public class EXchange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //将String转化为StringBuilder
        String str = sc.nextLine();
        sc.close();
      /*
        char[] chars = new char[100];
        for(int i = 0 ; i < str.length() ; i ++){
            chars[i] = str.charAt(i);
        }
        for(int i = 0 ; i < str.length()-1 ; i++) {
            System.out.print(chars[i]);
        }

      */

        StringBuilder str1 = new StringBuilder(str);
        //进行结尾符号的定位
        int a1 = str1.indexOf("$");
        int a2 = str1.indexOf("¥");

        //进行判断结尾符号
        if(a1 != -1 ){
            //判断是否为$结尾如果是进行美元转化为人民币
            String str2 = str1.substring(0,a1);
            //截取字符串中的数字
            int c1 = Integer.parseInt(str2);
            //将截取的数字进行装箱
            System.out.println(c1*6+"¥");


        }

        else if(a2 != -1){
            //同理¥
            String str3 = str1.substring(0,a2);
            float c2 = Float.parseFloat(str3);
            System.out.println(String.format("%.2f$",c2/6.0));

        }



    }

}


