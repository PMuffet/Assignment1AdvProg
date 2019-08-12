
import java.util.*;

public class CityLodge {

	private ArrayList<Room> rooms = new ArrayList<>();
	private StandardRoom standardroom;
	private Suite suite;
	private HiringRecord hiringrecord;

	// Constructor Overloading

	// Main Menu Switch

	/**
	 * 
	 */
	Scanner console = new Scanner(System.in);

	public void runApp() {
		System.out.println("****CITYLODGE SYSTEM MENU****\nAdd Standard Room:			1\nAdd Suite:			2"
				+ "\nRent Standard Room			3\nRent Suite:		4"
				+ "\nReturn Standard Room:		5\nReturn Suite:			6"
				+ "\nMaintenance:			7\nComplete Maintenance			8"
				+ "\nDisplay All Rooms			9");
		System.out.print("Enter your choice: ");

		switch (console.nextInt()) {
		case 1:
			System.out.println("Add Standard Room");
			addStandardRoom();
			break;
		case 2:
			System.out.println("Add Suite");
			addSuite();
			break;
		case 3:
			System.out.println("Rent Standard Room");
			rentStandardRoom();
			break;
		case 4:
			System.out.println("Rent Suite");
			rentSuite();
			break;
		case 5:
			System.out.println("Return Standard Room");
			returnStandardRoom();
			break;
		case 6:
			System.out.println("Return Suite");
			returnSuite();
			break;
		case 7:
			System.out.println("Maintenance");
			maintenance();
			break;
		case 8:
			System.out.println("Complete Maintenance");
			completeMaintenance();
			break;
		case 9:
			System.out.println("Display all Rooms");
			displayRoomList();
			break;
		default:
			System.err.println("Unrecognized option");
			runApp();
			// unrecognizedMenu();
			break;
		}

	}

	// Main Menu Methods

	public void addStandardRoom() {
//		User can enter all details of a new standard room as required in the assignment. 
//		Validate all user inputs. Room ID can be automatically generated or manually entered. 
//		ID must be unique. System should check for ID duplication. 
//		A new standard room is added successfully to the room collection in the CityLodge class.

	}

	public void addSuite() {

//		This criterion is linked to a learning outcome Add Suite
//		User can enter all details of a new suite as required in the assignment. 
//		No need to enter number of beds because it's always 6 as shown in the assignment specification.
//		Suite ID can be automatically generated or manually entered. ID must be unique. 
//		System should check for ID duplication. A new suite is added successfully to the room collection in the CityLodge class.		

	}

	public void rentStandardRoom() {

//		User can enter a room id and other relevant information to rent that room.
//		Your program should display an error message if ID is not correct. Validate all user inputs.
//		If a room is not available for rent, your program should display an appropriate error message. 
//		Standard Room rental rules are enforced as described in Assignment 1 specification.
//		
//			

	}

	public void rentSuite() {

//		User can enter a suite ID and other relevant information to rent that suite.
//		Your program should display an error message if ID is not correct. 
//		Validate all user inputs. If a suite is not available for rent, your program should display an appropriate message.
//		Suite rental rules are enforced as shown in the assignment specification. Customers will not be allowed to rent a
//		suite for a time period which exceeds the date on which maintenance operation must be done.	
//		
//			

	}

	public void returnStandardRoom() {

//		User can enter a room ID and other relevant information as shown in the assignment specification to return that room. 
//		Validate all user inputs (incorrect id, invalid or unreasonable actual return date) Program should display an appropriate 
//		message if a room cannot be returned. When the return operation is successful, program should display details of that room 
//		again (room status changes from Rented to Available). Latest rental record should be updated and displayed. 
//		Late fee calculated correctly according to the rules shown in the assignment specification.

	}

	public void returnSuite() {

//		User can enter a suite ID and other relevant information (actual return date) to return that suite. 
//		Validate all user inputs (incorrect id, invalid or unreasonable actual return date). 
//		Program should display an appropriate message if a suite cannot be returned. 
//		When the return operation is successful, program should display details of that suite again 
//		(suite status changes from Rented to Available) Latest rental record should be updated and displayed.
//		Late fee calculated correctly according to the rules shown in the assignment specification.	
//	
//		

	}

	public void maintenance() {

//		User can enter a room or suite id to perform maintenance of the corresponding room or suite. 
//		Your program should display an error message if the given ID is not correct or the corresponding room 
//		is currently rented or is already under maintenance. If the operation is successful, the status of the 
//		given room should be changed from Available to Maintenance.	

	}

	public void completeMaintenance() {

//		User can enter an id of a room or suite to complete maintenance of the corresponding room or suite. 
//		Your program should display an error message if the given ID is not correct or the corresponding room
//		is not under maintenance. If the room is a suite, then the user should be asked to specify a 
//		maintenance completion date. If the operation is successful, the status of the given room should be 
//		changed from Maintenance to Available and the maintenance completion date should be recorded if the room is a suite.

	}

	public void displayRoomList() {
		System.out.println("displayroommenu test");

//		When the user selects this option, details of all rooms and their corresponding rental records should be displayed.
//		Room details must be displayed in a format as shown in the assignment specification. 
//		Rental records must be displayed in a format as shown in the assignment specification.
//	

	}

//	public void unrecognizedMenu() {
//		System.out.println("unrecognizedroommenu test");
//		runApp();
//	}
}
