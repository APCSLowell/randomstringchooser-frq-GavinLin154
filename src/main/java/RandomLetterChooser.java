public class RandomLetterChooser extends RandomStringChooser
{
	
	public RandomLetterChooser(String str)
	{ 
		/* to be implemented in part (b) */
		String[] letterList = getSingleLetters(str);
		super(letterList);
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
