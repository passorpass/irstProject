package classwork;

import java.security.Key;
import java.util.*;

public class TTTEST {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,j,k ,n;
        n=in.nextInt(); //先读入数据
        while(n!=0){  //判断n是否为0，为0则跳出循环
            if(n%4==2){  //因为n取值范围太大，求出具体的斐波那契数long装不下，所以找规律，发现F(2)=18,F(6)=123,F(10)=843，满足条件，而他们的下标除以4的余数是2。
                System.out.print("yes\n");
            }else{
                System.out.print("no\n");
            }
            n = in.nextInt();
             //继续读入数据
        }
    }
}