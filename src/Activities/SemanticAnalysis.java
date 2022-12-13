package Activities;

import java.util.Scanner;

public class SemanticAnalysis 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Expression: ");
		String expression = in.nextLine();
		
		String input = expression;
		String result = "";
		if(input.startsWith("String")&&input.endsWith(";")) 
		{        
            
            String[] string = input.split(" ");                        
              
            if(string.length >= 2&&input.contains("=")) 
            {
                
                String val = input.substring(input.indexOf("=")).replaceAll("[=;]", "");
                        
                String fullString = val.replaceAll("[^a-zA-Z0-9-\"]", "");                    
                
                if(fullString.startsWith("\"")&&val.endsWith("\"")||val.isBlank()) 
                {
                    
                    result = "Semantically Correct!";
                              
                }else {
                    
                    result = "Semantically Incorrect!";
                    
                }
      
            }else {                      
                
                result = "Semantically Incorrect!";
            }         
            
        }else if(input.startsWith("int")&&input.endsWith(";")) 
        {                   
           
            if(input.length()>=2&&input.contains("=")) 
            {
                                                         
                String val = input.substring(input.indexOf("=")).replaceAll("[=;]", "");
           
                Scanner scan = new Scanner(val);
 
           
                if(scan.hasNextInt()) 
                {
                    result = "Semantically Correct!";
                }else 
                {
                    result = "Semantically Incorrect!";
                }         
        
            }else if(!input.contains("=")) 
            {    
                result = "Semantically Correct!";
   
            }else {
                
                result = "Semantically Incorrect!";
                
            }
        }else if(input.contains("double")&&input.endsWith(";")) {
            
            if(input.length()>=2&&input.contains("=")) {
                
                String val = input.substring(input.indexOf("=")).replaceAll("[=;]", "");
           
                Scanner scan = new Scanner(val);      
           
                if(scan.hasNextDouble()) {
                
          
                    result = "Semantically Correct!";
           
      
                }else {
                
        
                    result = "Semantically Incorrect!";
        
                }         
        
            }else if(!input.contains("=")) {
                
                result = "Semantically Correct!";
                
            }else {
                
                result = "Semantically Incorrect!";
                
            }
        }else if(input.contains("char")&&input.endsWith(";")) 
        {
               
            String[] text = input.split(" ");
                    
            if(text.length > 1) 
            {
                
                String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                
                String ch = text[1].replaceAll("[;]", "");   
                
                if(!checker(ch, numbers) == true && ch.length()==1) 
                {
                    
                    result = "Semantically Correct!";
                    
                }else {
                    
                    result = "Semantically Incorrect!";
                }
                
            }else{
                
                result = "Semantically Incorrect!";
                                
            }
                
       }else{
           
           result = "Semantically Incorrect!";
                     
       }
        
        System.out.println(result);
        
           
    }    
    
    public static boolean checker(String value, String[] numbers) 
    {
        
        boolean found = false;
        
        for(int i =0; i<numbers.length;i++) 
        {       
            
            if(value.contains(numbers[i])) 
            {
                
                found = true;
                
                break;
            } 
            
        }
        
        return found;
    }

}
