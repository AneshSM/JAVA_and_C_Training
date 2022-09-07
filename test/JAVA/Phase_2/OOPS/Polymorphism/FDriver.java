package OOPS.Polymorphism;

public class FDriver {
    public static void main(String... args){
        Father obj=new Abcd();
        obj.bike();
    }
}
class Father{
    public void bike(){
        System.out.println("old bike");
    }
}

class Abcd extends Father{
    @Override
    public void bike(){
        System.out.println("new bike");
    }
}