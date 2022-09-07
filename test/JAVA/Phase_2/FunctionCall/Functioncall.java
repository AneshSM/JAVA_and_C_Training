package FunctionCall;
import java.util.Scanner;
public class Functioncall {
    static Scanner sc=new Scanner(System.in);

    public static int methodOne(int i1){
       // System.out.println(i1);
        return i1;
    }
    public static String methodTwo(int i2,float f2,String s2){
        //System.out.println(i2+"\t"+f2+"\t"+s2);
        return i2+"\t"+f2+"\t"+s2;
    }
    
    public static int m1(int i1){
        // System.out.println(i1);
         return i1;
     }
     public static int m2(int i1){
        // System.out.println(i1);
         return i1;
     }
    
    public static String strMethod(int n){
        String str=""+n;
        return str;
     }
    public static int intMethod(float f,double d){
        int fi=(int) f;
        int di=(int)d;
        if(fi==0.0)
            return fi;
        else if(di==0.0)
            return di;
        else
            return 0;    }
    
    
    
    public static void main(String[] args){
        // int n=sc.nextInt();
        // float f=sc.nextFloat();
        // String s=sc.next();
        // methodOne(n);
        // methodTwo(n, f, s);
        //System.out.println(methodOne(n)+"\n"+methodTwo(n, f, s));

        // int a=sc.nextInt(),b=sc.nextInt();        
        // System.out.println("Addition of Methods:\t"+(m1(a)+m2(b))+"\nSubstraction of Method:\t"+(m1(a)-m2(b))+"\nMultiplication of Method:\t"+(m1(a)*m2(b))+"\nDivision of Method:\t"+(m1(a)!=0?m1(a)/m2(b):null));
    

    }
}
