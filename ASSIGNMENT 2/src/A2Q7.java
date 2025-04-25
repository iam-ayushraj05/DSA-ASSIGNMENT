import java.util.Scanner;
public class A2Q7 {

	public static void main(String[] args) {
		circle1 obj = new circle1("yellow",3);
		obj.disp();

	}

	
}
class shape1{
	String colour;
	shape1(String colour){
		this.colour = colour;
	}
}
class circle1 extends shape1{
	double r;
	circle1(String colour, double r){
		super(colour);
		this.r =r;
	}
	double area(){	
	return Math.PI*r*r;
	}
	void disp() {
		System.out.println("colour of circle is"+ colour);
		System.out.println("area of circle is "+ area());
		}
	}
