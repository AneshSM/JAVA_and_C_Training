import java.util.Scanner;
class cab
{
    private int cabno;
    cab(int cabno)
    {
        this.cabno =cabno;
    }
    cab(){}
    public int getcabno()
    {
        return cabno;
    }
    public void setcabno(int cabno)
    {
        this.cabno=cabno;
    }
}


class prime extends cab
{
    prime(int cabno)
    {
        super(cabno);
    }
    int price =300;
}
class mini extends cab
{
    mini(int cabno)
    {
        super(cabno);
    }
    int price =200;
}
class micro extends cab
{
    micro(int cabno)
    {
        super(cabno);
    }
    int price=100;
}



class ola
{
    cab c;

    public void bookcab(cab c)
    {
        if(this.c ==null)
        {
            this.c=c;
            System.out.println("your cab was booked");
        }
        else
        {
            System.out.println("couldnt book since u have already booked it");
        }
    }
    public void cancelcab()
    {
        if(this.c==null)
        {
            System.out.println("there is no cab to canncel");
        }
        else
        {
            this.c=null;
            System.out.println("cab cancelled successfully");
        }
    }
    public void bookedornot()
    {
        if(this.c == null)
        {
            System.out.println("cab is not booked");
        }
        else
        {
            if(this.c instanceof micro)
            {
                System.out.println("cab booked with micro plan");
            }
            if(this.c instanceof mini)
            {
                System.out.println("cab booked with mini plan");
            }
            if(this.c instanceof prime)
            {
                System.out.println("cab booked with prime plan");
                System.out.println("the price for ur cab is ");
            }
        }
    }
    public void  showcab()
    {
        if(this.c ==null)
        {
            System.out.println("there is no booked cab to view");
        }
        else
        {
            System.out.println("your cab number is "+c.getcabno());
        }
    }
}





public class Booking{
    public static void main(String[] args)
    {
        ola ol = new ola();
        boolean exit =true;
        Scanner s = new Scanner(System.in);
        while(exit)
        {
            System.out.println("**************************** CAB BOOKING **************************");
            System.out.println("1)for booking\n2)for cancelling\n3)to check if booked or not\n4)to show the cab\n5) to exit");
            int n = s.nextInt();
            switch(n)
            {
                case 1: System.out.println("1) for prime\n2) for mini\n3) for micro");
                        int ch=s.nextInt();
                        if(ch == 1)
                        {
                            ol.bookcab(new prime(55));
                        }
                        if(ch == 2)
                        {
                            ol.bookcab(new mini(78));
                        }
                        if(ch == 3)
                        {
                            ol.bookcab(new micro(35));
                        }
                        break;

                case 2: ol.cancelcab();
                        break;
                case 3: ol.bookedornot();
                        break;
                case 4: ol.showcab();
                        break;
                case 5: exit=false; 
            }
        }
        s.close();
    }
}