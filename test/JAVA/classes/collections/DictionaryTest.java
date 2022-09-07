import java.util.*;

class DictionaryTest{
    public static void main(String[] args){
        Hashtable h =new Hashtable();
        h.put(1,"hi");
        h.put('A',20);
        h.put(true,200);
        h.put(33.45,false);
        Hashtable<Integer,String> h1= new Hashtable();
        h1.put(1,"ABC");
        h1.put(2,"CBA");
        h1.put(3,"gdfsd");
        h1.put(7938,"fsdfsdfsf fsfs");
        System.out.println("\nHashtable1: "+h);
        System.out.println("\nHashtable2: "+h1+"\n");

        System.out.println("Hashtable1 contains h.containsKey(33.45): "+h.containsKey(33.45)+"\n");
        System.out.println("Hashtable1 contains h.containsValue(200): "+h.containsValue(200)+"\n");
        System.out.println("Hashtable1 contains : "+h.contains()+"\n");
    }
}