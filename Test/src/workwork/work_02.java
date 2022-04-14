package workwork;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class work_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer(10318,"Intel Core i5-10200H","LENOVO","512GB固态硬盘",
                "16GB","NVIDIA " +
                "GeForce GTX1650 4GB",7800));
        computers.add(new Computer(12138,"Intel Core i6-10200H","LENOVO","512GB固态硬盘",
                "16GB","NVIDIA " +
                "GeForce GTX3080 4GB",8800));
        computers.add(new Computer(70128,"Intel Core i7-10200H","LENOVO","512GB固态硬盘",
                "16GB","NVIDIA " +
                "GeForce GTX2077 4GB",9500));
        computers.add(new Computer(87482,"Intel Core i5-10200H","LENOVO","512GB固态硬盘",
                "16GB","NVIDIA " +
                "GeForce GTX950 4GB",4850));
        computers.add(new Computer(32125,"Intel Core i6-10200H","LENOVO","512GB固态硬盘",
                "16GB","NVIDIA " +
                "GeForce GTX1950 4GB",8000));
        computers.add(new Computer(68482,"Intel Core i9-10200H","LENOVO","512GB固态硬盘",
                "16GB","NVIDIA " +
                "GeForce GTX2430 4GB",8750));


        //int ID_find = Integer.parseInt(sc.next());
        //遍历（1）
        for(Computer computer1 : computers){


                System.out.println(computer1);

        }

        System.out.println("--------------------------------------");
        //遍历（2）

        for(int i = 0 ; i < computers.size()  ; i ++){
            System.out.println(computers.get(i));
        }
        // 查找
        System.out.println("请输入电脑编号查看详细电脑的详细内容");
        System.out.println("Computer_1 ID：10318");
        System.out.println("Computer_2 ID：70128");
        System.out.println("Computer_3 ID：87482");
        System.out.println("Computer_4 ID：32125");
        System.out.println("Computer_5 ID：68482");
        System.out.println("Computer_6 ID：12138");
        int Id_Find = Integer.parseInt(sc.next());
        for(Computer computer2 :computers){
            if(Id_Find == computer2.getID_computer()){
                System.out.println(computer2);
            }
        }
        System.out.println("----------------------------ArratList-------------");
        List<Worker> workers1 = new ArrayList<>();
        workers1.add(new Worker("zhang3",18,3000));
        workers1.add(new Worker(",li4",25,3500));
        workers1.add(new Worker("wang5",22,3200));
        //增加
        workers1.add(new Worker("zhao6",24,3300));
        //删除
        workers1.remove(2);
        System.out.println("---------------打印(1)-----------------");
        for(int i = 0 ; i < workers1.size() ; i++){
            System.out.println(workers1.get(i));
        }
        System.out.println("---------------打印(2)-----------------");
        for(Worker worker_0 : workers1){
            System.out.println(worker_0);
        }
        System.out.println("----------------------------LinkeList-------------");
        List<Worker> workers2 = new LinkedList<>() ;
        //添加
        workers2.add(new Worker("zhang3",18,3000));
        workers2.add(new Worker(",li4",25,3500));
        workers2.add(new Worker("wang5",22,3200));
    //删除
        workers2.remove(2);
        //增加
        workers2.add(new Worker("zhao6",24,3300));
        System.out.println("---------------打印(1)-----------------");
        for(int i = 0 ; i < workers2.size() ; i++){
            System.out.println(workers2.get(i));
        }
        System.out.println("---------------打印(2)-----------------");
        Object[] objects = workers2.toArray();
        for(Object o : objects){
            System.out.println(o);
        }



    }

    }

class Computer{
    private int ID_computer;
    private String Cpu_computer;
    private String Main_computer;
    private String Hardpan_computer;
    private String Memory_computer;
    private String Graphics_computer;
    private int Worth_computer;

    public String getMain_computer() {
        return Main_computer;
    }

    public void setMain_computer(String main_computer) {
        Main_computer = main_computer;
    }

    public int getID_computer() {
        return ID_computer;
    }

    public void setID_computer(int ID_computer) {
        this.ID_computer = ID_computer;
    }

    public String getCpu_computer() {
        return Cpu_computer;
    }

    public void setCpu_computer(String cpu_computer) {
        Cpu_computer = cpu_computer;
    }

    public String getHardpan_computer() {
        return Hardpan_computer;
    }

    public void setHardpan_computer(String hardpan_computer) {
        Hardpan_computer = hardpan_computer;
    }


    public String getGraphics_computer() {
        return Graphics_computer;
    }

    public void setGraphics_computer(String graphics_computer) {
        Graphics_computer = graphics_computer;
    }

    public String getMemory_computer() {
        return Memory_computer;
    }

    public void setMemory_computer(String memory_computer) {
        Memory_computer = memory_computer;
    }

    public int getWorth_computer() {
        return Worth_computer;
    }

    public void setWorth_computer(int worth_computer) {
        Worth_computer = worth_computer;
    }

    @Override
    public String toString() {
        return "电脑配置：" +"\n"+
                "编号：" + ID_computer +"\n"+
                "Cpu型号：" + Cpu_computer + '\'' +"\n"+
                "主板型号：" + Main_computer + '\'' +"\n"+
                "硬盘大小：" + Hardpan_computer + '\'' +"\n"+
                "内存大小：" + Memory_computer + '\'' +"\n"+
                "显卡型号：" + Graphics_computer + '\'' +"\n"+
                "价格：" + Worth_computer +
                "\n";
    }

    public Computer(int ID_computer, String Cpu_computer, String Main_computer, String Hardpan_computer,
                    String Memory_computer, String Graphics_computer, int Worth_computer){
        this.Cpu_computer=Cpu_computer;
        this.ID_computer=ID_computer;
        this.Main_computer=Main_computer;
        this.Memory_computer=Memory_computer;
        this.Graphics_computer=Graphics_computer;
        this.Worth_computer=Worth_computer;
        this.Hardpan_computer=Hardpan_computer;
        /*System.out.println("编号："+ID_computer+"\nCpu型号："+Cpu_computer+"\n主板："+Main_computer+"\n" +
                "硬盘："+Hardpan_computer+
                "\n内存："+Memory_computer+"\n显卡型号："+Graphics_computer+
                "\n价格："+Worth_computer);


         */


    }

    public Computer(){

    }

}
class Worker{
    private String name_worker;
    private int age_worker;
    private int salary_worker;

    public String getName_worker() {
        return name_worker;
    }

    public void setName_worker(String name_worker) {
        this.name_worker = name_worker;
    }

    public int getAge_worker() {
        return age_worker;
    }

    public void setAge_worker(int age_worker) {
        this.age_worker = age_worker;
    }

    public int getSalary_worker() {
        return salary_worker;
    }

    public void setSalary_worker(int salary_worker) {
        this.salary_worker = salary_worker;
    }
    public Worker(){

    }
    public Worker(String name_worker,int age_worker,int salary_worker){
        this.age_worker=age_worker;
        this.salary_worker=salary_worker;
        this.name_worker=name_worker;
    }

    @Override
    public String toString() {
        return "工人信息：" +
                "姓名：" + name_worker + '\'' +" "+
                "年龄：" + age_worker +" "+
                "工资：" + salary_worker +"\n"
                ;
    }
}
