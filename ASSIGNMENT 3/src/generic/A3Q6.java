package generic;

import java.util.Scanner;

public class A3Q6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array length");
		int n = sc.nextInt();
		
		Integer []A = new Integer[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		System.out.println("enter the element to count frequency");
		Integer e = sc.nextInt();
		
	 count(A,e);
	}
	public static <E> void count(E[] arr,E ele) {
		 int c =0;
		 for(int i =0;i<arr.length;i++) {
			if(arr[i].equals(ele))
				c++;
		 }
		 System.out.println(c);
	}

}
