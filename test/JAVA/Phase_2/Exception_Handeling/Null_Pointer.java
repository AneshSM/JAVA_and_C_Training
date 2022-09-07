package Exception_Handeling;

public class Null_Pointer{
    public static void main(String [] args){        
        try {
            Null_Pointer.nullPointer();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Null Poiter Exception");
        }
    }
    public static void nullPointer()throws NullPointerException{
            String s=null;
            System.out.println(s.charAt(0));
    }
}