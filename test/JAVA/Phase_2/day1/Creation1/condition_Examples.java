package day1.Creation1;
import java.util.Scanner;
public class condition_Examples {
    static Scanner sc=new Scanner(System.in);

    public static int compare3Digit(){
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();

        if(a>b && a>c)
            System.out.println("Largest no a:"+a);
        else if(b>c)
            System.out.println("Largest no b:"+b);
        else
            System.out.println("Largest no c:"+c);
        return 0;
    }
    public static char checkChar(){
        char a=sc.next().charAt(0);
        //char a='a';
        if(a>='a'&& a<='z' || a>='A' && a<='Z'){
            System.out.println("Alphabet");
        }
        else if(a>='0' && a<='9' ){
            System.out.println("Digit");
        }
        else
            System.out.println("Special Character");
        return 0;
    }
    public void checkLeapYear(){
        int y=sc.nextInt();
        if(y%4==0 && y%400==0)
            System.out.println("Year: "+y+" is a leap year");
        else
            System.out.println("Not a leap year");
    }
    public static void ifLadder(){
        if(true){
            if(true){
                if(true){
                    if(true)
                        System.out.println("core block");
                    else
                        System.out.println("2nd inner block");
                }
                else
                System.out.println("3rd inner block");
            }
            else
                System.out.println("Outer block");
        }
        else 
            System.out.println("Outside if ladder");
    }
    public static void main(String[] args){
        
    }
}
