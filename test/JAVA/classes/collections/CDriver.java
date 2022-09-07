import java.util.Scanner;
import java.util.ArrayList;



class CDriver {
	public static void main(String[] args) {
				Company c = new Company();
				Scanner sc = new Scanner(System.in);
				while(true) {
					System.out.println("1.Add Employee\n  2.Remove Employee\n 3.Update Employee\n  4.Display Employee\n  5.Exit\n");
					System.out.println("enter the choice");
					int choice = sc.nextInt();
					switch(choice) {
					case 1:
						c.addEmp();
						break;
					case 2:
						c.removeEmp();
						break;
					case 3:
						c.updateEmp();
						break;
					case 4: 
						c.displayEmp();
						break;
					case 5: 
						System.exit(0);
					default :
						System.out.println("invalid choice");
					}

			}

		}
		

}


    
class Employee {
	String name;
	int id;
	long cno;
	String city;
	public Employee(String name, int id,  long cno,String city) {
		this(name,id,cno);
		this.city=city;
	}
	public Employee(String name, int id, long cno) {
		this(name,id);
		this.cno = cno;
	}
	public Employee(String name,int id) {
		this(name);
		this.id = id;
	}
	public Employee(String name) {
		this.name =name;
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public long getcno() {
		return cno;
	}
	public String getcity() {
		return city;
	}
	public void setcno(long cno) {
		this.cno = cno;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public String toString() {
		return "Employee name =" +name+"\nEmployee city =" +city+ "\nEmployee id "+id+"\nEmployee cno="+cno;
	}
}



	class Company {
	Employee e;
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> a = new ArrayList();
	public void addEmp() {
		System.out.println("Enter the employee name");
		String name=sc.next();
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		System.out.println("Enter the employee cno");
		long cno=sc.nextLong();
		System.out.println("Enter the employee city");
		String city=sc.next();
		e=new Employee(name,id,cno,city);
		a.add(e);
	}
	public void displayEmp() {
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		for(Employee e:a ) {
			if(id==e.id) {
				System.out.println(e);
				return;
			}
			
		}
		System.out.println("employee not found");
	}
	public void removeEmp() {
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		for(Employee e:a ) {
			if(id==e.id) {
		a.remove(e);
		System.out.println("Employee removed");
		return;
	}
	}
	}
	public void updateEmp() {
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		for(Employee e:a ) {
			if(id==e.id) {
				System.out.println("Enter the employee cno to update");
				long cno=sc.nextLong();	
				e.setcno(cno);
				System.out.println("Enter the employee city to update");
				String city=sc.next();	
				e.setcity(city);
				System.out.println("updated successfully");
				return;
			}
		}
		System.out.println("employee not found");	
	}
	}