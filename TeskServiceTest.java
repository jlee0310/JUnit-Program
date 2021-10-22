package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import main.java.model.Task;
import main.java.model.TaskService;

class TeskServiceTest {

	@Test
	void testAddTask() {
		Task task = new Task("abcd123", "Jiwon", "The task service uses in-memory data structures.");
		TaskService service = new TaskService(); 
		service.addTask("abcd123", "Jiwon", "The task service uses in-memory data structures.");
	}
	
	@Test
	void testDeleteTask() {
		TaskService service = new TaskService();
		service.addTask("abcd123", "Jiwon", "The task service uses in-memory data structures.");
		service.deleteTask("abcd123");
		ArrayList<Task> taskListEmpty = new ArrayList<Task>();
		assertEquals(service.taskList, taskListEmpty, "The task was not deleted.");
	}
	
	@Test
	void testUpdateName() {
		TaskService service = new TaskService();
		service.addTask("abcd123", "Jiwon", "The task service uses in-memory data structures.");
		service.updateName("Brynn","abcd123");
	}
	
	@Test
	void testUpdateDescription() {
		TaskService service = new TaskService();
		service.addTask("abcd123", "Jiwon", "The task service uses in-memory data structures.");
		service.updateDescription("This is new description.", "abcd123");
		
	}

}
