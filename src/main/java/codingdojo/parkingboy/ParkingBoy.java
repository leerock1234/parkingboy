package codingdojo.parkingboy;

import java.util.List;

public class ParkingBoy {
	
	private Car car;
	private List<ParkingLot> parkingLots;
	
	
	public ParkingCard park(Car car) {
		if(parkingLots.get(0).getHadParkingCars() == 2) {
			
		}
		this.car = car;
		parkingLots.get(0).park();
		return new ParkingCard();
	}

	public Car pick(ParkingCard card1) {
		return car;
	}

	void setParkingLots(List<ParkingLot> parkingLots) {
		this.parkingLots = parkingLots;
	}
	
	
}
