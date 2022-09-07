class Demo{
    public static void main(String[] args){
       int i=22;
       Integer obj=Integer.valueOf(i);
       System.out.println("by using Integer obj=Integer.valueOf(i); After wrapping: "+obj);
       int a=obj.intValue();
       System.out.println("by using int a=obj.intValue(); After un-wrapping: "+a);
    }
}