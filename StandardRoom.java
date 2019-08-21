import util.DateTime;

public class StandardRoom extends Room {

	public StandardRoom(String id, int numBeds, String feature, String type, Character status, HiringRecord[] records) {
		super(id, numBeds, feature, type, status, records);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean rent(String customerID, DateTime rentDate, int numOfRentDay) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean returnRoom(DateTime returnDate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean performMaintenace() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean completeMaintenace(DateTime completionDate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
