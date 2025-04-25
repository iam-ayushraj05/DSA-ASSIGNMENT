import java.util.Scanner;
public class A1HQ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		///int rnd = (int)(Math.random()*(2));
		int [][]A = new int[4][4];
		 for (int i = 0; i < 4; i++) { 
	            for (int j = 0; j < 4; j++) { 
	            	int rnd = (int)(Math.random()*(2));
	                A[i][j] = rnd; // Generates 0 or 1 
	            } 
	        }
		 System.out.println("The matrix is: "); 
	        for (int i = 0; i < 4; i++) { 
	            for (int j = 0; j < 4; j++) { 
	            	
	                System.out.print(A[i][j] + " "); 
	            } 
	            System.out.println(); 
	        } 
	
	
	int maxRone = 0 ; 
	int maxRIndex=0;
	
    for(int i = 0; i<4; i++) { 
        int ROnes = 0; 
        for(int j = 0; j < 4; j++) { 
            if(A[i][j] == 1) { 
                ROnes++; 
            } 
        } 
        if (ROnes > maxRone) { 
            maxRone = ROnes; 
            maxRIndex = i;} }
    
    int maxCone = 0;
    int maxCIndex=0;
    
    for (int j = 0; j < 4; j++) { 
    	int Cones = 0;
        for (int i = 0; i < 4; i++) { 
            if(A[i][j] == 1) {
            	Cones++;
            }
        } 
       if(Cones > maxCone) {
    	   maxCone = Cones;
    	    maxCIndex = j;
       }
    } 
    System.out.println("row with the most ones is" + maxRIndex + "contain" + maxRone + "ones");
    System.out.println("ccolumn with the most ones is" + maxCIndex + "contain" + maxCone + "onec");
       
}
}
