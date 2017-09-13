package org.apex.stringex;

public class StrReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "StringReplace";
		char replace ='c';
		char replaceWith = 'k';
		char[] letters = testString.toCharArray();
		
		for(int i=0;i<testString.length();i++)
		{
			if(letters[i] == replace)
			{
				
			   letters[i] = replaceWith;
			  
			}
		}
		
		testString = String.valueOf(letters);
		System.out.println("String Replace - " + testString);


	}

}
