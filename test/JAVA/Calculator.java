import java.util.*;
class Calculator{

    public static int add(int a,int b){
        return a+b;
    }
    public static int substract(int a,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static float divide(int a,int b){
        return a/b;
    }

    public static void main(String [] args){
        int n,a,b,c;
        float d;
        Scanner sc=new Scanner(System.in);
        DefaultMOTTE E=new DefaultMOTTE();
        while(true){
        System.out.println("Enter 'a' value:");
        a=sc.nextInt();
        System.out.println("Enter 'b' value:");
        b=sc.nextInt();
        System.out.println("1)Addition\n2)Substraction\n3)Multiplication\n4)Division\n5)EXIT\n");
        System.out.println("Enter your choice:");
        n=sc.nextInt();

            switch (n) {
                case 1:
                c=add(a,b);
                System.out.println("Addition(a+b): "+c);
                break;
                case 2:
                c=substract(a,b);
                System.out.println("Substraction(a-b):"+c);
                break;
                case 3:
                c=multiply(a,b);
                System.out.println("Multiplication(a*b):"+c);
                break;
                case 4:
                d=divide(a,b);
                System.out.println("Division(a/b):"+d);
                break;
                case 5:
                System.exit(0);
                default:E.common();
                break;
            }
            System.out.println("");
        }
    }
}       