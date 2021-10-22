//Author Name: Jiwon Lee

//Date: Sep 27, 2021

//Course ID: CS320 T1021

package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.apptService.Appointment;

class AppointmentTest {

	@Test
	void testAppointment() throws ParseException {
		Appointment appt = new Appointment("abc1234", "hair", "31-Dec-2021");
		assertTrue(appt.getApptID().equals("abc1234"));
		assertTrue(appt.getDescription().equals("hair"));
		//assertTrue(appt.getAppointmentDate().equals("31-Dec-2021"));
	}
	
	@Test
	void testApptIDMoreThan10Char() throws ParseException {
		Appointment appt = new Appointment("abc1234", "hair", "31-Dec-2021");
		if(appt.getApptID().length() > 10) {
			fail("Appointment ID is more than 10 characters.");
		}	
	}
	
	@Test
	void testApptID_isNot_Null() throws ParseException {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, "hair", "31-Dec-2021");
		});
	}
	
	@Test
	void testDescriptionMoreThan50Char() throws ParseException {
		Appointment appt = new Appointment("abc1234", "hair", "31-Dec-2021");
		if(appt.getDescription().length() > 50) {
			fail("Description is more than 50 characters.");
		}
	}
	
	@Test
	void testDescription_isNot_Null() throws ParseException {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("abc1234", null, "31-Dec-2021");
		});
	}
	
	@Test
	void testDateBeforeNow() throws ParseException {
		Appointment appt = new Appointment("abc1234", "hair", "31-Dec-2021"); 
		Date now = new Date();
		if(appt.getAppointmentDate().before(now)) {
			fail("Appointment date is in the past.");
		}
	}
	
	@Test
	void testSetApptID() throws ParseException {
		Appointment appt = new Appointment("abc1234", "hair", "31-Dec-2021");
		Appointment instance = appt;
		assertTrue(instance.getApptID() == appt.getApptID());
	}
	
	

}//End
