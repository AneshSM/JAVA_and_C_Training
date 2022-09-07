class Veg{
    static int v=10;
    int b=20;
    //static method
    public static void fromVeg(){                     
        System.out.println("From Veg STATIC");
    }
    Veg(){        System.out.println("From Veg CONSTRUCT\n");
}
    //NON-static method
    public void fromVeg2(){
        System.out.println("From Veg NON STATIC");
    }
}





class Tomato extends Veg{
    public static void main(String[] args){
        Tomato a = new Tomato();
        fromVeg();
        a.fromVeg2();
        a.fromTomato();
        fromTomato2();
        System.out.println("");
        
        Veg f= new Veg(); 
            //form non static method
        fromVeg(); 
            //from static method      
        f.fromVeg2();



        System.out.println("\n\nACCESSED value from Parent Veg STATIC variable a=10 WITHOUT CLASS NAME :"+v);

        System.out.println("\n\nACCESSED value from Parent Veg NON-STATIC variable b=20 WITH OBJECT :"+f.b);

    }
    public void fromTomato(){
        System.out.println("Form Tomato NON-STATIC");
    }
    public static void fromTomato2(){
        System.out.println("Form Tomato STATIC");
    }

}