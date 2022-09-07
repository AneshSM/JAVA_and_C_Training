package Problems;

import java.util.Scanner;

public class XylemNum {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),c=0;
        int j=k,rem=0,sum1=0,sum2=0;
        while (j!=0){
            j=j/10;
            c++;
        }
        j=k;
        c=0;
        while(j!=0){
        rem =j%10;
        j=j/10;
        c++;
        if(c==4 || c==1){
            sum1+=rem;
        }
        else{
            sum2+=rem;
        }
        }
        if(sum1==sum2){
            System.out.println(k+"is a xylem number");
        }

    }
}
