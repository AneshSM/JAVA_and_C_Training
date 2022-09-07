//package linkedlist;
import java.util.Scanner;
import java.util.ArrayList;



class SDriver {
public static void main(String[] args) {
School c = new School();
Scanner sc = new Scanner(System.in);
while(true) {
System.out.println("1.Add Student\n2.Remove Student\n3.Update Student\n4.Display Student\n5.Exit\n");
System.out.println("enter the choice");
int choice = sc.nextInt();
switch(choice) {
case 1:
c.addStudent();
break;
case 2:
c.removeStudent();
break;
case 3:
c.updateStudent();
break;
case 4:
c.displayStudent();
break;
case 5:
System.exit(0);
}

}

}
}


class Student {
    String name;
    int id;
    long cno;
    public Student(String name, int id,  long cno) {
    this.name = name;
    this.id =id;
    this.cno=cno;
    }
    public String toString() {
    return "Student name =" +name+ "";
    }
    }



class School {
Student s;
Scanner sc = new Scanner(System.in);
ArrayList<Student> a = new ArrayList();
public void addStudent() {
System.out.println("Enter the student name");
String name=sc.next();
System.out.println("Enter the student id");
int id=sc.nextInt();
System.out.println("Enter the student cno");
long cno=sc.nextLong();
s=new Student(name,id,cno);
a.add(s);
System.out.println("Admission Successfull.....");
}
public void displayStudent() {
System.out.println("Enter the student id");
int id=sc.nextInt();
for(Student s:a ) {
if(id==s.id) {
System.out.println(s);
return;
}

}
System.out.println("Student not found");
}
public void removeStudent() {
System.out.println("Enter the student id");
int id=sc.nextInt();
for(Student s:a ) {
if(id==s.id) {
a.remove(s);
System.out.println("Student removed");
return;
}
}
System.out.println("Student not found");
}
public void updateStudent() {
System.out.println("Enter the student id");
int id=sc.nextInt();
for(Student s:a ) {
if(id==s.id) {
System.out.println("Enter the student name to update");
String name=sc.next();
s.name=name;
System.out.println("Name updated successfully");
return;
}
}
System.out.println("Student not found");
}
}
