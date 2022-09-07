class Test{
    public static void main(String[] args){
        int a=10;
        int b=0;
        Exception e=new Exception();
        if(a/b!=0)
            System.out.println(a/b);            //ArithmeticException: / by zero at Test.main
        else
            e.msg();

     }
}
class Exception extends RuntimeException{
    public void msg(){
        System.out.println("K***e");
    }
}

