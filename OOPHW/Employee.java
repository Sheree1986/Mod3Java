package OOPHW;


public class Employee extends Person {

	


	static String company = "Per Scholar";
	
	int jobId;
	String department;
	long salary;

	Employee(String name, String address, String phone, int jobId, String department, long salary) {
		super(name, address, phone);
		this.jobId = jobId;
		this.department = department;
		this.salary = salary;
	}

	void display() {
		System.out.println();
		System.out.println("***********");
		System.out.println("Company Name: " + company);
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Phone: " + this.phone);
		System.out.println("Job ID Number is: " + this.jobId);
		System.out.println("department: " + this.department);
		System.out.println("Salary: " + this.salary);
		System.out.println();

	}

}