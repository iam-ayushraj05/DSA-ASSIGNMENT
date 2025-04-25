package generic;

public class A3Q4 {

	public static void main(String[] args) {
		//box <Integer,String> obj1 = new box<Integer,String> (1996,"ITER");
		//obj1.display();
		box <Integer> obj2 = new box<Integer> (1996,2025);
		obj2.display();
		//box <Double,Double> obj3 = new box<Double,Double> (1.9,20.25);
		//obj3.display();
	}

}
class box <T1>{
	T1 var1;
	T1 var2;
	box(T1 var1,T1 var2){
		this.var1 = var1;
		this.var2 = var2;
	}
	void display() {
		System.out.println("the first varibale is "+var1);
		System.out.println("the second variable is "+ var2);
	}
}
