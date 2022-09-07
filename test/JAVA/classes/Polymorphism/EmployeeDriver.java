class EmployeeDriver{
    public static void main(String[] args){
        Employee e =new Employee();

        System.out.println(e);
    }
}
class Employee{
    
    //static int eno;
    static String name;
    //static int cno;
    static{
        //eno=10;
        name="KARNA";
        //cno=88998899;
    }
    
    Employee(){}
    Employee(int eno,String name,int cno){
        this.eno=eno;
        this.name=name;
        this.cno=cno;
    }
    public String toString(){
        return name;
    }
    
}