
import util.DateTime;

public class HiringRecord {
	private String id;
	private DateTime rentDate;
	private DateTime estimatedReturnDate;
	private DateTime actualReturnDate;
	private double rentalFee;
	private double lateFee;
	
	
	DateTime today = new DateTime();
	DateTime maxRentalDate = new DateTime(today, 10);
	
	
	public HiringRecord(String id, DateTime rentDate, DateTime estimatedReturnDate, DateTime actualReturnDate, double rentalFee, double lateFee) {
		this.id = id; 
		this.rentDate = rentDate;
		this.estimatedReturnDate = estimatedReturnDate;
		this.actualReturnDate = actualReturnDate;
		this.rentalFee = rentalFee;
		this.lateFee = lateFee;
		
		
		
		
		
	}
	
	
	
	
	
}
