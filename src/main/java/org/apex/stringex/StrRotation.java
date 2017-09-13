package org.apex.stringex;



public class StrRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcde";	
		String str2="bcdea";

		
		boolean isRotated;
		isRotated =  (str1.length() == str2.length()) && (str1+str1).contains(str2);
		
//	    int length1,length2,tempLength=0;
//	    length1 = str1.length();
//	    length2 = str2.length();
//	    
//	    char[] s1 = str1.toCharArray();
//	    char[] s2 = str2.toCharArray();
//	    if (length1!=length2)
//	    	isRotated = false ;
//	    for (int i=0;i<length1;i++)
//	    {
//	        if (s1[0]==s2[i])
//	        {
//	            for (int j=i,lenght2=0;lenght2<length1;lenght2++,j++)
//	            {
//	                if (s1[lenght2]==s2[j])
//	                	tempLength++;
//	                if (j==length1-1)
//	                    j=0;
//	            }
//	        }
//	    }
//
//	    if (length1==tempLength+1)
//	    	 isRotated = true ;
//	      else
//	    	 isRotated = false ;

		if(isRotated)
			System.out.println("String1 "+str1+" is rotation of String2 "+str2);
		else
			System.out.println("String1 "+str1+" is not a rotation of String2 "+str2);

	}

}
