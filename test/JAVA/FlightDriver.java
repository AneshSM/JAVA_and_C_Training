import java.util.Scanner;

class FlightDriver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Flight f =new Flight(101,"AieExpress");
        int n;
        int cno;
        String name,arrival,departure;
        System.out.println("\n\nFlight details:\nFlight no: "+f.flightNo+"\nAirLine: "+f.airline+"\n");
        while(true){
            System.out.println("\n1)Book Ticket\n2)Cancel Ticket\n3)Update Ticket\n4)Display Ticket\n5)Exit\nEnter your choice:");
            n=sc.nextInt();
            switch(n){
                case 1: {
                        System.out.println("\nEnter your name: ");
                        name=sc.next();
                        System.out.println("\nEnter your contact no: ");
                        cno=sc.nextInt();
                        System.out.println("\nEnter arrival: ");
                        arrival=sc.next();
                        System.out.println("\nEnter Departure: ");
                        departure=sc.next();
                        f.bookTicket(new Ticket(1001,name,cno,arrival,departure));
                        System.out.println("\nTicket booked successfully by: "+f.t.getname()+"\n");
                        }break;
                case 2: f.cwancelTicket();
                        break;
                case 3: {
                            System.out.println("\nEnter your contact no:");
                            cno=sc.nextInt();
                            System.out.println("\nEnter arrival:");
                            arrival=sc.next();
                            System.out.println("\nEnter arrival:");
                            departure=sc.next();
                            f.updateTicket(cno,arrival,departure);
                        }break;
                case 4: f.displayTicket();
                        break;
                case 5: System.exit(0);
                        break;
                default:System.out.println("\nInvalid Choice\n");

                }
            }
        }
    }

class Flight{
    int flightNo;
    String airline;
    Ticket t;
    Flight(){}
    Flight(int flightNo,String airline){
        this.flightNo=flightNo;
        this.airline=airline;
    }
    public void bookTicket(Ticket t){
        if(this.t==null){
            this.t=t;
            System.out.println("Ticket booked successfully");
        }
        else{
            System.out.println("Ticket is already booked");
        }
    }
    public void cwancelTicket(){
        if(this.t==null){
            System.out.println("There is no Booked Ticket to cancel");
        }
        else{
            this.t=null;
            System.out.println("Ticket is cancelled");
        }
    }
    public void updateTicket(int cno,String arrival,String departure){
        if(this.t==null){
            System.out.println("\nThere is no Booked Ticket to Update\n");
        }
        else{
            t.setcno(cno);
            t.setarrival(arrival);
            t.setdeaparture(departure);
            System.out.println("\nTicket updated successfuly");
            System.out.println("The ticket is updated to:\ncno "+t.getcno()+"\nArrival: "+t.getarrival()+"\nDeparture: "+t.getdeparture());
        }
    }
    public void displayTicket(){
        if(this.t==null){
            System.out.println("There is no Booked Ticket to display");
        }
        else{
            System.out.println("The ticket Details:\nTicket No: "+t.gettno()+"\nName: "+t.getname()+"\ncno "+t.getcno()+"\nArrival: "+t.getarrival()+"\nDeparture: "+t.getdeparture()+"\n");
        }
    }
}


class Ticket{
    private int tickeNo;
    private String name;
    private int cno;
    private String arrival;
    private String departure;
    Ticket(){}
    Ticket( int tickeNo,String name,int cno,String arrival,String departure){
        this.tickeNo=tickeNo;
        this.name=name;
        this.cno=cno;
        this.arrival=arrival;
        this.departure=departure;
    }
    public int gettno(){
        return tickeNo;
    }
    public String getname(){
        return name;
    }
    public int getcno(){
        return cno;
    }
    public String getarrival(){
        return arrival;
    }
    public String getdeparture(){
        return departure;
    }
    public void setcno(int cno){
        this.cno=cno;
    }
    public void setarrival(String arrival){
        this.arrival=arrival;
    }
    public void setdeaparture(String departure){
        this.departure=departure;
    }
}
