package Activities;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter word / phrase: ");
		String str = in.nextLine();
		
		if( sentencePalindrome(str))
		System.out.println(str + " is palindrome");
		else
		System.out.println(str + " is NOT palindrome");
	}
	
	static boolean sentencePalindrome(String str)
	{
		int l = 0;
		int h = str.length()-1;
		
		str = str.toLowerCase();
		
		while(l <= h)
		{
			char getAtl = str.charAt(l);
			char getAth = str.charAt(h);

			if (!(getAtl >= 'a' && getAtl <= 'z'))
				l++;
			else if(!(getAth >= 'a' && getAth <= 'z'))
				h--;
			else if( getAtl == getAth)
			{
				l++;
				h--;
			}
			else
				return false;
		}
		return true;
	}

}
