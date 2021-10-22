//Author Name: Jiwon Lee

//Date: Sep 19, 2021

//Course ID: CS320 T1021

package main.java.model;

public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//CONSTRUCTOR
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID input");
		}
		
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name input");
		}
		
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name input");
		}
		
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone input");
		}
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address input");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	
	} // END OF CONSTRUCTOR
	
	//SETTERS
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
		
	//GETTERS
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
} // end of Contact class
