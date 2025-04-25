package recursion;

public class A3Q8 {

	public static void main(String[] args) {
		int a = power(4,6);
		System.out.println(a);

	}
	public static int power(int a ,int b) {
		if(b==0)
			return 1;
		else
			return a*power(a,b-1);
	

}}
