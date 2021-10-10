package OOPHW;

public class Student extends Person implements PersonInterface {




		static String school = "Per Scholas";
		String grade;
		double css, javascript, java;

		Student(String name, String address, String phone, String grade, double css, double javascript,
				double java) {
			super(name, address, phone);
			this.grade = grade;
			this.css = css;
			this.javascript = javascript;
			this.java = java;
		}

		
		double calculate() {
			double sum = this.css + this.javascript + this.java;
			return sum / 3;

		}

		@Override public void display() {
			System.out.println("********************");
			System.out.println("Name of the school the student atttends: " + school);
			System.out.println("Student's name: " + this.name);
			System.out.println("Student's address: " + this.address);
			System.out.println("Student's phone number: " + this.phone);
			System.out.println("The student is currently a : " + this.grade);
			System.out.println("The average of the three subjects is: " + calculate());
			System.out.println();

		}


		@Override
		public double calculate(int value) {
			// TODO Auto-generated method stub
			return 0;
		}
	}