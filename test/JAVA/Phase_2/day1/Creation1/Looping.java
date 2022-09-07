package day1.Creation1;
import java.util.Scanner;
public class Looping {
    static Scanner sc=new Scanner(System.in);
    public static void whileLoop(){
        int n,a,s,m,t,count=0;
        float d=31;
        a=s=n=t=0;
        m=n=sc.nextInt();
        do{
            if(n%10!=0)
                count++;
            n=n/10;
        }while(n!=0);
       
        n=m;
        System.out.println("Total digit in n:"+n+" is:"+count);
        m=1;
        while(n!=0){
            //t=sc.nextInt();
            t=n;
            a+=t;
            s-=t;
            m*=t;
            d/=(t!=0)?t:null;
            n--;
        }
        //System.out.println("\nAddition:"+a+"\nSubstraction:"+s+"\nFactorial:"+m+"\nDivision"+d);        
    }
    public static void reverseNum(int n){  
        int rem=0;
        while(n!=0){
        rem=n%10;
        System.out.print(rem);
        n=n/10;
        }
    }
    public static void spynumber(int n){
        int sum=0;
        int prod=1;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            prod*=sum;
            n=n/10;
        }
        if(sum==prod){
            System.out.println("spy number:"+sum);
        }
    }
    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"'s Table\n"+i+"*"+n+"="+i*n);
        }
    }
    public static void armstrongNum(int n,int count){
        int i=n,rem=0,tmp=1,sum=0;
        while (i!=0) {
        rem=i%10;
        for(int j=1;j<=count;j++) {
            tmp*=rem; 
        }
        sum+=tmp;
        i/=10;
       }
       if(n==sum){
        System.out.println(n+" is an Armstrong number");
       }
       else{
        System.out.println(n+" is not an Armstrong number");
       }
    }
    public static void main(String[] args){
    int i=0,n=sc.nextInt();
    int count=0;
    i=n;
    while(i!=0){
        count++;
        i/=10;
    }
    armstrongNum(n,count);
    }
}
