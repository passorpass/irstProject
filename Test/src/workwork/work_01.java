package workwork;

import java.util.Arrays;
import java.util.Scanner;

public class work_01 {
    public static void main(String[] args) {

        Studens[] studens = new Studens[3];
        studens[0] = new Studens(2012210211, "张三", "男", 18);
        studens[1] = new Studens(2012210212, "李四", "男", 28);
        studens[2] = new Studens(2012210213, "王五", "女", 8);
        System.out.println("----------------------学生遍历--------------------------");
        String arr_0[] = {"张三", "李四", "王五"
                , "后刘"};
        for (int i = 0; i < arr_0.length; i++) {
            System.out.println(arr_0[i]);

        }
        System.out.println(Arrays.toString(arr_0));
        System.out.println("----------------------数组求和--------------------------");
        int[] arr_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < arr_1.length; i++) {
            sum += arr_1[i];
        }
        System.out.println(sum);
        System.out.println("----------------------书名--------------------------");
        System.out.println("书名：java大全       编号：12138");
        System.out.println("书名：python大全     编号：12148");
        System.out.println("书名：mysql大全      编号：11235");
        System.out.println("输入对应编号查看详细内容");
        Scanner sc = new Scanner(System.in);

        Book[] books = {
                new Book(12138,"java大全 ",8001,45),
                new Book(12148,"python大全 ",3564,83),
                new Book(11235,"mysql大全 ",7812,88),

        };
        int id_book = Integer.parseInt(sc.next());
        for(Book book : books){
            if(id_book == book.getCounts()){
                System.out.println(book);
                return;
            }


        }
        System.out.println("No Find Book");



        /*
        int[] n = new int[books.length];
        for(int i = 0 ; i < books.length ; i++){
             n[i] = books[i].counts(i+1);
        }


         */

    }
}

class Studens {
    private int number;
    private String name;
    private String sex;
    private int age;



    public  Studens(){

    }
    public  Studens(int number,String name,String sex,int age){
        this.number=number;
        this.name=name;
        this.sex=sex;
        this.age=age;
        System.out.println("学号："+number+",姓名："+name+",年龄："+age+",性别："+sex);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Studens{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
class Book {
    private int counts;
    private String name_book;
    private int number_book;
    private int worth_book;

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public int getNumber_book() {
        return number_book;
    }

    public void setNumber_book(int number_book) {
        this.number_book = number_book;
    }

    public int getWorth_book() {
        return worth_book;
    }

    public void setWorth_book(int worth_book) {
        this.worth_book = worth_book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "counts=" + counts +
                ", name_book='" + name_book + '\'' +
                ", number_book=" + number_book +
                ", worth_book=" + worth_book +
                '}';
    }

    public Book(){

    }
    public Book(int counts ,String name_book,int number_book,int worth_book){
    this.counts=counts;
    this.name_book=name_book;
    this.number_book=number_book;
    this.worth_book=worth_book;

    }

    }




