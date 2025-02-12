package LeetcodeProgs;
//passing paramaneters to lambdas.
interface Shape {
	int add(int a, int b);
	static String welcome() {
		return "welcome vijay";
	}
	default void print() {
		System.out.println("hey welcome to BEC.");
	}
}

class Abc implements Shape{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Shape sh = (a, b) -> a + b;
		Abc abc=new Abc();
		abc.print();
		System.out.println(sh.add(10, 20));
		System.out.println(Shape.welcome());
	}

}
