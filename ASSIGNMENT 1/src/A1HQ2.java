import java.util.Scanner;
public class A1HQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array:");
		int n=sc.nextInt();
		sc.nextLine();
		String []A=new String[n+1];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextLine();
		}
		System.out.println("Reversed order of lines:");
		for(int i=n-1;i>=0;i--) {
			System.out.print(A[i]+"\n");
		}


	}

}
