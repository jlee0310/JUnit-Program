//Author Name: Jiwon Lee

//Date: Sep 19, 2021

//Course ID: CS320 T1021


package main.java.model;

import java.util.ArrayList;

public class ContactService {
	private static int uniqueID = 1;
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	//constructor
	public ContactService() {
		uniqueID++;
	}
	
	//add new contacts
	public void addContacts(String contactID, String firstName, String lastName, String phone, String address) {
		Contact contact = new Contact(contactID, firstName, lastName, phone, address);
		contactList.add(contact);
	}
	
	//delete contacts with id
	public void deleteContacts(String id) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(id)) {
				contactList.remove(i);
			}
		}
	}
	
	//update first Name
	public void updateFirstName(String newFirstName, String id) {
		for(int i = 0; i<contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(id)) {
				contactList.get(i).setFirstName(newFirstName);
			}
		}
	}
	
	//update last Name
	public void updateLastName(String newLastName, String id) {
		for(int i = 0; i<contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(id)) {
				contactList.get(i).setLastName(newLastName);
			}
		}
	}
	
	//update Phone
	public void updatePhone(String newPhone, String id) {
		for(int i = 0; i<contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(id)) {
				contactList.get(i).setPhone(newPhone);
				}
			}
		}
		
	//update Address
	public void updateAddress(String newAddress, String id) {
		for(int i = 0; i<contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(id)) {
				contactList.get(i).setAddress(newAddress);
				}
			}
		}
	
	
} // End of class