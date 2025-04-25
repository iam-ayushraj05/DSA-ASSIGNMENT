import java.util.Scanner;
public class A1Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		 
        System.out.print("Enter your weight in kilograms: "); 
        double weight = input.nextDouble(); 
 
        System.out.print("Enter your height in meters: "); 
        double height = input.nextDouble(); 
 
        double bmi = weight / (height * height); 
 
        String category; 
        if (bmi < 18.5) { 
            category = "Underweight"; 
        } else if (bmi < 25) { 
            category = "Normal Weight"; 
        } else if (bmi < 30) { 
            category = "Overweight"; 
        } else { 
            category = "Obese"; 
        } 
 
        System.out.println("Your BMI is: " + bmi); 
        System.out.println("Category: " + category); 
	}

}
