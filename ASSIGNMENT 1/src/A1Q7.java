import java.util.Scanner;
public class A1Q7 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in); 
	 
     System.out.print("Enter the number of elements in the array:"); 
     int n =sc.nextInt(); 
     int []A = new int[n]; 
     System.out.print("Enter the elements of the array: "); 
     for (int i = 0; i < n; i++) { 
        A[i] = sc.nextInt(); 
     }
     int l = A[0];
     int s = A[0];
     int maxc=1;
     int minc =1;
     int maxfirstindex=0;
     int minLastIndex=0;
     
     for (int i = 1; i < n; i++) { 
         if (A[i] > l) {
             l = A[i]; 
             maxc= 1; 
             maxfirstindex = i; 
         } else if (A[i] == l) { 
             maxc++; 
         }
      if (A[i] < s) { 
         s = A[i]; 
         minc = 1; 
         minLastIndex = i; 
     } else if (A[i] == s) { 
         minc++; 
         minLastIndex = i;
     }}
     System.out.println("maxm elements is" + l + "occurs"+maxc+"first index "+ maxfirstindex);
     System.out.println("minm elemenet is" + s + "occurs"+minc+"last index"+ minLastIndex); 
     
     
}
	
}