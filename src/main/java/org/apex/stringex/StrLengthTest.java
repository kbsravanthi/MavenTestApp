package org.apex.stringex;

public class StrLengthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "String Length";
		testString = testString + '\0';
		char[] letters = testString.toCharArray();
		int length=0;
		for(int i=0;letters[i]!='\0';i++)
		{
			length++;
		}

		System.out.println("Length " + length);

	}

}
