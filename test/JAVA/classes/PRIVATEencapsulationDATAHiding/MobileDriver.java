import java.util.*;
class MobileDriver{
    public static void main(String[] args0){
        // Mobile m=new Mobile("MOTO",12999,"Blue",4,new Sim(1042324,"IDEA","yellow"));
        // System.out.println(m.brand);    
        // System.out.println(m.color);    
        // System.out.println(m.price);    
        // System.out.println(m.memory);
        // System.out.println(m.s.SimNo);        
        // System.out.println(m.s.ServiceProvider);   
        // System.out.println(m.s.simColor); 
        int p,me,sno,n;
        String b,c,sp,sco;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\nEnter Mobile Details:\nBrand\nPrice\nColor\nMemory Size\n");
        b=sc.next();
        p=sc.nextInt();
        c=sc.next();
        me=sc.nextInt();

        Mobile m=new Mobile(b,p,c,me);


        while(true){
        System.out.println("\n\n\n100)Mobile details\n1)Insert sim\n2)Remove sim\n3)Sim details\n4)exit\nEnter your choice:\n");
        n=sc.nextInt();
        switch(n){
            case 100:   System.out.println("\n\n\n\n\nMobile Details:\n"+m.brand);    
                        System.out.println(m.color);    
                        System.out.println(m.price);    
                        System.out.println(m.memory);
                        break;
            case 1: System.out.println("\n\n\nEnter Sim details:\nSimNo\nSim Provider Name\nSim Color\n");
        
                    sno=sc.nextInt();
                    sp=sc.next();
                    sco=sc.next();
                    m.setSim(new Sim(sno,sp,sco));
                    break;
            case 2: m.remSim();
                    break;
            case 3: m.Details(m.brand,m.price,m.color,m.memory);
                    break;
            case 4:System.exit(0);
                    break;
            default:System.out.println("\n\n\nInvalid choice \n\n");

        }  
    }      
    }
}


class Mobile{
    int price,memory;
    String brand,color;
    Sim s;

    Mobile(){}
    Mobile(String brand,int price,String color,int memory){
        this.brand=brand;
        this.price=price;
        this.color=color;
        this.memory=memory;
    }
    public void setSim(Sim s){
        if(this.s==null){
        this.s=s;
        System.out.println("\n\nSim is inserted\n");
        }
        else{
            System.out.println(this.s.ServiceProvider+" Sim is present\n");
        }
    }
    public void remSim(){
        if(this.s==null){
        System.out.println("\n\nSim slot is empty\n");
        }
        else{
              System.out.println(s.ServiceProvider+" Sim removed\n\n");
              this.s=null;
        }
    }

    public void Details(String brand,int price,String color,int memory){
        System.out.println("\n\n\n\n\nMobile Details:\n"+brand);    
        System.out.println(color);    
        System.out.println(price);    
        System.out.println(memory);
        
        if(this.s==null){
            System.out.println("\n\nSim slot is empty\n");
            }
            else{
                System.out.println("\n\nSim Details:\n"+s.SimNo);        
                System.out.println(s.ServiceProvider);   
                System.out.println(s.simColor); 
            }
    }
}


class Sim{
    int SimNo;
    String ServiceProvider,simColor;
    Sim(){}
    Sim(int n,String sp,String sc){
        this.SimNo=n;
        this.ServiceProvider=sp;
        this.simColor=sc;
    }
}