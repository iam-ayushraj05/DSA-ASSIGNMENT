import java.util.Scanner;
public class A2Q2 {
	int real;
	int imag;
	
	void setdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the real and imaginary part ");
	    real = sc.nextInt();
	    imag = sc.nextInt();
		
	}
	void display() {
		System.out.println(real + " + " + imag +"i");
	}
	
	A2Q2 add(A2Q2 c1,A2Q2 c2) {
		A2Q2 obj = new A2Q2(); 
		obj.real = c1.real + c2.real;
		obj.imag = c1.imag + c2.imag;
		
		return obj;
	}	

}
