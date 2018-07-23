package codingdojo.parkingboy;

public class ParkingLot {
	private static final int MIN_PARKING_SPACE = 0;
	private static final int MAX_PARKING_SPACE = 10000;
	Integer parkingSpace;
	String parkingName;
	
	public ParkingLot(String name, Integer parkingSpace) {	
		checkParameter(name, parkingSpace);
		this.parkingSpace = parkingSpace;
		this.parkingName = name;
	}

	private void checkParameter(String name, Integer parkingSpace) {
		if(parkingSpaceIsValid(parkingSpace)) {
			throw new ParkingLotSizeInvalid();
		}
		checkParkingLotName(name);
	}

	private void checkParkingLotName(String name) {
		if(null==name) {
			throw new ParkingLotNameIsNull();
		}
		if(name.length() > 10) {
			throw new ParkingLotNameIsTooLong();
		}
	}

	private boolean parkingSpaceIsValid(Integer parkingSpace) {		
		return null==parkingSpace||parkingSpace <= MIN_PARKING_SPACE || parkingSpace >= MAX_PARKING_SPACE;
	}

	public Integer getParkingSpace() {
		return parkingSpace;
	}

}
