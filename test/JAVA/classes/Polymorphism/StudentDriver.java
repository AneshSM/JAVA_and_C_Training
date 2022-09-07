import java.lang.Object;
class Student{
    int usn;
    String name;
    Student(){}
    Student(int usn,String name){
        this.usn=usn;
        this.name=name;
    }
    public boolean equal(Object o){
        Student s=(Student)o;
        return this.name==s.name;
    }
}

class StudentDriver{
    public static void main(String[] args){
        Student s1=new Student(200,"Karna");
        Student s2=s1;
        Student s3=new Student(100,"Shameer");
        System.out.println(s1.equal(s2));
        System.out.println(s1.equal(s3));
    }
}