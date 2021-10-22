# JUnit-Program
software testing, automation, and quality assurance

I ensured that my code, program, or software is functional and secure by embedding test codes for each function in every module. I adapted user requirements that described any function, constraint, or other property that must be provided to satisfy the user needs and incorporate them into a program. and based on this, I designed the software the user wanted. theya are used in-memory data structures to support storing contacts (no database required). 
 In addition, there was no UI for this assignment. You verified the contact service through JUnit tests. 
The contact service contained a contact object along with the contact service. The requirements were as follows:
    

1. Contact Service
  
    a. Contact Class Requirements   
       i.	The contact object shall have a required unique contact ID String that cannot be longer than 10                characters. The contact ID shall not be null and shall not be updatable.
       
       ii. The contact object shall have a required firstName String field that cannot be longer than 10                  characters. The firstName field shall not be null.
       
       iii.	The contact object shall have a required lastName String field that cannot be longer than 10                  characters. The lastName field shall not be null.
       
       iv.	The contact object shall have a required phone String field that must be exactly 10 digits. The phone        field shall not be null.
       
       v.	The contact object shall have a required address field that must be no longer than 30 characters. The          address field shall not be null.
    
    b.	Contact Service Requirements
       i.	The contact service shall be able to add contacts with unique ID.
       
       ii.	The contact service shall be able to delete contacts per contactId.
       
       iii.	The contact service shall be able to update contact fields per contactId. The following fields are            updatable:
          1.	firstName
          2.	lastName
          3.	PhoneNumber
          4.	Address

2. Task Service
  
  a.	Task Requirements
    i.	The task object shall have a required unique task ID String that cannot be longer than 10 characters. The     task ID shall not be null and shall not be updatable.
    
    ii.	The task object shall have a required name String field that cannot be longer than 20 characters. The name     field shall not be null.
    
    iii.	The task object shall have a required description String field that cannot be longer than 50 characters.     The description field shall not be null.
    
  b.	Task Service Requirements
    i.	The task service shall be able to add tasks with a unique ID.
    
    ii.	The task service shall be able to delete tasks per taskId.
    
    iii.	The task service shall be able to update task fields per taskId. The following fields are updatable:
     1.	name
     2.	description
     
3. Appointment Service

  a.	Appointment Requirements
    i.	The appointment object shall have a required unique appointment ID String that cannot be longer than 10       characters. The appointment ID shall not be null and shall not be updatable.
    
    ii.	The appointment object shall have a required appointment Date field. The appointmentDate field cannot be        in the past. The appointmentDate field shall not be null. Note: Use java.util.Date for the appointmentDate        field and use before(new Date()) to check if the date is in the past.
    
    iii.	The appointment object shall have a required description String field that cannot be longer than 50           characters. The description field shall not be null.
    
  b.	Appointment Service Requirements
    i.	The appointment service shall be able to add appointments with a unique appointmentId.
    
    ii.	The appointment service shall be able to delete appointments per appointmentId.









