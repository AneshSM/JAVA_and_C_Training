import java.util.Scanner;
//345812
class BankDriver{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String bankName,managerName,branch;
        System.out.println("Enter the bank name: ");
        bankName=sc.next();
        System.out.println("Enter the manager name: ");
        managerName=sc.next();
        
        System.out.println("Enter the branch: ");
        branch=sc.next();
        Bank b= new Bank(bankName,managerName,branch);
        int n;
        while(true){
            System.out.println("1)Create Account\n2)Delete Account\n3)Display Details\n4)Update Details\n5)EXIT\nEnter your choice:");
            n=sc.nextInt();
            switch(n){
                case 1: b.createAccount();
                        break;
                case 2: b.deleteAccount();
                        break;
                case 3: b.displayAccount();
                        break;
                case 4: b.updateAccount();
                        break;
                case 5: System.exit(0);
                        break;
                default: System.out.println("Invalid choice");
            }
        }
    }
}

class Account{
    private long accNo,cno;
    private String ifsc;
    Account(){}
    Account(long accNo,String ifsc,long cno){
        this.accNo=accNo;
        this.ifsc=ifsc;
        this.cno=cno;
    }
    public void getacc(){
        System.out.println("\nAccount Details:\nAccount No: "+accNo+"\nIFSC: "+ifsc+"\nContact Number: "+cno);
    }
    public void setcno(long cno){
        this.cno=cno;
    }
}


class SBI{
    static String branch,ifsc;
    Account a;
    static long cno,accNo;
    Scanner sc= new Scanner(System.in);
    SBI(){}
    SBI(String branch){
        this.branch=branch;
    }
    public static void createAccount(){
                System.out.println("\nEnter the Account No: ");
                accNo=sc.nextInt();
                System.out.println("\nEnter the IFSC: ");
                ifsc=sc.nextInt();
                System.out.println("\nEnter the Contact No:");
                cno=sc.nextInt();       
                a=Account(acno,ifsc,cno);
    }
    public static void deleteAccount(){
        if(this.a==null)
            System.out.println("No contact to delete");
        else{
            this.a=null;
            System.out.println(" contact deleted");
        }
    }
    public static void displayAccount(){
        if(this.a==null)
            System.out.println("No contact to display");
        else
            a.getacc();
    }
    public static void updateAccount(){
        if(this.a==null)
            System.out.println("No contact to update");
        else{}
        System.out.println("\nEnter the new contact no: ");
        cno=sc.nextInt();
        a.setcno(cno);
        System.out.println("contact updated");

    }
}

class Bank extends SBI{
    String bankName,managerName,branch;
    Bank(){}
    Bank(String bankName, String managerName,String branch){
        this.bankName=bankName;
        this.managerName=managerName;
        this.branch=branch;
        super(branch);
    }
}