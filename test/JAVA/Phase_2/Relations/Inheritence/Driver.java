package Inheritence;
public class Driver {

public static void main(String[] args) {
// TODO Auto-generated method stub
Parent p = new Parent();
p.i=10;
System.out.println(p.i);
Child c = new Child();
System.out.println(c.j);
System.out.println(c.i);
c.i = 120;
System.out.println(c.i);
c.m1();
}
}

class Parent {
int i = 1;
public void m1( ) {
System.out.println(i);
}
}

class Child extends Parent {
int j = 1;
public void display() {
System.out.println(i);
}
}
