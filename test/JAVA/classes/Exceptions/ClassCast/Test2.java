class Parent{
    public void show(){
        System.out.println("hi");
    }
}

class Child extends Parent{
    
}

class Test2{
    public static void main(String[] args)throws Exception{
        Parent p=new Parent();
                                                    //ClassCastException: class Parent cannot be cast to class Child
        Child c=(Child)p;
        c.show();
    }
}