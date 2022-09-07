class A{
    int i=20;
}
class B extends A{
    int j=10;
    public static void main(String[] args){
        B b= new B();
        System.out.println(b.i);
        System.out.println(b.j);
        A a= new A();
        System.out.println(a.i);
        //System.out.println(a.j);
    }
}