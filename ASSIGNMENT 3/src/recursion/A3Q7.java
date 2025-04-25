package recursion;

public class A3Q7 {

	public static void main(String[] args) {
		int a = fact(5);
		int b = fact(10);
		System.out.println(a);
		System.out.println(b);
	}
	public static int fact(int n ) {
		if(n==0||n==1)
			return 1 ;
		else
			return n*fact(n-1);
	}

}
