
public class A2Q2main {

	public static void main(String[] args) {
		A2Q2 obj1 = new A2Q2();
		A2Q2 obj2 = new A2Q2();
		
		obj1.setdata();
		obj2.setdata();
		obj1.display();
		obj2.display();
		A2Q2 obj3 = new A2Q2();
		obj3 = obj3.add(obj1, obj2);
		
		
		obj3.display();
		
	}

}
