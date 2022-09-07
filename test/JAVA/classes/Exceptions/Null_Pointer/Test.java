class Parent{
    public void show(){
        System.out.println("hi");
    }
}

class Child extends Parent{
    
}

class Test{
    public static void main(String[] args){
        Parent p=null;
        p.show();
    }
}