class Perfect
{
    public static void factor(int n) {
        int i, sum = 0;
     for(i=1;i<n;i++)
       if(n%i==0)
         sum = sum + i;
    if(sum == n) {
        System.out.println( n+" is a perfect number");
    }
    else
        System.out.println( n+" is not a perfect number");
    }
public static void main (String[] args)
{
int n=6;
factor(n);
// int i;
// for(i=1;i<=n;i++)
//     factor(i);
//     }
   
   
}


/*
public class Perfect
{
    public static void factor(int n) {
        int i, sum = 0;
     for(i=1;i<n;i++)
       if(n%i==0)
         sum = sum + i;
    if(sum == n) {
        System.out.println( n+" is a perfect number");
    }
    else
        System.out.println( n+" is not a perfect number");
    }
}
*/