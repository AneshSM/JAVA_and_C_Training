import java.util.ArrayList;
class Arrlist{
    public static void main(String[] args){
        ArrayList a=new ArrayList();
        ArrayList b=new ArrayList();
        a.add(4);
        a.add("abc");
        a.add(true);
        a.add('T');
        System.out.println("\nFirst Array List contains: "+a);
        a.add(1,3.5);
        System.out.println("\nFirst Array List after adding with position  a.add(1,3.5); : "+a);
        System.out.println("\nSize of ArrayList is:  "+a.size());
        
        b.add(5);
        b.add("cba");
        b.add(false);
        b.add('t');
        
        System.out.println("\nSecond Array List contains: "+b);
        
        
        b.addAll(a);
        
        System.out.println("\nSecond Array List after cpying first array list by using  b.addAll(a); : "+b);
        System.out.println("\nSize of ArrayList is:   "+b.size()+"\n");

        b.removeAll(a);
        System.out.println("\nSecond Array List after removing existing valuesof first array list by using  b.removeAll(a); : "+b);
        System.out.println("\nSize of ArrayList is:   "+b.size()+"\n");

        b.remove(2);
        System.out.println("\nAfter  b.remove(2);  Second Array List contains: "+b);
        System.out.println("\nSize of ArrayList is:   "+b.size()+"\n");

        System.out.println("Is second arralist is Empty: "+b.isEmpty());
    
        b.add(null);
        System.out.println("\nAfter adding null value    Second Array List contains: "+b);

        b.add(4);
        System.out.println("\nAfter adding same vale   Second Array List contains: "+b);

        System.out.println();

        System.out.println("Checking wheather Second array list contains null using  b.contains(null) method: "+b.contains(null));
    
        System.out.println();
    }
}