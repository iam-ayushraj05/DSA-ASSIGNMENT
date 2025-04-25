import java.util.*;
public class A2Q4 {

	public static void main(String[] args) {
		 System.out.println("Output for first object");
		 deposit d = new deposit(1000,2,3);
		 d.calamt();
		 d.display();
		 System.out.println("Output for second object");
		 deposit d1 = new deposit(2000,6.0);
		 d1.calamt();
		 d1.display();
	}

}

class deposit {
	long principal;
	int time;
	double rate;
	double totamt;
	
	deposit(){
		Scanner sc = new Scanner(System.in);
		long principal = sc.nextLong();
		int time =sc.nextInt();
		double rate = sc.nextDouble();
		}
	deposit(long principal,int time,double rate){
		this.principal =principal;
		this.time = time;
		this.rate =rate;
		
	}
	deposit(long principal,int time){
		this.principal =principal;
		this.time= time;
		
	}
	deposit(long principal,double rate){
		this.principal = principal;
		this.rate = rate;
		
	}
	void calamt() {
		totamt = (principal + (principal * rate* time))/100;
		System.out.println("total amount is " + totamt);
	}
	void display() {
		 System.out.println("Your principal is: "+principal);
		 System.out.println("Loan time: "+time);
		 System.out.println("Rate of interest: "+rate);
	}
	
	

}
