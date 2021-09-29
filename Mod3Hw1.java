//
//1. Write an if/else statement for the following requirements:
//If student gets 90 or higher: console log  A
//If students get 80 or above: console log B
//If students get 70 or above: console log C
//If students get 55 or above: console log D
//Any grade lower than 55 is F
package MyPackage;

public class Mod3Hw1 {


   public static void main(String[] args)
   {
   
    	        int score = 82;
    	        char grade;

    	        if (score >= 90) {
    	            grade = 'A';
    	        } else if (score >= 80) {
    	            grade = 'B';
    	        } else if (score >= 70) {
    	            grade = 'C';
    	        } else if (score >= 60) {
    	            grade = 'D';
    	        } else {
    	            grade = 'F';
    	        }
    	        System.out.println(grade);
    	    
   

    	

//2. Using switch case, do the following:
//Store a number between 1-7
//If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
//Anything other than 1-7 would default to "Invalid Input"
   
  
   int day = 2;
   
   switch(day)
	
	{
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	default:
		System.out.println("Invalid Input");
	
	}
   

//3.  Store a number in a variable called num and write an if statement: 
//	   If num is odd, display "Cool"
//	   If num is even and between 2-5, display "Not Cool"
//	   If num is even and between 6-20, display "Cool"
//	   If num is even and greater than 20, display "Not Cool

	int randomNumber = (int)(Math.random() * 11);
	System.out.println(randomNumber);
	if(randomNumber % 2 == 0) {
		if(randomNumber >= 2 && randomNumber <= 5) {
			System.out.println("Not Cool");
		}else if(randomNumber >= 6 && randomNumber <= 20) {
			System.out.println("Cool");
		}else {
			System.out.println("Not Cool");
		}
	}else {
		System.out.println("Cool");
	

}
}
}