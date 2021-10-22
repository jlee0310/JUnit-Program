//Author Name: Jiwon Lee

//Date: Sep 19, 2021

//Course ID: CS320 T1021

package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.model.Contact;

class ContactTest {

	@Test
	void testContact() {
		//given
		Contact contact = new Contact("abcd1234", "Jiwon", "Lee", "1112221234", "1234 E Road" );
		assertTrue(contact.getContactID().equals("abcd1234"));
		assertTrue(contact.getFirstName().equals("Jiwon"));
		assertTrue(contact.getLastName().equals("Lee"));
		assertTrue(contact.getPhone().equals("1112221234"));
		assertTrue(contact.getAddress().equals("1234 E Road"));
	}
	
	// TEST GET FIRST NAME
	@Test
	public void test_getFirstName() {
		Contact contact = new Contact("abcd1234", "Jiwon", "Lee", "1112221234", "1234 E Road" );
		assertTrue(contact.getFirstName().equals("Jiwon"));
	}

	// TEST CONTACT ID
	@Test
	public void test_ContactID_isNot_Null() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Jiwon", "Lee", "11122212345", "1234 E Road");
		});
	}
	
	@Test
	public void test_ContactID_isNot_moreThan10() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "Jiwon", "Lee", "11122212345", "1234 E Road");
		});
	}
	
	// TEST FIRST NAME
	@Test
	public void test_firstName_isNot_Null() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("abcd1234", null, "Lee", "11122212345", "1234 E Road");
		});
	}
	
	@Test
	public void test_firstName_isNot_moreThan10() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("abcd1234", "JiwonJiwonJiwon", "Lee", "11122212345", "1234 E Road");
		});
	}
	
	// TEST LAST NAME
	@Test
	public void test_lastName_isNot_Null() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("abcd1234", "Jiwon", null, "11122212345", "1234 E Road");
		});
	}
	
	@Test
	public void test_lastName_isNot_moreThan10() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("abcd1234", "Jiwon", "LeeLeeLeeLee", "11122212345", "1234 E Road");
		});
	}
	
	// TEST PHONE NUMBER
	@Test
	public void test_phone_isNot_Null() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("abcd1234", "Jiwon", "Lee", null, "1234 E Road");
		});
	}
	
	@Test
	public void test_phone_isNot_moreThan10() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("abcd1234", "Jiwon", "Lee", "1112221234512345", "1234 E Road");
		});
	}
	
	// TEST ADDRESS
	@Test
	public void test_address_isNot_Null() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("abcd1234", "Jiwon", "Lee", "1112221234", null);
		});
	}
	
	@Test
	public void test_address_isNot_moreThan30() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("abcd1234", "Jiwon", "Lee", "1112221234", "1234 E Road 1234 E Road 1234 E Road");
		});
	}

} //End
