package hm1;

import java.util.regex.Pattern;

public class Validation {

	public static int isAplha(String check) 
	{
		if(Pattern.matches("[a-zA-Z]+", check)) 
		{ 
		return 1; 
		} 
		else 
		{ 
		return 0; 
		} 
	}
	
	public static int isNumber(String check)
	{
		int found=0;
		for(int i=0;i<check.length();i++)
		{
			char l=check.charAt(i);
			if(l=='1'||l=='2'||l=='3'||l=='4'||l=='5'||l=='6'||l=='7'||l=='8'||l=='9'||l=='0')
			{
				found=1;
			}
			else 
				found=0;
		}
		if(found==1)
			return 1;
		else 
			return 0;
	}
	
	public static int isEmail(String check) 
	{
		int found=0;
		for(int i=0;i<check.length();i++)
		{
			char l=check.charAt(i);
			if(l=='@'||l=='.')
			{
				found=found+1;
			}
			//else 
				//found=0;
		}
		if(found>=2)
			return 1;
		else 
			return 0;
	}

}
