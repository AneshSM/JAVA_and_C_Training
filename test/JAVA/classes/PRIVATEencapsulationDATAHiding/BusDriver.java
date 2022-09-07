import java.util.*;

class BusDriver{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name;
        int pno=0,seats=30;
        Bus b=new Bus(1,"Manglore","Moodabidre",seats--,new Passenger(0,null));
        System.out.println("Available Buses:\nBus no: "+b.busNo+"\nFrom: "+b.busPickUp+"\nTo: "+b.busDestination+"\nNum of seats available: "+b.noOFseats);
        System.out.println("Enter a your name:");
        name=sc.next();
        b.set(new Passenger(++pno,name));
        System.out.println("\n\n\n\nAssigned Bus:\nBus no: "+b.busNo+"\nFrom: "+b.busPickUp+"\nTo: "+b.busDestination+"\nNum of seats available: "+b.noOFseats+"\n\nPassenger details:\nPno:"+b.p.pno+"\nName: "+b.p.pname);
    }
}
class Passenger{
    int pno;
    String pname;
    Passenger(){}
    Passenger(int pno,String pname){
        this.pno=pno;
        this.pname=pname;
    }
}
class Bus{
    int busNo,noOFseats;
    String busDestination,busPickUp;
    Passenger p;

    Bus(){}
    Bus(int busNo,String busPickUp,String busDestination,int noOFseats,Passenger p){
        this.busNo=busNo;
        this.busDestination=busDestination;
        this.busPickUp=busPickUp;
        this.noOFseats=noOFseats;
        this.p=p;
    }
    public void set(Passenger p){
        this.p=p;
    }

}