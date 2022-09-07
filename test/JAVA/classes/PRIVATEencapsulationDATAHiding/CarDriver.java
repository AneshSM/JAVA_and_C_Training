import java.util.*;
class CarDriver{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String b,co;
        int n,eno,cc;
        System.out.println("Enter the car details one by one:\n Brand\ncolor\nNumber of seats\nEngine no and cc::\n\n");
        b=sc.next();
        co=sc.next();
        n=sc.nextInt();
        eno=sc.nextInt();
        cc=sc.nextInt();
        
        Car c= new Car(b,co,n,new Engine(eno,cc));

        System.out.println(c.brand);
        System.out.println(c.color);
        System.out.println(c.e.cc);


        // Car c1= new Car("sss","Black",5,new Engine(1001,45));
       
        // System.out.println(c1.brand);
        // System.out.println(c1.color);
        // System.out.println(c1.e.cc);
    }
}

class Car{
    String brand;
    String color;
    int noOFseats;
    Engine e;
    Car(){}
    Car(String brand,String color,int noOFseats,Engine e){
        this.brand=brand;
        this.color=color;
        this.noOFseats=noOFseats;
        this.e=e;
    }
}

class Engine{
    int engineNo;
    int cc;
    Engine(){}
    Engine(int engineNo,int cc){
        this.engineNo=engineNo;
        this.cc=cc;
    }
}