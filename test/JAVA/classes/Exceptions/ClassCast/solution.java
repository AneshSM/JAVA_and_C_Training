class Parent{
    public void show(){
        System.out.println("Hi");
    }
}

class Child extends Parent{

}

class solution{
    public static void main(String[] args){
        Parent p=new Parent();
        
        try{
            Child c=(Child)p;
            c.show();
        }
        catch(ClassCastException e){
            System.out.println("Exception Handelled");
        }
    }
}