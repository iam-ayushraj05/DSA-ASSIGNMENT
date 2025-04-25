import java.util.Scanner;
public class A1HQ4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		 
	        System.out.print("Enter the number of rows and columns of the matrices: "); 
	        int r = sc.nextInt(); 
	        int c = sc.nextInt(); 
	 
	        double A[][] = new double[r][c]; 
	        double B[][] = new double[r][c]; 
	 
	        System.out.println("Enter the elements of matrix a: "); 
	        for (int i = 0; i < r; i++) { 
	            for (int j = 0; j < c; j++) { 
	                A[i][j] = sc.nextDouble(); 
	            } 
	        } 
	 
	        System.out.println("Enter the elements of matrix b: "); 
	        for (int i = 0; i < r; i++) { 
	            for (int j = 0; j < c; j++) { 
	                B[i][j] = sc.nextDouble(); 
	            } 
	        } 
	        double C[][] = addmatrix(A,B);
	        
	        System.out.println("The sum of the matrices is: "); 
	        for (int i = 0; i < r; i++) { 
	            for (int j = 0; j < c; j++) { 
	                System.out.print(C[i][j] + " ");}
	            
	        System.out.println();
	        }
		

	}
	public static double[][] addmatrix(double [][]A, double [][]B) {
			double [][]C = new double[A.length][A[0].length];
			for(int i=0;i<A.length;i++) {
				for(int j=0;j<A[0].length;j++) {
					C[i][j] = A[i][j] + B[i][j];
				}
			}
			
			return C;
		
	}

}
