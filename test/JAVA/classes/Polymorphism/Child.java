class Parent{
    public static void a(){
        System.out.println("from Parent");
    }
    public void b(){
        System.out.println("from Parent");
    }
}
class Child extends Parent{
    public static void main(String[] args){
        // a();
        // //b();
        // Parent p=new Parent();
        // p.a();
        // Child c=new Child();
        // c.a();
        // Parent p1=new Child();
        // p1.a();
        // Child c1=(Child)p1;
        // c1.a();
        //b();
        //b();
        Parent p=new Parent();
        p.b();
        Child c=new Child();
        c.b();
        Parent p1=new Child();
        p1.b();
        Child c1=(Child)p1;
        c1.b();

    }
    public static void a(){
        System.out.println("from child");
    }
    public void b(){
        System.out.println("from child");
    }
}