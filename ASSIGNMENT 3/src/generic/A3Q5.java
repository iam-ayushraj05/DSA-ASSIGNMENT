package generic;
import java.util.Scanner;
public class A3Q5 {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array length");
		int n = sc.nextInt();
		
		Integer []A = new Integer[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		printarray(A);
		

	}
	public static <E> void printarray(E []A) {
		int n = A.length;
		System.out.println("element of array is");
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+" \t ");
		}
	}

}
