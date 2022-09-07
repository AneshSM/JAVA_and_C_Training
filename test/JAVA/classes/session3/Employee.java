class Employee{
    double sal;
    int empid;
    String ename;
    String dob;
    Employee(){
        System.out.println("A");
    };
    Employee(int empid,String dob,String ename){
        this(empid,dob);
        //this.empid=empid;
        //this.dob=dob;
        this.ename=ename;
        System.out.println(this.empid);
        System.out.println(this.ename);
        System.out.println(this.dob);
    }
    Employee(int empid,String dob){
        this(empid);
        //this.empid=empid;
        this.dob=dob;
        System.out.println(this.empid);
        System.out.println("hoho"+this.dob);

    }
    Employee(int empid){
       // this(empid,dob,ename);
        this.empid=empid;
        System.out.println(this.empid);
    }

    public static void main(String[] args){
       Employee e= new Employee(123,"1-2-1111","A");
       Employee e1= new Employee(456,"6-6-777");
       Employee e2= new Employee(789);
    }
}