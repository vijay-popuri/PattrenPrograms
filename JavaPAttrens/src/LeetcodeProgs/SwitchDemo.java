package LeetcodeProgs;

public class SwitchDemo {

	public static void main(String[] args) {
		String a = "vijay";
		String v = "";
		switch (a) {
		case "vijay", "VIJAY" -> v = "vijay is here ";
		case "raju", "RAJU" -> v = "raju is here";
		default -> v = "other one is present";
		}
		System.out.println(v);

	}

}
