class EmployeeDriver{
    public static void main(String[] args) {
        Employee e=new Employee(1001,"ABC",12345,"ovvvo",100000,"CSE");
        System.out.println(e.getdata());
        
        System.out.println("\n\nAfter changing Contact numb:");
        e.setCno(56789);
        System.out.println(e.getdata());


        System.out.println("\n\nAfter changing Location:");
        e.location("vooov");
        System.out.println(e.getdata());
        
        System.out.println("\n\nAfter changing Department:");
        e.department("ISE");
        System.out.println(e.getdata());
        
        System.out.println("\n\nAfter changing Salary:");
        e.salary(200000);
        System.out.println(e.getdata());
    }
}



class Employee{
    private int empid;
    private int cno;
    private int sal;
    private String ename;
    private String location;
    private String department;
    Employee(){}
    Employee(int empid,String ename,int cno,String location,int sal,String department){
        this.empid=empid;
        this.ename=ename;
        this.cno=cno;
        this.location=location;
        this.sal=sal;
        this.department=department;
    }
    public String getdata() {
        return "Employee data:\n"+empid+" "+ename+" "+cno+" "+location+" "+sal+" "+department+"\n";
    }
    public void setCno(int cno){
        this.cno=cno;
    }
    public void location(String loc){
        this.location=loc;
    }
    public void department(String dept){
        this.department=dept;
    }
    public void salary(int sal){
        this.sal=sal;
    }
}