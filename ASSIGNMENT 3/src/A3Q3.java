import java.util.Scanner;
class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String str){
		super(str);
	}
}
public class A3Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student name");
		String name = sc.nextLine();
		System.out.println("enter ther marks");
		int marks = sc.nextInt();
		check(marks);
		System.out.println(name);
	}
	public static void check(int n) {
	try {	if(n>100) {
			throw new MarksOutOfBoundException("marks not grreater than 100");
		}
		else {
			System.out.println(n);
		}
	}
	catch (MarksOutOfBoundException e) {
		System.out.println(e);
	}

}}
