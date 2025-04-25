import java.util.Scanner;
public class A1Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number ");
		int n = sc. nextInt();
		System.out.println((sum_of_digit(n)));
	}
	
	public static int sum_of_digit(int n ) {
		//while(n>=10) {
			int sum =0;
			while(n>0) {
				int r = n%10;
				sum += r;
				n = n/10;
			}
			n = sum;
		//}
		
		
		return n;
	}

}
