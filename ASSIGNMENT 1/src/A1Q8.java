import java.util.Scanner;
public class A1Q8 {
	 public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("enter the number of rows and column");
	    	int r = sc.nextInt();
	    	int c = sc.nextInt();
	    	int [][]A =  new int[r][c];
	    	
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.println("enter the element");
					A[i][j] = sc.nextInt();
				}}
			display(A);
			sum(A);
		}
	 public static void display(int [][]A) {
	    	System.out.println("elements are");
			for(int i=0;i<A.length;i++) {
				for(int j=0;j<A[0].length;j++) {
					System.out.print(A[i][j] + "\t"); 
				}	
				System.out.println();
			}
	    }
	 
	 public static void sum(int [][]A) {
	    	int sum =0;
	    	for(int i=0;i<A.length;i++) {
	    		for(int j=0;j<A[0].length;j++) {
	    			sum += A[i][j];
	    		}
	    	}
	         System.out.println("sum is " +sum); 
	    }
	    
	 
}
