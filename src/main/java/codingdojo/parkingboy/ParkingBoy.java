package codingdojo.parkingboy;

public class ParkingBoy {
	
	private Car car;
	
	public ParkingCard park(Car car) {
		this.car = car;
		return new ParkingCard();
	}

	public Car pick(ParkingCard card1) {
		return car;
	}
	
	
}
