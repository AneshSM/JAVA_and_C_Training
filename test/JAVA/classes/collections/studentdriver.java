import java.util.Scanner;

ArrayList<Student> a = new ArrayList();import java.util.*;

class studendrive{
    publicstatic void main(String[] args){
        school s=new School();
        Scanner sc =new Scanner(System.in);
        int ch;
        while(true){
            System.out.println("Addmission:\n1)Admitstudent\n2)Display details\n3)Remove Student\n4)Update details\n5)Exit\nEnter your choice:");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    s.addstudent();                    
                    break;
                case 2:
                    s.displayStudent();
                    break;
                case 3:
                    s.updateStudent(){

                    }
                    break;
                case 4:
                s.removeStudent();
                    break;
                case 5:System.exit(0);
                    
                    break;
            
                default:System.out.println("Invalid chioice");
                    break;
            }
        }
    }
}

class Student
{
    String name;
    int id;
    long cno;
    Public student(String name,int id,long cno)
    {
        this.name=name;
        this.id=id;
        this.cno=cno;
    }
    public String toString()
    {
        return "name = "+ name ;
    }
}
class school
{
    Student s;
    Scanner sc= new Scanner(System.in);
    public void addstudent()
    {
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the id");
        int id=sc.nextInt();
        System.out.println("Enter the no.");
        long name=sc.nextLong();
        s=new Student(name,id,cno);
        a.add(s);
        System.out.println("Admission successfull....!");
    }

    public void displayStudent()
    {
        System.out.println("Enter the id");
        int id = sc.nextInt();

        for(Student s:a)
        {
            if(id==s.id)
            {
                System.out.println(s);
                return;
            }
        }            
        System.out.println("Student not found");
4
    }
    public void removeStudent()
    {
        System.out.println("Enter the id");
        int id sc.nextInt();
        for(Student s:a)
        {
            if(id==s.id)
            {
                a.remove(s);
                System.out.println("Student Removed");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void updateStudent
    {
        if(id==s.id)
        {
            System.out.println("Enter the Student id");
            int i=sc.nextInt();
            for(Students:a){
               System.out.println('Enter the Student name to update');
               String namsc.next();
                s.name=name;\
                System.out.println("Name updated succesfully");
                return;
            }
        } 
        System.out.println("Student not found");                                                                                                                                      
    }
}
