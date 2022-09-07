package OOPS;

class ObjClass{
    
    static int simslot=2;
    String color="RED";
    int ram;
    String brand;
    double price=5;

    public void display(){
        System.out.println("Barand="+brand);
        System.out.println("color="+color);
        System.out.println("ram="+ram);
        System.out.println("price="+price);
        System.out.println("simslot="+simslot);
    }

    public static void main(String[] args)
    {
        ObjClass ob1=new ObjClass();
        ObjClass ob2=new ObjClass();
        System.out.println("The Mobile Details:");

    }
}