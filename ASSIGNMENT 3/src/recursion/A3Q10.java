package recursion;

public class A3Q10 {

	public static void main(String[] args) {
		int a = fibo(5);
		System.out.println(a);

	}
	public static int fibo(int n) {
		if(n==0)
			return 0;
		else if(n==1)
		return 1;
		else
			return fibo(n-1) + fibo(n-2);
	}

}
