package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.model.Task;

class TaskTest {

	@Test
	void testTask() {
		Task task = new Task("abc1234", "Jiwon", "The task service uses in-memory data structures.");
		assertTrue(task.getTaskID().equals("abc1234"));
		assertTrue(task.getName().equals("Jiwon"));
		assertTrue(task.getDescription().equals("The task service uses in-memory data structures."));	
	}
	
	@Test
	// I created a new task object with a ID that is longer than 10 characters
	void testTaskIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("abc12345678", "Jiwon", "The task service uses in-memory data structures to support storing tasks.");
		});
		
	}
	
	@Test
	// I created a new task object with a name that is longer than 20 characters
	void testNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("abc1234", "Jiwon Leeeeeeeeeeeeee", "he task service uses in-memory data structures to support storing tasks.");
		});
	}
	
	@Test
	// I created a new task object with a description that is longer than 50 characters
	void testDescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("abc1234", "Jiwon", "he task service uses in-memory data structures to support storing tasks. he task service uses in-memory data structures to support storing tasks.he task service uses in-memory data structures to support storing tasks.");
		});
	}

}
