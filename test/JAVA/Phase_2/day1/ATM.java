package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ATM {
    static Scanner sc=new Scanner(System.in);
    static HashMap <String,Integer>users=new HashMap<>(){{this.put("ABC",1234);this.put("XYZ",9877);}};
    static HashMap <String,Integer>money=new HashMap<>(){{this.put("ABC",10000);this.put("XYZ",400000);}};

    public static void main(String[] args){
        Boolean v=true;
        while(v){
            System.out.println("----------Welcome to ATM---------\n1)View balance\n2)Wihdraw\n3)Deposit\n4)Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1: enterPIN(choice);
                    break;
                case 2: enterPIN(choice);
                    break;
                case 3: enterPIN(choice);
                    break;
                case 4: System.exit(0);
                    break; 
                default:
                System.out.println("Inavalid choice");
            }
        }
    }
    private static void enterPIN(int choice) {
        System.out.println("Enter Your 4 digit PIN number:");
        int pin=sc.nextInt(),c=0;
        String username="";
        for (Map.Entry data : users.entrySet()) {
            if(pin==(int)data.getValue()){
                username=(String) data.getKey();
                c=1;
                break;
            }
            else{
                c=0;
            }
        }
        if(c==0)
            System.out.println("Ivalid Password");
        else{
            switch (choice) {
                case 1:
                    System.out.println(money.get(username));
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount:");
                    int a=sc.nextInt();
                    System.out.println("Would you like to withdraw "+a+" amount?\n (Y/N):");
                    char ch=sc.next().charAt(0);
                    if(ch=='N')
                        System.exit(0);
                    else if(ch=='Y'){
                        System.out.println("Amount:"+a+" Withdrawed Successfuly.");
                        money.replace(username, money.get(username),money.get(username)-a);
                    }
                    else{
                        System.out.println("Invalid choice");
                        enterPIN(choice);
                    }
                    break;
                case 3:
                    System.out.println("Enter Deposit amount:");
                    int d=sc.nextInt();
                    System.out.println("Would you like to Deposit "+d+" amount?\n (Y/N):");
                    char choi=sc.next().charAt(0);
                    if(choi=='N')
                        System.exit(0);
                    else if(choi=='Y'){
                        System.out.println("Amount:"+d+" Deposited Successfuly.");
                        money.replace(username, money.get(username),money.get(username)+d);
                    }
                    else{
                        System.out.println("Invalid choice");
                        enterPIN(choice);
                    }
                    break;
            
                default:
                    break;
            }
        }
    }
}
