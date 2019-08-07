
public abstract class Room {
	
	private final String STANDARD = "Stardard";
	private final String SUITE = "Suite";
	
	private final int MAX_RECORD_SIZE = 10;
	
	private String id;
	private int numBedrooms;
	private String feature;
	private String type;
	private Character status;
	
	private HiringRecord[] records = new HiringRecord[MAX_RECORD_SIZE];
	
}
