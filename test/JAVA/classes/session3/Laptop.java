class Laptop{
    String model;
    double price;
    String color;
    Laptop(String name,double p,String c){
        this.model=name;
        this.price=p;
        this.color=c;
    }
    {
        System.out.println("Hii");
    }
    public static void main(String[] args){
        Laptop l1 =new Laptop("HP",56000,"White");
        Laptop l2 =new Laptop("Asus",59000,"Red");
        System.out.println(l1.model);
        System.out.println(l2.model);
        System.out.println(l1.price);
        System.out.println(l2.price);
        System.out.println(l1.color);
        System.out.println(l2.color);
    }
}