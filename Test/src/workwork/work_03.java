package workwork;

import java.util.*;

public class work_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1930,"乌拉圭");
        hashMap.put(1934,"意大利");
        hashMap.put(1938,"意大利");
        hashMap.put(1950,"乌拉圭");
        hashMap.put(1954,"德国");
        hashMap.put(1958,"巴西");
        hashMap.put(1962,"巴西");
        hashMap.put(1966,"英格兰");
        hashMap.put(1970,"巴西");
        hashMap.put(1974,"德国");
        hashMap.put(1978,"阿根廷");
        hashMap.put(1982,"意大利");
        hashMap.put(1986,"阿根廷");
        hashMap.put(1990,"德国");
        hashMap.put(1994,"巴西");
        hashMap.put(1998,"法国");
        hashMap.put(2002,"巴西");
        hashMap.put(2006,"意大利");

        int year = sc.nextInt();
        Integer a = year;
        Set<Integer> keys = hashMap.keySet();
        if(hashMap.containsKey(a)){
                System.out.println(hashMap.get(a));
            }else {
                System.out.println("该年没有举办世界杯");
            }




        HashMap<String,String> hashMap1 = new HashMap<>();
        hashMap1.put("Tom","CoreJava");
        hashMap1.put("Johm","Oracle");
        hashMap1.put("Susan","Oracle");
        hashMap1.put("Jerry","JDBC");
        hashMap1.put("Jim","Unix");
        hashMap1.put("Kevin","JSP");
        hashMap1.put("Lucy","JSP");
        hashMap1.put("Allen","JDBC");

        hashMap1.remove("Lucy");
        hashMap1.put("CoreJava","JSP");

        Set<Map.Entry<String, String>> entries = hashMap1.entrySet();

        for(Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "    " + entry.getValue() );


        }


        System.out.println("========================");
        Set<String> set =  hashMap1.keySet();
        for(String key : set){
            //System.out.println(key + " " + hashMap1.get(key));
            if((hashMap1.get(key).equals("JSP"))) {
                String[] teacher = new String[hashMap1.size()];
                for (int i = 0; i < teacher.length; i++) {
                    teacher[i] = key;
                }
                List<String> list = new ArrayList<>();
                for (int i = 0; i < teacher.length; i++) {
                    list = Collections.singletonList(teacher[i]);
                }
                System.out.println(list + "这些老师都是教JSP的");


            }

        }




        }


        }


class football{
    private int year;
    private String count;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public football(int year , String count){
        this.count=count;
        this.year= year;
    }

}
class Theacher{
    private String name;
    private String classs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
    public Theacher(String name , String classs){
        this.name=name;
        this.classs=classs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theacher theacher = (Theacher) o;
        return Objects.equals(name, theacher.name) && Objects.equals(classs, theacher.classs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, classs);
    }
}