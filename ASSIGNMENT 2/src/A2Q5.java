import java.util.Scanner;
public class A2Q5 {

	public static void main(String[] args) {
		circle obj1 = new circle();
		triangle obj2 = new triangle();

	}

}
abstract class shape{
	abstract void area();
}

class circle extends shape{
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of circle");
		int r = sc.nextInt();
		double ar = Math.PI*r*r;
		System.out.println("area of circle is "+ ar);
	}
}
class triangle extends shape{
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the side of triangle");
		double s1 = sc.nextDouble();
		double s2 = sc.nextDouble();
		double s3 = sc.nextDouble();
		double s = (s1+s2+s3)/2;
		double ar = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("area of triangle is "+ar);

}
}