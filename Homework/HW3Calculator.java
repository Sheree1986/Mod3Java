

	
	import java.util.*;
	public class HW3Calculator {
	    public static void main(String[] args)
	    {
	        System.out.println("Please enter two numbers in to the calculator:");
	        Scanner userInput = new Scanner(System.in);
	        int num1,num2;
	        num1 = userInput.nextInt();
	        num2 = userInput.nextInt();
	       int ans;
	        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
	        int choose;
	        choose = userInput.nextInt();
	        switch (choose){
	        case 1:
	            System.out.println(add( num1,num2));
	            break;
	        case 2:
	            System.out.println(sub( num1,num2));
	            break;      
	        case 3:
	            System.out.println(mult( num1,num2));
	            break;
	        case 4:
	            System.out.println(div( num1,num2));
	            break;
	            default:
	                System.out.println("invalid entry");
 
	        }

userInput.close();
	    }
	    public static int add(int x, int y)
	    {
	        int result = x + y;
	        return result;
	    }
	    public static int sub(int x, int y)
	    {
	        int result = x-y;
	        return result;
	    }
	    public static int mult(int x, int y)
	    {
	        int result = x*y;
	        return result;
	    }
	    public static int div(int x, int y)
	    {
	        int result = x/y;
	        return result;
	        
	   
	    }

	}
