

abstract class Whatsapp1{
    static int a=10;
    int b=20;
    abstract public void send();
}


class Whatsapp2 extends Whatsapp1{
    public void send(){
        System.out.println("Whatsapp 2");
    }
}


class Whatsapp3 extends Whatsapp2{
    public void send(){
        System.out.println("Whatsapp 3");
    }
}


class A{
    public static void main(String[] args) {
        Whatsapp3 w = new Whatsapp3();
        w.send();
    }
}