// //Method shadowing
// class A{
//     public static void a(int x){
//         System.out.println(x);
//     }
// }
// class B extends A{
//     public static void main(String [] args0){
//         //A v=new A();
//         a(10);
//     }

//     public static void a(int x){
//         System.out.println(x);
//     }
// }



//Method Overloading
class A{
    public static void a(int x){
        System.out.println(x);
    }
}
class B extends A{
    public static void main(String [] args0){
        //A v=new A();
        a(10);
    }

    public static void a(){
        System.out.println("Ho");
    }
}


// //Method Overriding
// class A{
//     public void a(int x){
//         System.out.println(x);
//     }
// }
// class B extends A{
//     public static void main(String [] args0){
//         A v=new A();
//         v.a(10);
//     }

//     public void a(int x){
//         System.out.println(x);
//     }
// }