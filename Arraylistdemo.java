import java.util.*;
 class Arraylistdemo{
    public static void main(String[] args) {
        ArrayList<person> l=new ArrayList<>();
        l.add("dog");
        l.add("elephant");
        l.add("A");
        l.add(10);
        l.add("A");
            l.add(null);
            System.out.println(l);
            l.remove(2);
            System.out.println(l);
            l.add(2,"M");
            l.add("N");

            System.out.println(l);
       
       
       
       
    }
}