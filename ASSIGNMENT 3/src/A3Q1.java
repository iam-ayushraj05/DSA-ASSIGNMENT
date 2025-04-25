import java.util.Scanner;
public class A3Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		try {
			check(n);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}

	}
	public static void check(int n) {
		if(n<0) {
			throw new NumberFormatException("negative number");
		}
		else {
			System.out.println("my lucky number is "+n);
			
		}
	}

}
