package day1;

public class topic1{
    public static void main(String[] args){
        int a=10,b=20,c=60;
        c-=b; 
            System.out.println("a=10,b=20,c=30; c-=b;\n\nArithmatic Operations:\n a+b:"+(a+b)+"\tc-b:"+(c-b)+"\ta*b:"+(a*b)+"\tc/a:"+(c/a));
            System.out.println("\n\nLogical Operator:\n(b>a||a>(b-20) && c<a || c>b != false)\t-->"+ (b>a||a>(b-20) && c<a || c>b != false));
            System.out.println("\n\nRelational Operator:\na==b"+(a==b)+"\t a>b:"+(a>b)+"\na<b:"+(a<b)+"\t a!=b:"+(a!=b)+"\na>=b:"+(a>=b)+"\ta<=b:"+(a<=b));
            //to check given num is even or odd
            System.out.println("\n\nConditional Operator:\n (a>b?a:b):"+(a>b?a:b)+"\n To check or odd\nUsing\t (a%2==0)?\"even\":\"odd\":\t a=10: "+((a%2==0)?"even":"odd"));   
            a=20;
            System.out.println("\n\nIncrement Operators:\na=20\n(++a+a+++a):"+(++a+a+++a)+"\t\ta:"+a+"\na="+a+"\t\t(++a + a+\"james\"+(a-++a))="+(++a + a+"james"+(a-++a)));
            b=10;
            System.out.println("\n\nIncrement Operators:\na=20\n(++a+a+++a):"+(--b+b--+b)+"\t\tb:"+b+"\nb="+b+"\t\t(--b + b+\"jbmes\"+(b---b))="+(--b + b+"jbmes"+(b---b)));
            //to find largest of 2 numbers
            a=10;b=20;
            System.out.println("\n\nif-else condition\nlargest of 2 numbers a=10;b=20;");
            if(a>b)
                System.out.println(a);
            else    
                System.out.println(b);
            
            char ch='2';
            System.out.println("\nWheather "+ ch +" is an alphabet:\t"+(ch>='a' && ch<='z' || ch>='A' && ch<'Z'?"Is an alphabet":"Not a alphabet"));
            


            System.out.println("\n\n"); 
        }       
}