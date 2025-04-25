import java.util.Scanner;
public class A1HQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		System.out.println("enter the third number");
		int c = sc.nextInt();
		
		if (a + b == c) { 
            System.out.println(a + " + " + b + " = " + c); 
        } else if (a == b - c) { 
            System.out.println(a + " = " + b + " - " + c); 
        } else if (a * b == c) { 
            System.out.println(a + " * " + b + " = " + c); 
        } else { 
            System.out.println("No arithmetic formula found for the given numbers."); 
        } 
		

	}

}
