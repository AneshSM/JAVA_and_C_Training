class Program{
    static int b=88;
    int a=88;
    {
        int a=55;
        System.out.println(a);
    }
    public static void main(String[] args){
        Program d3 = new Program();
        System.out.println(d3.a);
    }
    static{
        System.out.println("ho");
    }
}
