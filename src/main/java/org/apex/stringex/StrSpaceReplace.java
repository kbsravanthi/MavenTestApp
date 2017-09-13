package org.apex.stringex;

public class StrSpaceReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "ab cd de";
		String spaceReplace="";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				spaceReplace += string.charAt(i);
			else
				spaceReplace += "%20";

		}
		System.out.println("Original String "+string+"\nAfter space is replaced with '%20' - "+spaceReplace);

	}

}
