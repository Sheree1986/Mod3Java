package OOPHW;

public class Student extends Person implements PersonInterface {
//assigning that class 



		static String school = "Per Scholas";
		String grade;
		double css, javascript, java;
	    int number;

		Student(String name, String address, String phone, String grade, double css, double javascript,
				double java, int number) {
			
			super(name, address, phone);
			this.grade = grade;
			this.css = css;
			this.javascript = javascript;
			this.java = java;
			this.number = number;
			
		}

		
	

		   public void display() {
			System.out.println("********************");
			System.out.println(ORGINIZATION);
			System.out.println("Name of the school the student atttends: " + school);
			System.out.println("Student's name: " + this.name);
			System.out.println("Student's address: " + this.address);
			System.out.println("Student's phone number: " + this.phone);
			System.out.println("The student is currently a : " + this.grade);
			System.out.println("The average of the three subjects is: " + calculate(3));
			System.out.println("number of donuts you ate today out of a dozen: " + compute(1, 12));
			System.out.println();

		}
			public double calculate(int average) {
				double sum = this.css + this.javascript + this.java;
				return sum / average;

			}

	    public int compute(int n1, int n2) {
	    int amount = 12 - this.number;
	    return amount;
	    }
		}
