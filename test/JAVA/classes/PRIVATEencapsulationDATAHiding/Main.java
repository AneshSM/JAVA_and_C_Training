import java.util.Scanner;
class Student
{
    private String sname;
    private String email;
    private long cno;
   
    Student(){}
    Student(String sname,String email,long cno)
    {
        this.sname = sname;
        this.email = email;
        this.cno = cno;
    }
   
    public String getSname()
    {
        return sname;
    }
   
    public String getEmail()
    {
        return email;
    }
   
    public void setEmail(String email)
    {
        this.email = email;
    }
   
    public long getCno()
    {
        return cno;
    }
   
    public void setCno(long cno)
    {
        this.cno = cno;
    }
   
}

class College
{
    String location;
    Student s;
    College() {}
   
    College(String location)
    {
        this.location = location;
       
    }
   
    public void getAdmission(Student s)
    {
        if(this.s == null)
        {
           this.s = s;
           System.out.println("Student Admitted.");
        }
        else
        {
            System.out.println("Student is not there...");
        }
       
    }
   
    public void cancelAdmission()
    {
        if(this.s == null)
        {
            System.out.println("Student is not there.");
        }
        else
        {
        this.s = null;
        System.out.println("Student removed");
        }
    }
   
    public void updateStudent()
    {
        if(this.s == null)
        {
            System.out.println("Student is not there.");
        }
        else
        {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the email");
           String email = sc.next();
           s.setEmail(email);
           System.out.println("Enter the Cont no");
           long cno = sc.nextLong();
           s.setCno(cno);
           
        }
    }
       
    public void display()
    {
        if(this.s == null)
        {
            System.out.println("Student is not there");
        }
        else
        {
             System.out.println("-----DisplayDetails-----");
            System.out.println("Student name "+s.getSname());
            System.out.println("Student email "+s.getEmail());
            System.out.println("Student cno "+s.getCno());
            System.out.println("College location "+location);
            System.out.println("------------------------------");
        }
    }
       
}

class Main
{
    public static void main (String[] args)
    {
        String sname,email;
        long cno;
        College c1 = new College("Manglore");
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while(exit)
        {
        System.out.println("1. getAdmission \n2. removeSim \n 3. display\n 4. exit");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                {
                    System.out.println("Enter Student name:");
                    int sname = sc.next();
                    System.out.println("Enter the email");
                    String serviceProvider= sc.next();
                    System.out.println("Enter the sim color");
                    String simColor= sc.next();
                    m1.insertSim(new Sim(simNo,serviceProvider,simColor));
                }
                break;
            case 2:
                {
                    m1.removeSim();
                }
                break;
            case 3:
                {
                    m1.display();
                }
                break;
            case 4:
                {
                    exit = false;
                }
                break;
            default :
                {
                    System.out.println("Invalid Choice");
                }
        }
        }
       
    }
}

