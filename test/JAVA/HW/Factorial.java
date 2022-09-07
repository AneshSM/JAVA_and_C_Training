public class Factorial
{
public static void main (String[] args)
{
    int n=56;
    long f = fact(n);
System.out.println("factorial of "+n+" is :"+f);
}
public static long fact(int n) {
   if(n==1 || n==0) {
       return 1;
   }
   else
    return n*fact(n-1);
}
}


/*
public class Factorial
{
public static void factorial(int n)
{
    //int n=56;
    long f = fact(n);
System.out.println("factorial of "+n+" is :"+f);
}
public static long fact(int n) {
   if(n==1 || n==0) {
       return 1;
   }
   else
    return n*fact(n-1);
}
}
*/