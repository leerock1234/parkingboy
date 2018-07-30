package codingdojo.parkingboy;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
	private static final int MIN_PARKING_SPACE = 0;
	private static final int MAX_PARKING_SPACE = 10000;
	Integer parkingSpace;
	String parkingName;
	private Map<ParkingCard,Car> parkedCars = new HashMap<>();
	
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

	public Integer getParkingCarsNum() {
		return parkedCars.size();
	}
	
	public ParkingCard park(Car car) {
		ParkingCard card = new ParkingCard();
		parkedCars.put(card, car);
		return card;
	}

	public Car pick(ParkingCard card) {
		return parkedCars.remove(card);
	}
	public boolean isParkingLotFull() {
		return parkedCars.size()==parkingSpace;
	}
}
