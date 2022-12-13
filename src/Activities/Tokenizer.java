package Activities;

import java.util.*;

public class Tokenizer {

	public static void main(String args[]) {
        
    	Scanner in = new Scanner(System.in);  
        String myDelim = ";";
        
        System.out.println("Enter Source Language: ");
        String sourceLanguage = in.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(sourceLanguage);

        int count = tokenizer.countTokens();
        for (int i = 0; i < count; i++)
        {
        	switch(i) 
        	{
        	case 0:
        		System.out.print("<data_type> ");
        		break;
        	case 1:
        		System.out.print("<identifier> ");
        		break;
        	case 2:
        		System.out.print("<assignment_operator> ");
        		break;
        	case 3:
        		System.out.print("<value> ");
        		break;
        	case 4:
        		System.out.print("<delimiter> ");
        		break;
        	}
        }
        
        while (tokenizer.hasMoreTokens())
        {
        	
        }
    }
}
