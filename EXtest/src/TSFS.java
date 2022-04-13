import java.util.Arrays;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.ParseException;
public class TSFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       double[] arr1 ={ sc.nextFloat()};
       double[] arr2 = {sc.nextDouble()};
       sc.close();




        double multiply = (double) (arr1[0] * arr2[0]);
        double divide = (double) (arr1[0] / arr2[0]);
        System.out.printf("%.6f",arr1[0]);
        System.out.print("*");
        System.out.printf("%.6f",arr2[0]);
        System.out.print("=");
        System.out.printf("%.6f",multiply);
        System.out.println("\t");

        System.out.printf("%.6f",arr1[0]);
        System.out.print("/");
        System.out.printf("%.6f",arr2[0]);
        System.out.print("=");
        System.out.printf("%.6f",divide);
    }

}