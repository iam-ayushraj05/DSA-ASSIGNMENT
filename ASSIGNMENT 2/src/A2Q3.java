import java.util.Scanner;
public class A2Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		book obj[] = new book[2];
		
		for(int i=0;i<2;i++) {
			System.out.println("enter the book id");
			int bid = sc.nextInt();
			System.out.println("enter the price of book");
			double pr = sc.nextDouble();
			System.out.println("enter the quantity");
			int quan = sc.nextInt();
			obj[i] = new book(bid,pr,quan);
			obj[i].display();
		
		}
		System.out.println("total amount is" + book.total_amt);
	}

}

 class book {
	int bid;
	double price;
	int quan;
	static double total_amt=0.0;
	
	book(int bid,double price,int quan){
		this.bid = bid;
		this.price = price;
		this.quan =quan;
		
	}
	void display() {
		System.out.println("book id is " + bid);
		System.out.println("price of book is " + price);
		System.out.println("quantity of book is "+ quan);
		System.out.println("totak amount of book is " + calc());
	}
	
	double calc() {
		total_amt = price*quan;
	   return price*quan;
			
	}
	

}
