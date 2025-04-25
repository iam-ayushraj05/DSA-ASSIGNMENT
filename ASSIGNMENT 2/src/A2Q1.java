import java.util.Scanner;
public class A2Q1 {
	String name;
	int age;
	
	void setdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name and age");
		name = sc.nextLine();
		age =sc.nextInt();
	}
	void Displaydata() {
		System.out.println("NAME OF THE PERSON IS  " + name );
		System.out.println("AGE OF THE PERSON  "+ age);
	}
}
