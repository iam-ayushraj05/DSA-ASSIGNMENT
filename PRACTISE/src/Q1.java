
public class Q1 {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.a);

	}

}
class A {
	final int a = abc();
	protected int abc() {
		return 10;
		//System.out.println("hi");
	}
}
