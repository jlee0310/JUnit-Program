//Author Name: Jiwon Lee

//Date: Sep 19, 2021

//Course ID: CS320 T1021

package main.java.model;

import java.util.ArrayList;

public class TaskService {
	public ArrayList<Task> taskList = new ArrayList<Task>();
	
	
	//Add tasks with a unique ID
	public void addTask(String id, String name, String description) {
		Task task = new Task(id, name, description);
		taskList.add(task);
	}
	
	//Delete task.
	public void deleteTask(String id) {
		for(int i = 0; i < taskList.size(); i++) {
			if(taskList.get(i).getTaskID().equals(id)) {
				taskList.remove(i);
				break;
			}
			if(i == taskList.size()-1) {
				System.out.println("Task ID: " + id + " not found.");
			}
		}
	}
	
	//Update Name
	public void updateName(String newName, String id) {
		for(int i = 0; i < taskList.size(); i++) {
			if(taskList.get(i).getTaskID().equals(id)) {
				taskList.get(i).setName(newName);
				break;
			}
			if(i == taskList.size()-1) {
				System.out.println("Task ID: " + id + " not found.");
			}
		}
	}
	
	//Update Description
	public void updateDescription(String newDescription, String id) {
		for(int i = 0; i < taskList.size(); i++) {
			if(taskList.get(i).getDescription().equals(id)) {
				taskList.get(i).setDescription(newDescription);
				break;
			}
			
		}
	}
	

} // END
