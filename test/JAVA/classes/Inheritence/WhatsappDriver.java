class Whatsapp1{
    public void msg(){
        System.out.println("MESSAGE");
    }
}
class Whatsapp2 extends Whatsapp1{
    public void call(){
        System.out.println("CALL");
    }
}
class Whatsapp3 extends Whatsapp2{
    public static void videocal(){
        System.out.println("VIDEOCALL");
    }
}
class Whatsapp4 extends Whatsapp3{
    public static void status(){
        System.out.println("STATUS");
    }
}
class WhatsappDriver{
    public static void main(String[] args) {
        Whatsapp4 w4= new Whatsapp4();
        w4.msg();
        w4.call();
        w4.videocal();
        w4.status();
    }
}
