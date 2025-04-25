
public class A2Q1main {

	public static void main(String[] args) {
		A2Q1 obj1 = new A2Q1();
		A2Q1 obj2 = new A2Q1();
		
		obj1.name = "rohan";
		obj1.age = 19;
		
		obj2.setdata();
		obj1.Displaydata();
		obj2.Displaydata();
		
		if(obj1.age>obj2.age) {
			System.out.println(obj2.name + "is younger than"  + obj1.name);
		}
		else {
			System.out.println(obj1.name + "  is younger than  " + obj2.name
					);
		}

	}

}
