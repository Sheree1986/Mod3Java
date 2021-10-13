package OOPHW;


public class Employee extends Person implements PersonInterface{

	int jobId;
	int bonus;
	int validation;
	String department;
	double salary;
	

	Employee(String name, String address, String phone, int jobId, int bonus, int validation, String department, double salary) 
	{
		
		super(name, address, phone);
		
		this.jobId = jobId;
		this.department = department;
		this.bonus = bonus;
		this.validation = validation;
		this.salary = salary;
	}

	public void display() {
		System.out.println(ORGINIZATION);
		System.out.println("***********");
		System.out.println("Student's name: " + this.name);
		System.out.println("Student's address: " + this.address);
		System.out.println("Student's phone number: " + this.phone);
		System.out.println("Job ID Number is: " + this.jobId);
		System.out.println("department: " + this.department);
		System.out.println("Total Salary: " + this.salary + this.bonus);
		System.out.println("Validation: " + this.jobId + this.validation);
		System.out.println();

	}
public double calculate(int bonus) {
	double netsalary = bonus + this.salary;
			return netsalary;
}
public int compute(int n1, int n2) {
    int validationSticker = this.jobId + 2021;
    return validationSticker;
    //each semester employees must have their ID cards validated.
}  
}
