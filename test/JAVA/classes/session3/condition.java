//import java.util.Scanner;
class condition{
    public static void main(String []args){
        int a,b,c,d;
        a=12;
        b=11;
        c=13;
        //  Scanner n=new Scanner(System.in);
        //  System.out.println("Enter a nad b values:");
        //  a=n.nextInt();
        //  b=n.nextInt();
        d=1;
        switch (d) {
            case 1:{
                if(a>b && a>c){
                    System.out.println(a+" is greater than "+b+" and "+c);
            }
            else if(b>c){
                System.out.println(b+" is greater than "+c+" and "+a);
            }
            else{
                System.out.println(c+" is greater than "+a+" and "+b);
            }
            }
                
                break;
        
            default:System.out.println("Invalid choice");
                break;
        }
    }
}
