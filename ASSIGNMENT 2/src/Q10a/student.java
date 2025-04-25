package Q10a;

import java.util.Scanner;
public class student {
	protected String name;
	protected int roll;
	protected void inputdetail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name ");
		name = sc.nextLine();
		System.out.println("enter the roill number");
		roll= sc.nextInt();	
	}
	protected void showdeatils() {
		System.out.println("student name is"+name);
		System.out.println("student roll number is"+roll);
	}

}