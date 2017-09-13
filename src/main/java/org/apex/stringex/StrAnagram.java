package org.apex.stringex;

import java.util.Arrays;

public class StrAnagram {

	public static void main(String[] args) {

		String str1="motherinlaw";	
		String str2="womanhitler";


		char[] firstStr  = str1.toCharArray();
		char[] secondStr = str2.toCharArray();
		Arrays.sort(firstStr);
		Arrays.sort(secondStr);
		boolean isAnagram = Arrays.equals(firstStr, secondStr);
		if(isAnagram)
			System.out.println("String1 "+str1+" is anagram of String2 "+str2);
		else
			System.out.println("String1 "+str1+" is not anagram of String2 "+str2);
	}
}

