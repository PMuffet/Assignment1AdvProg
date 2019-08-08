
import java.util.*;

public class CityLodge {

	private ArrayList<Room> rooms = new ArrayList<>();

	// constructor

	// methods

	/**
	 * 
	 */
	Scanner console = new Scanner(System.in);
	public void runApp() {
		System.out.println("****CITYLODGE SYSTEM MENU****\nAdd Room:			1\nRent Room:			2"
				+ "\nReturn Room			3\nRoom Maintenance:		4"
				+ "\nDisplay All Rooms:		5\n Exit Program:			6");
		System.out.print("Enter your choice: ");
		
		
		
		
		switch (console.nextInt()) {
		case 1:
			System.out.println("Add Room Menu");
			addRoom();
			break;
		case 2:
			System.out.println("Room Rental Menu");
			rentRoom();
			break;
		case 3:
			System.out.println("Return Room Menu");
			returnRoom();
			break;
		case 4:
			System.out.println("Room Maintenance Menu");
			maintainRoom();
			break;
		case 5:
			System.out.println("Full Room Display List");
			displayRoomList();
			break;
		case 6:
			System.out.println("Exiting Program");
			break;
		default:
			System.err.println("Unrecognized option");
			unrecognizedMenu();
			break;
		}
	
		
	}

	public void addRoom() {
		System.out.println("addroommenu test");
		System.out.println("Enter Room details");
		
		console.nextInt();
	
	}
	
	public void rentRoom() {
		System.out.println("rentroommenu test");
	}
	
	public void returnRoom() {
		System.out.println("returnroommenu test");
	}
	
	public void maintainRoom() {
		System.out.println("maintainroommenu test");
	}
	
	public void displayRoomList() {
		System.out.println("displayroommenu test");
	}
	
	public void unrecognizedMenu() {
		System.out.println("unrecognizedroommenu test");
		runApp();
	}
}
