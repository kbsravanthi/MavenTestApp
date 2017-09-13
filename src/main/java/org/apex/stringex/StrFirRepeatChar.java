package org.apex.stringex;

public class StrFirRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "apple";

		char [] lettersTestString = testString.toCharArray();
		boolean repeatCharFound = false;
		for (int i = 0; i < lettersTestString.length; i++)
		{
			if(!repeatCharFound)
			{
				char charPos = lettersTestString[i];
				for (int j = i+1; j < lettersTestString.length; j++)
				{
					if(charPos == lettersTestString[j])
					{
						System.out.println("First Repeatable character is : "+lettersTestString[j] );
						repeatCharFound = true;
						break;
					}

				}

			}


		}
		if(!repeatCharFound){
			System.out.println("No repeat characters found");
		}


	}

}



