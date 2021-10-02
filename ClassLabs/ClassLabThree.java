import java.util.Scanner;

public class ClassLabThree {

	
	public static void main(String[] args) {
		int inum;
		float fnum;
		double dnum;
		long lnum;
		boolean choice;
		String str;
		String address;
		// declare the new scanner as a class -> System.in
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello");
		
		// different methods for accepting inputs
		System.out.println("Enter an integer: ");
		inum = scan.nextInt();
		lnum = scan.nextLong();
		fnum = scan.nextFloat();
		dnum = scan.nextDouble();
		choice = scan.nextBoolean();
		
		// only takes first word, it will stop after the space bar is entered
		str = scan.next();
		// enter this so that the next nextLine will actually read something
		scan.nextLine();
		// takes a sentence
		address= scan.nextLine();
		
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(choice);
		System.out.println(str);
		System.out.println(address);
		
		// close scanner when done
		scan.close();
		
	}
}