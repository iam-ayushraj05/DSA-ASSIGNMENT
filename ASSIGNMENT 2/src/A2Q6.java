import java.util.Scanner;
public class A2Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		car obj = new car("Model",2000,"101",50);
		obj.cardisp();
	}

}
class vechile {
	String Model;
	int year;
	
	vechile(String Model,int year){
		this.Model = Model;
		this.year =year;
	}
}
class car extends vechile{
	String carid;
	double price;
	
	car(String carid,double price,String Model,int year){
		super(Model,year);
		this.carid = carid;
		this.price =price;
	}

void cardisp() {
	System.out.println("moedl = " +Model);
	System.out.println("year = "+ year);
	System.out.println("carid ="+ carid);
	System.out.println("price = "+ price);
}
	
}
