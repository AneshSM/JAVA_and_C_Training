import java.math.*;
class PrimeNum
{
public static void main (String[] args)
{
int n=13,m;
m=sqrt(n);
if(n==1) {
    System.out.println(n+" is neither a prime number nor composit number");
    }
else if(n==0) {
    System.out.println(n+" is not a prime number");
}

if(prime(n)) {
    System.out.println(n+" is a prime number");
}
else
   System.out.println(n+" is not a prime number");
}
public static boolean prime(int n) {

for (int i=m;i<n;i++){
if(n%i!= 0){
   return false;
}
else{
return true;
}
}



/*import java.util.*;
public class PrimeNum{
    public public static void primeno(int n)) {
if(n==1) {
    System.out.println(n+" is neither a prime number nor composit number");
    }
else if(n==0) {
    System.out.println(n+" is not a prime number");
}
else if(prime(n)) {
    System.out.println(n+" is a prime number");
}
else
   System.out.println(n+" is not a prime number");
}
public static boolean prime(int n) {
    for (int i=2;i<n;i++)
if(n%i != 0)
   return false;
return true;
}
    }
} */