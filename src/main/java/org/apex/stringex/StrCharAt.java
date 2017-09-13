package org.apex.stringex;

public class StrCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "CharAtString";
		char[] letters = testString.toCharArray();
		int charAt=3;
		if(charAt > 0 && charAt<=testString.length())
			System.out.println("Character located at specified index is "+letters[charAt-1]);
		else
			System.out.println("Cannot find a character at String's specified index");

	}

}
