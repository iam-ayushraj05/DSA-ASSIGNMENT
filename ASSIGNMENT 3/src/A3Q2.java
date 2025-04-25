import java.util.Scanner;
public class A3Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []colour = new String[4];
		for(int i =0 ;i<4;i++) {
			System.out.println("enter your favourite colour");
			colour[i] = sc.nextLine();
		}
		try {
			int a = Integer.parseInt(colour[2]);
		}
		catch(NumberFormatException e){
			System.out.println(e);
			
		}
		try {
			colour[4] = "yellow";
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		
		}
		

	}

}
