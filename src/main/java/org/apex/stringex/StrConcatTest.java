package org.apex.stringex;

public class StrConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "StringConcat";
		String concatString = "Test";
		char[] letters = concatString.toCharArray();
		
		for(int i=0;i<concatString.length();i++)
		{
			testString += letters[i];
		}

		System.out.println("Testing String Concatenation - " + testString);

	}

	

}
