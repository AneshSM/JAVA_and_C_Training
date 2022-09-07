class Fruit{
    static int v=10;
    int b=20;
    //static method
    public static void fromFruit(){                     
        System.out.println("From Fruit STATIC");
    }
    Fruit(){        System.out.println("From Fruit CONSTRUCT\n");
}
    //NON-static method
    public void fromFruit2(){
        System.out.println("From Fruit NON STATIC");
    }
}





class Apple extends Fruit{
    public static void main(String[] args){
        // Apple a = new Apple();
        // fromFruit();
        // a.fromFruit2();
        // a.fromApple();
        // fromApple2();
        // System.out.println("");
        
        Fruit f= new Apple();
        //Fruit f= new Fruit();
            //form non static method
        //fromFruit(); 
            //from static method      
        //f.fromFruit2();

        System.out.println("");

        Apple a = (Apple)f;

        a.fromFruit2();
        a.fromApple();
        
        System.out.println("");



        System.out.println("\n\nACCESSED value from Parent Fruit STATIC variable a=10 WITHOUT CLASS NAME :"+v);

        System.out.println("\n\nACCESSED value from Parent Fruit NON-STATIC variable b=20 WITH OBJECT :"+f.b);

    }
    public void fromApple(){
        System.out.println("Form Apple NON-STATIC");
    }
    public static void fromApple2(){
        System.out.println("Form Apple STATIC");
    }

}