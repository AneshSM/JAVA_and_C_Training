import java.util.*;
public class demo
{
    public static void main(String args[])
    {
        LinkedList a=new LinkedLis t();
        a.add("nulljnxoidf");
        a.add(2);
        a.add(3);
        System.out.println(a);
        a.add(1,3);
        System.out.println(a);

        LinkedList b=new LinkedList();
        b.add("nulljnxoidf");
        b.add(2);
        b.add(3);
        System.out.println(b);
        b.add(1,3);
        System.out.println(b);

        a.addAll(b);
        System.out.println(a);
    }
}