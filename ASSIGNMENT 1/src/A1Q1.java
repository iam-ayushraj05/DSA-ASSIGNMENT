import java.util.Scanner;
public class A1Q1 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in); 
		   
	        System.out.println("Enter a positive integer greater than 2: "); 
	        int number = sc.nextInt(); 
	 
	        if (number <= 2) { 
	            System.out.println("Invalid input. Please enter a number greater than 2."); 
	            return; 
	        } 
	 
	        int count = 0; 
	        while (number >= 2) { 
	            number /= 2; 
	            count++; 
	        } 
	 
	        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is " + count); 

	}

}
