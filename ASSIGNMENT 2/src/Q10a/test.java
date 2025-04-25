package Q10a;

import java.util.Scanner;

public class test extends student{
	protected int mark1;
	protected int mark2;
	
	protected void inputdetail() {
		Scanner sc = new Scanner(System.in);
		super.inputdetail();
		System.out.println("enter the mark1 ");
		mark1 = sc.nextInt();
		System.out.println("enter the mark2");
		mark2 = sc.nextInt();	
	}
	protected void showdeatils() {
		super.showdeatils();
		System.out.println("marks1 is "+mark1);
		System.out.println("mark2 is "+mark2);
	}

}
