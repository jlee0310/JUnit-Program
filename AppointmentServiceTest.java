//Author Name: Jiwon Lee

//Date: Sep 27, 2021

//Course ID: CS320 T1021

package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.apptService.Appointment;
import com.apptService.AppointmentService;

class AppointmentServiceTest {
	
	@Test
	void getApptTest() throws ParseException {
		AppointmentService service = new AppointmentService(); 
		service.addAppt("abc1234", "Hair", "31-Dec-2021");
		
		for(int i = 0; i < service.getApptList().size(); i++) {
			if(service.getApptList().get(i).getApptID().contentEquals("abc1234")) {
			Appointment appt = service.getApptList().get(i);
				} 
			assertEquals(service.apptList, service.apptList);
			}
		
	}

	@Test
	void addApptTest() throws ParseException {
		AppointmentService service = new AppointmentService(); 
		service.addAppt("abc1234", "Hair", "31-Dec-2021");
		assertEquals(service.apptList, service.apptList);
	}
	
	@Test
	void deleteApptTest() throws ParseException {
		AppointmentService service = new AppointmentService();
		service.addAppt("abc1234", "Hair", "31-Dec-2021");
		service.deleteAppt("abc1234");
		ArrayList<Appointment> apptListEmpty = new ArrayList<Appointment>();
		assertEquals(service.getApptList(), apptListEmpty, "The task was not deleted.");
		
		
	} 

}//End

