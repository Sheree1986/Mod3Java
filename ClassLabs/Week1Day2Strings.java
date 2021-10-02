          //Practice string related tasks:
import java.util.*;
public class Week1Day2Strings {

	  public static void main(String[] args) 
	  {    
//1. Write a Java program to display the total numbers of characters in a user entered String
	        Scanner sc = new Scanner(System.in);    
	        int count = 0,i=0;    
	        System.out.println("Please enter a sentence. This program will count the numbers of characters you enter =  ");
			String str = sc.nextLine();
	
			do 
			{
	           if(str.charAt(i)!=' ')
	           {
	             
	              count++;
	           }
	            i++;
	        }while(i<str.length());
	  
	        System.out.print("The total number of characters you typed is :"+count);
	    }      
	}
		  
//2. Using a while loop, print each character of the string ‘Hello World’
		  
		   String pharse = "Hello World";

		    System.out.println("Characters in " + pharse + " are:");

		    // loop through each element
		    for(int i = 0; i<pharse.length(); i++) {

	
		      char output = pharse.charAt(i);
		      System.out.print(output + ", ");
		    }
		  
		} }
	  
		  
//3. Take two strings form the user and compare if they're equal or not. Display a message saying the strings are equal or not equal
   
		  Scanner compare = new Scanner(System.in);
			       
			        String input1 = compare.nextLine();
			        System.out.println("Please enter your, first input :"
			                           + input1);
			  
			        
			        String input2 =compare.nextLine();
			        System.out.println("Second input :"
			                           + input2);
			  
			      
			        System.out.println("Are both inputs the same? : ");
		  
			        if (input1.equals(input2) == true) {
			            System.out.println("Yes");
			        }
			        else {
			            System.out.println("No");
			        
			        
			            compare.close();
			    }
			}
}

//4. Print a given string in reverse order without using the reverse( ) method
		  
		  Scanner sc = new Scanner(System.in);  
		  System.out.print("Enter a string : ");  
		  String  s=sc.nextLine();      
		  System.out.println("Reverse String  is : "+reverse(s));
		  }  
	 
		  static String reverse(String str)  
		  {  
		  String rev="";  
		  for(int i=str.length();i>0;--i)  
		  {  
		  rev=rev+(str.charAt(i-1));   
		  }  
		  return rev;  
		
		  
		  }  

}
//5. Print the total number of consonants and vowels in a given string
		  
		  
		Counter variable to store the count of vowels and consonant    
	        int vow = 0, con = 0;    
	            
	        //Declare a string    
	        String str = "Testing out the counting of count dracula";    
	            
	        //Converting entire string to lower case to reduce the comparisons    
	        str = str.toLowerCase();    
	            
	        for(int i = 0; i < str.length(); i++) {    
	            //Checks whether a character is a vowel    
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                //Increments the vowel counter    
	                vow++;    
	            }    
	            //Checks whether a character is a consonant    
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	                //Increments the consonant counter    
	                con++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + vow);    
	        System.out.println("Number of consonants: " + con);    
	    }    
	}   