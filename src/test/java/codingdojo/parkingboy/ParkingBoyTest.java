package codingdojo.parkingboy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParkingBoyTest {

	@Test
	public void should_park_when_parking_lot_is_empty() {
		Company company = new Company();
		ParkingLot p1 = new ParkingLot("1", 2);
		ParkingLot p2 = new ParkingLot("2", 2);
		company.add(p1);
		company.add(p2);
		
		ParkingBoy parkingBoy = new ParkingBoy();
		company.employ(parkingBoy);
		
		parkingBoy.park(new Car("1"));	
	}
	
	//should pick a car when the car is in the first parking lot
	@Test
	public void should_pick_a_park_when_the_car_is_in_first_parking_lot() {
		Company company = new Company();
		ParkingLot p1 = new ParkingLot("1", 2);
		ParkingLot p2 = new ParkingLot("2", 2);
		company.add(p1);
		company.add(p2);
		ParkingBoy parkingBoy = new ParkingBoy();
		company.employ(parkingBoy);
		Car car = new Car("1");
		ParkingCard card1 = parkingBoy.park(car);
		
		Car carPicked = parkingBoy.pick(card1);
		
		assertEquals(carPicked, car);
	}
	
	
	//should park a car to the first parking lot when the first parking lot is not full
	
	//should park to the second parking lot when the first is full
	
	//should park to the first parking lot when the first has space, even the second has car.
	
	//should throw parking lot is full exception when trying to park but no space any more
	
	//should pick a car when the car is in the first parking lot
	
	//should pick a car when the car is in the second parking lot
	
	//should throw car is not found exception when the parking card is not matched to any car
}
