import java.util.Scanner;
public class A1Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		if(oddnum(n))
			System.out.println("odd number");
		else
			System.out.println("even number");
			
		

	}
	public static boolean oddnum(int n) {
		return ((n&1)==1);
	}

}
