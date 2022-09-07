class Parent{
    public void test(){
        System.out.println("From parent non-ststic");
    }
    public static void tets(){
        System.out.println("From parent ststic");
    }
}
class Child2{
    public static void main(String[] args){
        Parent p=new Parent();
        p.tets();
        Parent p1=new Child2();
        p1.test();
    }
    public void test(){
        System.out.println("From parent non-ststic");
    }
}