package LeetcodeProgs;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		
		
		//local for the country side notation like theri symbols  or their language notation 
		//style for k or thousand i.e full form style has two properties one is short for k,m etc && LONG for thousand, million.
		NumberFormat data = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		System.out.println(data.format(1000009));
	}
}
