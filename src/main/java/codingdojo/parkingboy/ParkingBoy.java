package codingdojo.parkingboy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingBoy {
	
	private List<ParkingLot> parkingLots;
	
	public ParkingCard park(Car car) {
		return getFirstParkingLotIsNotFull().park(car);
	}

	private ParkingLot getFirstParkingLotIsNotFull() {
		for (ParkingLot parkingLot : parkingLots) {
			if(!parkingLot.isParkingLotFull()) {
				return parkingLot;
			}
		}
		return null;
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
	
}
