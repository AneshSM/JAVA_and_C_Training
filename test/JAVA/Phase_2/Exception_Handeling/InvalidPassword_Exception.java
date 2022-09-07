package Exception_Handeling;

import java.util.Scanner;

public class InvalidPassword_Exception extends Exception{
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);     
        int p=sc.nextInt();

        try{
            if(p == 12345){
                System.out.println("Logged in succesfully");
            }
            else
                throw new InvalidPassword_Exception();
        }
        catch(InvalidPassword_Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public String getMessage(){
        return "Invalid Password";
    }
}