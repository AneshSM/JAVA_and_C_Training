
import java.util.Scanner;

public class Quest
{
 static Scanner sc =new Scanner(System.in);
    public static int find(int n,int m){
        int count=0;
        for(int i=m;i<n;i++){
            if(i%2==0){
                count+=1;
            }
            
        }
        return count;
    }
    public static void main(String[] args){
        int n,m;
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println(find(n,m));
    }
}
