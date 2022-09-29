package assignments;
class Company {
	int empid=10;
	double salary=25000;
	void display() {
		System.out.println("I am company class display()...");
	}
	void display(int i) {
		int empid=i;
		System.out.println("empid :"+empid);
		System.out.println("empid :"+this.empid);
		System.out.println("I am company class display()...");
	}
	Company(double s){
		System.out.println("Value of s is :"+s);
		System.out.println("parameterized contructor");
	}
	Company(){
		this(2.5);
		System.out.println("normal constructor");
	}
}
class Employee extends Company {
	void display() {
		super.display();
		System.out.println("I am Employee class display()...");
	}
	void callme() {
		System.out.println("I am Employee class callme()...");
	}
}
public class InheritanceAssigment1 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.display();
		System.out.println("empid :"+e1.empid);
		System.out.println("salary :"+e1.salary);
		e1.display(77);
		e1.callme();
		System.out.println("****************************");
		Company c1=new Company();
		c1.display();
		System.out.println("****************************");
		Company e2=new Employee();
		e2.display();

	}

}
