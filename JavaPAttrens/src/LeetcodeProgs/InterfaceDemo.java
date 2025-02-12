package LeetcodeProgs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		List<Integer> list1=list.stream().filter(i -> i > 30).toList();
		System.out.println(list1);
	}

}
