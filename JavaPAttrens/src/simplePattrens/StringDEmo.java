package simplePattrens;

import java.util.Base64;

public class StringDEmo {
	public static void main(String[] args) {
		String plainCreds = "Hello";
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = Base64.getEncoder().encode(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);
		System.out.println(base64CredsBytes);
		System.out.println(base64Creds);
	}

}
