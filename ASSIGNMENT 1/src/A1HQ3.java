import java.util.Scanner;
public class A1HQ3 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); 
	 
	        System.out.print("Enter the length of the arrays: "); 
	        int n = sc.nextInt(); 
	 
	        int a[] = new int[n]; 
	        int b[] = new int[n]; 
	        int c[] = new int[n]; 
	 
	        System.out.print("Enter the elements of array a: "); 
	        for (int i = 0; i < n; i++) { 
	            a[i] = sc.nextInt(); 
	        } 
	 
	        System.out.print("Enter the elements of array b: "); 
	        for (int i = 0; i < n; i++) { 
	            b[i] = sc.nextInt(); 
	        } 
	 
	        for (int i = 0; i < n; i++) { 
	            c[i] = a[i] * b[i]; 
	        } 
	        
	 
	        System.out.print("The dot product of a and b is: "); 
	        for (int i = 0; i < n; i++) { 
	            System.out.print(c[i] + " "); 
	        } 
	        System.out.println(); 
	}

}
