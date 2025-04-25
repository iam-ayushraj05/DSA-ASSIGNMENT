import java.util.Scanner;

public class A1Q3 {

	 public static void main(String args) { 
	        Scanner input = new Scanner(System.in); 
	 
	        System.out.print("Enter a number: "); 
	        int number = input.nextInt(); 
	 
	        int originalNumber = number; 
	        int sum = 0; 
	        int product = 1; 
	 
	        while (number > 0) { 
	            int digit = number % 10; 
	            sum += digit; 
	            product *= digit; 
	            number /= 10; 
	        } 
	 
	        if (sum == product) { 
	            System.out.println(originalNumber + " is a spy number."); 
	        } else { 
	            System.out.println(originalNumber + " is not a spy number."); 
	        } 
	    } 

}
