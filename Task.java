//Author Name: Jiwon Lee

//Date: Sep 24, 2021

//Course ID: CS320 T1021

package main.java.model;

public class Task {
	private String taskID;
	private String name;
	private String description;
	
	//constructor
	public Task(String taskID, String name, String description) {
		if(taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID input");
		}
		
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid First Name input");
		}
		
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Last Name input");
		}
		
		this.taskID = taskID;
		this.name = name;
		this.description = description;
		
	}//end of constructor
	
	//setters

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	//getters
	public String getTaskID() {
		return taskID;
	}
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

}
