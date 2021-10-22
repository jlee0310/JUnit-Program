//Author Name: Jiwon Lee

//Date: Sep 19, 2021

//Course ID: CS320 T1021

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.model.Contact;
import main.java.model.ContactService;

class ContactServiceTest {

	@Test
	void testAddContacts() {
		Contact contact = new Contact("abcd1234", "Jiwon", "Lee", "1112221234", "1234 E Road" );
		ContactService service = new ContactService();
		service.addContacts("abcd1234", "Jiwon", "Lee", "1112221234", "1234 E Road" );
		
	}
	
	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContacts("abcd1234", "Jiwon", "Lee", "1112221234", "1234 E Road" );
		service.updateFirstName("Brynn", "abcd1234");
		
	}
	
	@Test
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContacts("abcd1234", "Jiwon", "Lee", "1112221234", "1234 E Road" );
		service.updateLastName("Hendrix", "abcd1234");
	}
	
	@Test
	void testUpdatePhone() {
		ContactService service = new ContactService();
		service.addContacts("abcd1234", "Jiwon", "Lee", "1112221234", "1234 E Road" );
		service.updatePhone("1111111111", "abcd1234");
	}
	
	@Test
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContacts("abcd1234", "Jiwon", "Lee", "1112221234", "1234 E Road" );
		service.updateAddress("5678 W Road", "abcd1234");
	}

} //End

