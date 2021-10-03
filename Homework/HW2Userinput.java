
import java.util.Scanner;

public class HW2Userinput {

	public static void main(String[] args) {
		
	
//		1. Write Fibonnaci series between the user entered start and end values
	  
	    int n, first = 0,next = 1;
        System.out.println("Enter a number between 1 and 20");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);
        for (int i = 1; i<=n-2; ++i)
        {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
        }
}

}
		

// 2. Determine whether a user entered number is an Armstrong number
//			/*An Armstrong number is a number such that the sum of its digits raised to the third power is equal to the number itself.
//			 * For example, 371 is an Armstrong number, since 3*3*3 + 7*7*7 + 1*1*1 = 371 */
		   int number = 9;
		      int check, rem, sum = 0;
		      System.out.println("Please input a number:");
		      Scanner sc = new Scanner(System.in);
		      number = sc.nextInt();
		      check = number;
		      while(check != 0) {
		         rem = check % 10;
		         sum = sum + (rem * rem * rem);
		         check = check / 10;
		      }
		      if(sum == number)
		         System.out.println("This number is an armstrong number.");
		      else
		         System.out.println("This number is not an armstrong number.");
		   }
		}
//3. Write a program to see if a user entered string is a palindrome or not

String str, rev = "";
Scanner sc = new Scanner(System.in);

System.out.println("Enter a string:");
str = sc.nextLine();

int length = str.length();

for ( int i = length - 1; i >= 0; i-- )
   rev = rev + str.charAt(i);

if (str.equals(rev))
   System.out.println(str+" is a palindrome");
else
   System.out.println(str+" is not a palindrome");

}
}

