package Inheritence;
public class GunCreator {

    public static void main(String[] args) {
    // TODO Auto-generated method stub
    Gun g = new Gun();
    g.b = new Bullet();
    g.gunDetails();
    g.b.size = 3;
    g.b.price = 500;
    g.b.color = "grey";
    g.gunDetails();
    }
    
    }
    
     class Gun {
    String gunColor = "Black";
    double gunPrice = 5000;
    Bullet b;
    public void gunDetails() {
    System.out.println(gunColor);
    System.out.println(gunPrice);
    b.bulletDetails();
    
    }
    }
    
     class Bullet {
    double size = 2;
    double price = 10;
    String color = "red";
    public void bulletDetails() {
    System.out.println(size);
    System.out.println(price);
    System.out.println(color);
    }
    }
    