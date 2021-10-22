//Author Name: Jiwon Lee

//Date: Sep 27, 2021

//Course ID: CS320 T1021

package com.apptService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {
	public ArrayList<Appointment> apptList = new ArrayList<Appointment>();
	
	
	
	//GET APPOINTMENT
	public Appointment getAppt(String apptID) throws ParseException {
		Appointment appt = new Appointment(null, null, null);
		for(int i = 0; i < getApptList().size(); i++) {
			if(getApptList().get(i).getApptID().contentEquals(apptID)) {
				appt = getApptList().get(i);
			} else {
				System.out.println("Appoinment doesn't exist.");
			}
		}
		return appt;
	}
	
	//MAKE APPOINTMENT AND
	//ADD TO APPOINTMENT LIST
	public void addAppt(String apptID, String description, String date) throws ParseException {
		Appointment appt = new Appointment(apptID, description, date);
		//AppointmentService service = new AppointmentService();
		getApptList().add(appt);
	}
	
	//DELETE APPOINTMENT
	public void deleteAppt(String apptID) {
		for(int i = 0; i < getApptList().size(); i++) {
			if(getApptList().get(i).getApptID().equals(apptID)) {
				getApptList().remove(i);
				break;
			}
		}
	}

	public ArrayList<Appointment> getApptList() {
		return apptList;
	}


}
