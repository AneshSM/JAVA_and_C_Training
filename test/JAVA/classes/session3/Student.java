
// class Student {
//     int sid;
//     String sname;
//     long cno;
//     String city;
//     String SchoolName;
//     Student() {}
//     Student(int sid,String sname,long cno,String city,String SchoolName) {
//     this(sid,sname,cno);
//     this.city = city;
//     this.SchoolName = SchoolName;
//     }
//     Student(int sid,String sname,long cno) {
//     this(sid,sname);
//     this.cno = cno;
//     }
//     Student(int sid,String sname) {
//     this.sid =sid;
//     this.sname = sname;
//     }
//     public static void main(String[] args)
//      {
//     Student s1 = new Student(1,"Anesh");
//     System.out.println(s1.sid);
//     Student s2 = new Student(2,"Karunakar",78956764);
//     System.out.println(s2.sid);
//     System.out.println(s2.sname);
//     System.out.println(s2.cno);
//     Student s3 = new Student(3,"Shameer",78956764,"Mdb","Rotary");
//     System.out.println(s3.sid);
//     System.out.println(s3.sname);
//     System.out.println(s3.cno);
//     System.out.println(s3.city);
//     System.out.println(s3.SchoolName);
//     }
//    }
    
    
    



class Student{
    int sid;
    String sname;
    int cno;
    String city;
    String schoolName;
    Student(){System.out.println("Student");}
    Student(int sid,String sname,int cno,String city,String schoolName){
        this(sid,sname,cno,city);
        System.out.println("return from quater argument call");
        System.out.println(sid+" "+sname+" "+cno+" "+city+" "+schoolName);
    }
    Student(int sid,String sname,int cno,String city){
        this(sid,sname,cno);
        System.out.println("return from triple argument call");
        System.out.println(sid+" "+sname+" "+cno+" "+city);
    }
    Student(int sid,String sname,int cno){
        this(sid,sname);
        System.out.println("return from double argument call");
        System.out.println(sid+" "+sname+" "+cno);
    }
    Student(int sid,String sname){
        this(sid);
        System.out.println("return from single argument call");
        System.out.println(sid+" "+sname);
    }
    Student(int sid){
        this();
        System.out.println("return from empty argument call");
        System.out.println(sid);
    }
    public static void main(String[] args){
        Student s1 = new Student(100,"ABC",1,"aaaaa","zzzzzzzz");
    }
}