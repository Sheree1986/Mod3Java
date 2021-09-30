
public class LabTwo {

	public static void main(String[] args) {
		
					//        For loops
//
// 1. Write a for loop that runs 10 times and print the value of the controlling variable all on the same line

		int count = 1;
		while (count <= 10) {
		System.out.print(count);
	
		count = count + 1;
	
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();

	}
// 2. Write a for loop that iterates between 1 and 10, but counts by 2. Inside the loop, print your name on different lines 
		
		
		String str = "name"; 
		for (int i = 1; i < 11; i+=2 )
		{
			System.out.println(str);
		}

		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();		
}
//// 3. Write a for loop to print asterisk (*) 15 times on the same line
//
		char star = '*';
		for (int i = 1; i < 16; i++)
		{
			System.out.print(star);
		
		}
		System.out.println();
		System.out.println("---------------------------------------------");
	
	
	}}
		
	
// 4. Write a for loop for the given output:
//     1, 3, 5, 7, 9
//     2, 4, 6, 8, 10

		int last = 11;
		String odd = "";
		String even = "";
		for (int i = 1; i < last; i++)
		{	
			if (i % 2 == 0)
			{
				if (i < 10)
				{
					even += i + ", ";
				}
				else
				{
					even += i;
				}
			}
			else
			{
				odd += i + (i != last - 2? ", " : "");
			}	
		}

		System.out.println(odd);
		System.out.println(even);
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		
		System.out.println();
	}}
							//While loops
//
// 5. Use a while loop to add up the numbers 1 to 20 into one variable. Print out the sum at the end
//		
		int i   = 1;
		int sum = 0;
		while (i < 21) {
		  sum += i;
		  i++;
		 }
		  System.out.println(sum);
		
			System.out.println();
			System.out.println("---------------------------------------------");
			
			
			System.out.println();
	}}
// 6. Use a while loop to print out the even number from 1 to 20

			int number=20;  
		
			for (int i=1; i<=number; i++)   
			{  
		
			if (i%2==0)   
			{  
			System.out.print(i + " ");  
			System.out.println();
			}}}}
		
			
			
					//         Nested loops
//
// 1. Write a for loop to display the following outputs: 
//1                                             11111
//22                                           2222
//333                                         333
//4444                                       44
////55555                                     5
	
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
			System.out.print(i);
			}
			System.out.println();
			}
		System.out.println("---------------------------------------------");
	
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
			System.out.print(i);
			}
			System.out.println();
			}

		
			}
			
			}
			


	
// 2. Write a for loop that iterates from 1 - 20. Should print “prime” for all prime numbers.
			
			int i =0;
			       int num =0;
			       //Empty String
			       String  primeNumbers = "";

			       for (i = 1; i <= 20; i++)         
			       { 		  	  
			          int counter=0; 	  
			          for(num =i; num>=1; num--)
				  {
			             if(i%num==0)
				     {
			 		counter = counter + 1;
				     }
				  }
				  if (counter ==2)
				  {
				    
				     primeNumbers = primeNumbers + i + " ";
				  }	
			       }	
			       System.out.println("Prime numbers from 1 to 20 are :");
			       System.out.println(primeNumbers);
}
}




    

