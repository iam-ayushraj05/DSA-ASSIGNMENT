import java.util.Scanner;
public class A2Q9 {

	public static void main(String[] args) {
		manager obj = new manager("chitteshwar",0.0001,"sweeper");
		obj.managerinfo();
	}
}
class employee{
	String name;
	double salary;
	
	employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	void employeeinfo(){
		System.out.println("the name of employee is "+name);
		System.out.println("salary if employee is "+ salary);
	}
}
class manager extends employee{
	String department;
	
	manager(String name,double salary,String department){
		super(name,salary);
		this.department =department;
	}
	void managerinfo(){
		super.employeeinfo();
		System.out.println("the department of manger "+department);
		
	}
}