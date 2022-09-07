class SmartphoneDriver{
    public static void main(String[] args) {
        Moto m=new Moto("MOTO",12999,"Black");
        m.display();
    }
}
class Smartphone{
    String brand,color;
    int price;
    Smartphone(){}
    Smartphone(String brand,int price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
    // public void display(){
    //     return "Brand:"+brand+" "+"\nPrice"+price+"\ncolor"+color;
    // }
}
class Moto extends Smartphone{
    Moto(String brand,int price,String color){
        super( brand, price, color);
    }
    public void display(){
        System.out.println("Brand: "+brand+" "+"\nPrice: "+price+"\ncolor: "+color);
    }
}