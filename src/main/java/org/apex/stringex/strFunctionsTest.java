package org.apex.stringex;

public class strFunctionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "Test String";
		String searchString = "search";
		
		
		testString = strToLowerCase(testString);
		System.out.println("Test String to lower case "+testString);
		testString = strToUpperCase(testString);
		System.out.println("Test String to upper case "+testString);
		testString = strTrim(testString);
		System.out.println("Test String with trimming "+testString);
		char temp[] = strCharArray(testString);
		System.out.println("Test String to char array "+String.valueOf(temp));
		boolean search = strSearchString(testString,searchString);
		System.out.println("Test String contains "+search+" Search String");
		
	}

	public static String strToLowerCase(String testString)
	{
		char[] letters = testString.toCharArray();
		for(int i=0;i<testString.length();i++)
		{
			char c = letters[i];
			if(65 <= c && c <=90 )
				letters[i] = (char) (c+32) ;
		}
		return String.valueOf(letters);
		
	}
	public static String strToUpperCase(String testString)
	{
		char[] letters = testString.toCharArray();
		for(int i=0;i<testString.length();i++)
		{
			char c = letters[i];
			
			if(96 < c && c <123 )
				letters[i] = (char) (c-32) ;
		}
		return String.valueOf(letters);
		
	}
	public static String strTrim(String testString)
	{
		char[] letters = testString.toCharArray();
		char[] temp = new char[10];
		int count =0;
		for(int i=0;i<testString.length();i++)
		{
			char c = letters[i];
			
			if(c == ' ' )
				continue;
			else
			  temp[count] = c;
			  count++;
			
		}
		
		return String.valueOf(temp);
		
	}
	
	public static char[] strCharArray(String testString)
	{
		char[] letters = new char[testString.length()];
		
		for(int i=0;i<testString.length();i++)
		{
			letters[i] = testString.charAt(i);
		}
		
		return letters;
	}
	public static boolean strSearchString(String testString , String searchString)
	{
		boolean search=false;
		testString.length();
	    for(int i=0;i<testString.length();i++)
	    {
	        for(int j=0;j<searchString.length();j++)
	        {
	            if(testString.charAt(i)==searchString.charAt(j))
	            {
	                if(j!=searchString.length()-1 && i!=testString.length()-1)
	                {
	                    if(testString.charAt(i+1)==searchString.charAt(j+1))
	                    {
	                        search=true;
	                        
	                    }
	                }
	            }
	        }
	    }
	    return search;
		
	}
	
		
}
