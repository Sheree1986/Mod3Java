package OOPHW;

import java.util.*;
//import OOPHW.Person;
//import OOPHW.Person1;
//import OOPHW.Employee;
//import OOPHW.Student;
//import OOPHW.PersonInterface;



public class Starter {



public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	
		System.out.println("Enter name:");
		String userName = scan.nextLine();

		System.out.println("Enter current address:");
		String userAddress = scan.nextLine();

		System.out.println("Enter your cellphone number:");
		String userPhone = scan.nextLine();
		System.out.println("Enter the name of the department you work in:");
		String userDepartment = scan.nextLine();
		
		System.out.println("Enter your class year (Freshmen, Sophomore, Junior or Senior):");
		String userGrade = scan.nextLine();
	
		
		System.out.println("Enter your employee ID number:");
		int userjobId = scan.nextInt();
		
		
	
		System.out.println("Enter your salary:");
		long userSalary = scan.nextLong();

	
	

	
		System.out.println("Enter the grade received in CSS: ");
		double userCss= scan.nextInt();
		System.out.println("Enter the grade received in JavaScript: ");
		double userJavascript = scan.nextInt();
		System.out.println("Enter the grade received in Java: ");
		double userJava = scan.nextInt();
		
		
		
		scan.close();
		
		
		Employee emp1 = new Employee(userName, userAddress, userPhone, userjobId, userDepartment, userSalary);
		emp1.display();

	
		Student stu1 = new Student(userName, userAddress, userPhone, userGrade, userCss, userJavascript, userJava);
		stu1.display();
		
	
		
		Person1 p1 = new Person1();

		p1.setName(userName);
		p1.setAddress(userAddress);
		p1.setPhone(userPhone);

		p1.display();

	}

}