package GettersSetters;


public class Computer_info {
	
	public static void main(String[] args) {
//		 Getters & Setters Methods: 
//
//
//
//- Create a Computer class that has 3 variables. The first variable will have a name. The second variable will be the year of the computer. 
//		Last variable will be the cost of the computer.
//
//- All 3 variables should be private instance variables and must use getters to retrieve the data and setters to set the variables.
		Computer c1 = new Computer();
		c1.setCname("dell");
		c1.setCyear(2021);
		c1.setCcost(1800.99);
		System.out.println("Computer "+ c1.getCname());
		System.out.println("Computer "+ c1.getCyear());
		System.out.println("Computer "+ c1.getCcost());

		

	}



	}


