package day1.Creation1;
import java.util.Scanner;

public class SwitchCase {
    
    static Scanner sc =new Scanner(System.in);



        public static void switchArith(int op1,int op2,char opr){
                System.out.print("Result:\t");
                switch(opr){
                        case'+': System.out.println(op1+op2);
                                break;
                        case '-':System.out.println(op1-op2);
                                break;
                        case '*':System.out.println(op1*op2);
                                break;
                        case '/':System.out.println((op2!=0)?op1/op2:"divide  by zero error");
                                break;
                        default:System.out.println("Invalid Character");
                } 
        }

        public static void Remainder(int oprnd1, int oprnd2,char oprtr) {
                switchArith(oprnd1, oprnd2,oprtr);
        }
        
        public static void Division(int oprnd1, int oprnd2,char oprtr) {
                switchArith(oprnd1, oprnd2,oprtr);
        }
        
        public static void Multiplication(int oprnd1, int oprnd2,char oprtr) {
                switchArith(oprnd1, oprnd2,oprtr);
        }
        
        public static void Substraction(int oprnd1, int oprnd2,char oprtr) {
                switchArith(oprnd1, oprnd2,oprtr);
        }
        
        public static void Addition(int oprnd1, int oprnd2,char oprtr) {
                switchArith(oprnd1, oprnd2,oprtr);
        }



    public static void main(String[]args)
    {
        while(true){
        System.out.println("\n1)Comapare 3 digits\n2)Check a character\n3)Check Leap Year\n4)If ladder\n5)Calculator\n6)Method operation\n9)Exit\n\nEnter your choice:");
        System.out.println("");
        int n=sc.nextInt();
        condition_Examples con =new condition_Examples();
        switch(n){
                case 1:
                        con.compare3Digit();
                        break;
                case 2:;
                        con.checkChar();
                        break;
                case 3:
                        con.checkLeapYear();
                        break;
                case 4:
                        con.ifLadder();
                        break;
                case 5:
                        int op1=sc.nextInt();
                        char opr=sc.next().charAt(0);
                        int op2=sc.nextInt();
                        switchArith(op1, op2,opr);
                        break;
                case 6:{
                                System.out.println("1)Addition\n2)Substraction\n3)Multiplication\4)Division\n5)Remainder\n6)Exit\nEnter your choice:");
                                int m=sc.nextInt();
                                if(m==6)
                                        System.exit(0);
                                System.out.println("Enter operand 1 & operand 2 vlue:");
                                int oprnd1=sc.nextInt();
                                char oprtr;
                                int oprnd2=sc.nextInt();
                                        switch (m) 
                                        {
                                                case 1:
                                                        Addition(oprnd1,oprnd2,oprtr='+');
                                                        break;
                                                case 2:
                                                        Substraction(oprnd1,oprnd2,oprtr='-');
                                                        break;
                                                case 3:
                                                        Multiplication(oprnd1,oprnd2,oprtr='*');
                                                        break;
                                                case 4:
                                                        Division(oprnd1,oprnd2,oprtr='/');
                                                        break;
                                                case 5:
                                                        Remainder(oprnd1,oprnd2,oprtr='%');
                                                        break;
                                                case 6:System.exit(0); 
                                                        break;
                                        
                                                default:
                                                        System.out.println("Invalid choice");
                                                        break;
                                        }       
                                break;
                        }               
                case 9:
                        System.exit(0);;
                        break;
        
            }    
        }
    }
}
