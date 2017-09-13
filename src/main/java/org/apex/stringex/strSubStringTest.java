package org.apex.stringex;

public class strSubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testString = "SubString";
		char[] letters = testString.toCharArray();
		int begin=4,end=9;
		String subString="";
        testString.toLowerCase();

		if(begin > 0 && begin <= testString.length() && end >0 && end <= testString.length())
		{

			for(int i=begin-1;i<end;i++)
			{

				subString += letters[i];
			}
		}

		System.out.println("sub string - " + subString);
	}

}
