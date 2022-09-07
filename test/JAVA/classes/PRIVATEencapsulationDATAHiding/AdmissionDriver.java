class AdmissionDriver{
    public static void main(String[] args){
        Admission a=new Admission("AIET","Mijar")
        a.add(new Student("Karna",9999999999,"puthige","CSE"));
        
    }
}

class Student{
    String Name,address,course;
    long ContactNo,sno;
    Student(){}
    Student(String Name,long ContactNo,String address,String course){
        this.Name=Name;
        this.ContactNo=ContactNo;
        this.address=address;
        this.course=course;
    }
}

class Admission{    
    String clgname,place;
    Student s;

    Admission(){}
    Admission(String clgname,String place){
        this.clgname=clgname;
        this.place=place;
    }
    Admission(String clgname,String place,Student s){
        this.clgname=clgname;
        this.place=place;
        this.s=s;
    }

    public void add(Student s){
        this.s=s;
    }
}