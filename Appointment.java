//Author Name: Jiwon Lee

//Date: Sep 27, 2021

//Course ID: CS320 T1021

package com.apptService;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Appointment {
	private String apptID;
	private String description;
	private String date;
	private Date appointmentDate;
	
	//CONSTRUCTOR
	public Appointment(String apptID, String description, String date) throws ParseException {
		if (apptID == null || apptID.length() > 10) {
			throw new IllegalArgumentException("Invalid Appointment ID input");
		}
		
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description input");
		}
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		Date apptDate = formatter.parse(date); 
		Date now = new Date();
		if (date == null || apptDate.before(now)) {
			throw new IllegalArgumentException("Invalid Appointment Date. The appointment date cannot be in the past.");
		}
		
		this.apptID = apptID;
		this.description = description;
		this.appointmentDate = apptDate;
	}

	//SETTERS and GETTERS
	public String getApptID() {
		return apptID;
	}

	public String getDescription() {
		return description;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	//DISPLAY
	/*public void displayAppt() {
		System.out.println("ID: " + getApptID() + " Description: " + getDescription() + " Date: " + getAppointmentDate());
	}
	*/
	
} // End of class
