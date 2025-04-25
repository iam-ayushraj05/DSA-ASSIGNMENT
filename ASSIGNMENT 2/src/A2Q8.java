public class A2Q8 {

	public static void main(String[] args) {
		duck obj = new duck("ayusman");
		obj.display();

	}

}
interface flyable{
	void fly();
}
interface swimable{
	void swim();
}
class duck implements flyable ,swimable{
	String name;
	duck(String name){
		this.name = name;
		
	}
	public void fly() {
		System.out.println(name+" the dick is fly");
	}
	public void swim() {
		System.out.println(name+" the duck is swim");
	}
	void display() {
		System.out.println("the duck name is "+name);
		fly();
		swim();
	}
}
