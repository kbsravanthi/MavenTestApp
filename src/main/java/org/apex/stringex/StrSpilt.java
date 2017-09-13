package org.apex.stringex;

public class StrSpilt {

	public static void main(String[] args) {


		String testString="String_functions_test";

		for(int i=0;i<testString.length()-1;)
		{
			int length=testString.indexOf("_",i); 
			
			if(length==-1)
			{
				length=testString.length();
			}

			System.out.print(" "+testString.substring(i,length));
			i=length+1;
		}


	}

}
