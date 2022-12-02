package Activities;

import java.util.*;

public class Tokenizer {

	public static void main(String[] args) 
	{
		String sourceLanguage;  
		int n = 5;
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter Source Language: ");   
		sourceLanguage = sc.nextLine();
		
		System.out.println("Output is: ");
		
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{    
			array[i]=sc.nextInt();  
		}  
		
		System.out.println("Array elements are: ");   
		for (int i=0; i<n; i++)   
		{  
			System.out.print(array[i] + " ");  
		}  	
		
	}
	
	public static void dataType()
	{

	}
	public static void assignOperator()
	{
		
	}
	public static void delimiter()
	{
		
	}
	public static void value()
	{
		
	}
	public static void identifier()
	{
		
	}

}
