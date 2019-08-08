
public abstract class Room {

	private final String STANDARD = "Stardard";
	private final String SUITE = "Suite";

	private final int MAX_RECORD_SIZE = 10;

	private String id;
	private int numBeds;
	private String feature;
	private String type;
	private Character status;

	private HiringRecord[] records = new HiringRecord[MAX_RECORD_SIZE];

	public Room(String id, int numBeds, String feature, String type, Character status, HiringRecord[] records) {
		this.id = id;
		this.numBeds = numBeds;
		this.feature = feature;
		this.type = type;
		this.status = status;
		this.records = records;

	}

	
	
	
	
	// Accessors
	public String getid() {
		return id;
	}

	public int getnumBeds() {
		return numBeds;

	}

	public String getfeature() {
		return feature;
	}

	public String gettype() {
		return type;
	}

	public Character getstatus() {
		return status;
	}

	public HiringRecord[] getrecords() {
		return records;
	}


	
	
	// Mutators

	public void setid(String id) {
		// logic?
	}

	public void setnumBeds(int numBeds) {
		// logic?
	}

	public void setfeature(String feature) {
		// logic?
	}

	public void settype(String type) {
		// logic?
	}

	public void setstatus(String status) {
		// logic?
	}

	public void setrecords(HiringRecord[] records) {
		// logic?
	}
}
