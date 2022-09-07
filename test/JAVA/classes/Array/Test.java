import java.util.*;
class Test{
    static int i;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n,ch;
        System.out.println("\nEnter a size: ");
        n=sc.nextInt();
        //sc.nextLine();
        while(true){
        System.out.println("\n\n1)Integer\n2)Double\n3)String\n4)Exit\nEnter your choice:");
        ch=sc.nextInt();
        switch(ch){
            case 1:Integers(n);
                break;
            case 2:Doubles(n);
                break;
            case 3:sc.nextLine();
                    Strings(n);
                break;
            case 4:System.exit(0);
                break;
            default:System.out.println("Invalid choice");
        }
    }
 }
    public static void Integers(int n){
        int a[]=new int[n];
        System.out.println("Enter "+n+" Integer values");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The Integer array containts");
        for(i=0;i<n;i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
    public static void Doubles(int n){
        double a[]=new double[n];
        System.out.println("Enter "+n+" Integer values");
        for(i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
        System.out.println("The Integer array containts");
        for(i=0;i<n;i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
    public static void Strings(int n){
        String a[]=new String[n];
        System.out.println("Enter "+n+" String values");
        for(i=0;i<n;i++){
            a[i]=sc.nextLine();
        }
        System.out.println("The String array containts");
        for(i=0;i<n;i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
    
}











// import java.util.*;
// class Test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int i,n;
//         System.out.println("Enter a size: ");
//         n=sc.nextInt();
//         
//     }
// }














































// class Test{
//     public static void main(String[] args){
//         int i,a[]=new int[5];
//         double b[]=new double[5];
//         String c[]=new String[5];
//     try{
//         a[0]=43;
//         a[1]=32;
//         a[2]=43;
//         a[3]=65;
//         a[4]=2;
//         //a[6]=324;
//         for(i=0;i<5;i++)
//             System.out.println(a[i]);
//         b[0]=8.39;
//         b[1]=0.37;
//         b[2]=6.5;
//         b[3]=6.31;
//         b[4]=6.39;
//         //b[5]=23485;
//         for(i=0;i<5;i++)
//             System.out.println(b[i]);
//         c[0]="abc";
//         c[1]="abc";
//         c[2]="abc";        
//         c[3]="abc";
//         //b[5]=23485;
//         for(i=0;i<5;i++)
//             System.out.println(c[i]);
        
//     }
//     catch(Exception e){
//         System.out.println("Exception caught: "+e);
//     }
// }
// }