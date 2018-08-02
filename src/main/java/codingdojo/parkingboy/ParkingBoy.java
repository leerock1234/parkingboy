package codingdojo.parkingboy;

import java.util.List;

public class ParkingBoy {
	
	private List<ParkingLot> parkingLots;
	
	public ParkingCard park(Car car) {
		if(hasThisCar(car)) {
			throw new ParkingCarDuplicationException();
		}
		return getFirstParkingLotIsNotFull().park(car);
	}

	private ParkingLot getFirstParkingLotIsNotFull() {
		for (ParkingLot parkingLot : parkingLots) {
			if(!parkingLot.isParkingLotFull()) {
				return parkingLot;
			}
		}
		throw new ParkingLotIsFull();
	}

	public Car pick(ParkingCard card) {
		Car car = null;
		for(ParkingLot lot: parkingLots) {
			car = lot.pick(card);
			if(car != null) {
				return car;
			}
		}
		throw new ParkingCarIsNotFoundException();
	}

	void setParkingLots(List<ParkingLot> parkingLots) {
		this.parkingLots = parkingLots;
	}
	
	private boolean hasThisCar(Car car) {
		for(ParkingLot parkingLot :parkingLots ) {
			if(parkingLot.hasThisCar(car)) {
				return true;
			}
		}
		return false;
	}
	
}
