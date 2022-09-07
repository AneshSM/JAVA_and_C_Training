import java.util.*;

class CompanyDriver{

}

class Employee{
    String ename,city;
    int empid;
    long cno;
    Employee(String ename,int empid,long cno,String city){
        this.ename=ename;
        this.empid=empid;
        this.cno=cno;
        this.city=city;
        this(ename,empid,cno);
    }
    Employee(String ename,int empid,long cno){
        this.ename=ename;
        this.empid=empid;
        this.cno=cno;
        this(ename,empid);
    }
    Employee(String ename,int empid){
        this.ename=ename;
        this.empid=empid;
        this(ename);
    }
    Employee(String ename){
        this.ename=ename;
        this();
    }
    Employee(){}
    public String getename(){
        return ename;
    }
    public int getempid(){
        return empid;
    }
    public int getcno(){
        return cno;
    }
    public String getcitY(){
        return city;
    }
    
    public void setename(String ename){
        this.ename=ename;
    }
    public void setempid(int empid){
        this.empid=empid;
    }
    public void setcno(int cno){
        this.cno=cno;
    }
    public void setcity(String city){
        this.city=city;
    }
    public String toString(){
        return "Employee name: "+ename+"";
    }
}

class Companay{
    Employee e;
    ArrayList<Employee> a=new ArrayList();
    Scanner sc= new scanner(System.in);
    public void addEmployee(){
        System.out.println("\nEnter the Employee details:\nEnter Employee name:");
        String ename=sc.next();
        e.setename(ename);
        System.out.println("\nEnter Employee id:");
        int empid=sc.nextInt();
        e.setempid(empid);
        System.out.println("\nEnter Employee cno:");
        int cno=sc.nextInt();
        e.setcno(cno);
        System.out.println("\nEnter Employee city:");
        String city=sc.next();
        e.setcity(city);
        a.add(e);
        Systyem.out.println("Employee data addedsuccessully\n");
    }
    public void removeEmployee(){
        if(this.e==null){
            System.out.println("There are no Employees to remove");
        }
        else{
            System.out.println("Enter the empid to remove:");
            int empid=sc.nextInt();
            for(Student s:a){
                if(s.empid==empid){
                    a.remove(s);
                }
            }
            System.out.println("Employee data deleted");
            return;
        }
    }
    public void displayEmplloyeedetails(){
        if(a.isEmpty()){
            System.out.println("There are no Employees to update");
        }
        else{
            System.out.println("Enter the empid to update:");
            int empid=sc.nextInt();
            for(Student s:a){
                if(s.empid==empid){
                    System.out.println("1)Employee name\n2)Employee contact number\n3)city\nEnter your choice:");
                    int ch=sc.nextInt();
                    if(ch==1){
                        System.out.println("Enter the Employee name to update");
                        String ename=sc.next();
                        s.ename=ename;
                        System.out.println("Name updated successfully");
                        return;
                    }
                    else if(ch==2){
                
                    }

                }
            }
            System.out.println("Employee data deleted");
            return;
        }       
    }
}