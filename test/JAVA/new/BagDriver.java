

import java.util.Scanner;

 /* created on 20-Apr-2022  */

 class BagDriver {
	public static void main(String[] args) {
		Bag b1 = new Bag();
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("******************GAME PORTAL**********************");
			System.out.println("1.Add Ball \n2.Remove Ball \n3.Check bag empty \n4.Show Game \n5.Exit");
			System.out.println("***************************************************");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("1.BasketBall \n2.TennisBall");
				int ball = sc.nextInt();
				if(ball == 1) 
					b1.addBook(new BasketBall(5));
				else 
					b1.addBook(new TennisBall(10));
				break;
			case 2: 
				b1.removeBall();
				break;
			case 3: 
				b1.isBallEmpty();
				break;
			case 4:
				b1.showGame();
				break;
			case 5: 
				exit = false;
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
		sc.close();
	}
}





 class Bag {
	Ball b;
	
	public void addBook(Ball b) {
		if(this.b == null) {
			this.b = b;
			System.out.println("Ball added Successfully");
		}
		else {
			throw new BallNotAdded();
		}
	}
	
	public void removeBall() {
		if(this.b == null) {
			throw new BallNotAdded();
		}
		else {
			if(b instanceof BasketBall) {  			//CHECKING IF THE BALL TO BE REMOVED IS BASKETBALL OR TENNIS BALL
				b = null;
				System.out.println("BasketBall removed");
			}
			else {
				b = null;
				System.out.println("TennisBall is removed");
			}
		}
	}
	
	public void isBallEmpty() {
		if(this.b == null) 
			System.out.println("Bag is empty");
		else {
			if(b instanceof BasketBall) {
				System.out.println("BasketBall in the bag");
			}
			else {
				System.out.println("TennisBall in the bag");
			}
		}
	}
	
	public void showGame() {
		if(this.b == null) {
			throw new BallNotAdded();
		}
		else {
			if(b instanceof BasketBall) {
				System.out.println("BasketBall");
			}
			else {
				System.out.println("Tennis ball");
			}
		}
	}
}



 class Ball {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Ball() {}
	
	public Ball(double radius) {
		this.radius = radius;
	}
	
}



 class BasketBall extends Ball{

	public BasketBall(double radius) {
		super(radius);
	}
	
	public BasketBall() {
		super();
	}
	
	String game = "Basket Ball";
	
	
}



 class TennisBall extends Ball{
	
	public TennisBall(double radius) {
		super(radius);
	}

	public TennisBall() {
		super();
	}
	
	String game = "Tennis Ball";
	
}
