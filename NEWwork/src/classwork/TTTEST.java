package classwork;

import java.util.Arrays;
import java.util.Scanner;

public class TTTEST {
    public static void main(String[] args) {
      /*绝对值
       Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println(String.format("%.6f",Math.abs(x)));

       */
        /*交换
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(b+" "+a);

         */
        Scanner sc = new Scanner(System.in);
        String[]  str =sc.nextLine().split("");
        for(int i = 0 ; i < str.length ; i++){
            if(i % 2 == 0){
                int o=Integer.parseInt(str[i]);
                o = 0 ;
                String str1 = String.valueOf(o);
                int b = Integer.parseInt(str1);
                System.out.println(Integer.toHexString(b));

            }
        }

    }
}
