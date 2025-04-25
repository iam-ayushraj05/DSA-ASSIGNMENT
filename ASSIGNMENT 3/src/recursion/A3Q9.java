package recursion;

public class A3Q9 {

	public static void main(String[] args) {
	reverse(12323);
		
	}
	public static void reverse(int n ) {
		if(n <10) {
			System.out.println(n);
		}
		else {
			System.out.print(n%10);
			reverse(n/10);
		}
	}

}
