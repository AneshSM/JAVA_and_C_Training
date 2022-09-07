import java.util.Scanner;

class BagDriver{
    public static void main(String[] args){
        Bag b1=new Bag();
        int n,ch;
        Scanner sc=new Scanner(System.in);  
        while(true){
            System.out.println("\n1)Add ball\n2)Remove ball\n3)Check Bag is empty\n4)Show game\n5)Exit\nEnter your choice: ");
            n=sc.nextInt();
            switch(n){
                case 1: System.out.println("1)Basket Ball\n2)Tennis Ball\nEnter your choice:");
                        ch=sc.nextInt();
                        if(ch==1){
                            b1.addBall(new Basketball(10));
                        }
                        else if(ch==2){
                            b1.addBall(new Tennisball(5));
                        }
                        else
                            System.out.println("Invalid choice");
                        break;
                case 2: b1.removeBall();
                        break;
                case 3: b1.isBagempty();
                        break;
                // case 4: b1.showGame();
                //         break;
                case 5: System.exit(0);
                        break;
                default: System.out.println("Invalid choice");            
            }
        }
    }
}


class Bag{
    Ball b;

    public void addBall(Ball b){
        if(this.b==null){
            this.b=b;
            System.out.println("Ball is added to Bag");
        }
        else{
            System.out.println("Ball is already present");
        }
    }
    public void removeBall(){
        if(this.b==null){
            System.out.println("there is no ball in Bag to remove");
        }
        else{
            if(b instanceof Basketball){
                this.b=null;
                System.out.println("BasketBall is removed");
            }
            else{
                this.b=null;
                System.out.println("TennisBall is removed");
            }
        }
    }
    public void isBagempty(){
        if(this.b==null)
            System.out.println("Bag is empty");
        else{
            if(b instanceof Basketball){
                System.out.println("Bag contains a BasketBall");
            }
            else{
                System.out.println("Bag contains a TennisBall");
            }
        }
    }
//     public void showGame(){
//         if(this.b==null){
//             System.out.println("Bag is empty");
//         }
//         else{
//             if(b instanceof BasketBall){
// //System.out.println(game);
//             }
//             else{
// //System.out.println(game);
//             }
//         }
//     }
}

 


class Ball{
    private double radius;
    public Ball(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setradius(double radius){
        this.radius=radius;
    }
}

class Basketball extends Ball{
    public Basketball(double radius){
        super(radius);
    }
    String game="Basket Ball";
}

class Tennisball extends Ball{
    public Tennisball(double radius){
        super(radius);
    }
    String game="Tennis Ball";
}
