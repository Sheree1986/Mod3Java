package OOPHW;


public class Person1 {


	private String name;
	private String address;
	private String phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
		
		void display() {
	
			System.out.println("*****************************");
			System.out.println("Name: " + this.name);
			System.out.println("Address: " + this.address);
			System.out.println("Phone: " + this.phone);
			System.out.println();

		}
	}