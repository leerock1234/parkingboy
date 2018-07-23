package codingdojo.parkingboy;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompanyTest {



	@Test
	public void should_success_create_a_parking_lot() {
		ParkingLot parkingLot = buildParkingLot("", 2);;
		assertEquals(2, parkingLot.getParkingSpace().intValue());
	}
	
	
	@Test
	public void should_success_when_everything_is_right() {
		Company company = new Company();
		assertEquals(0, company.getParkingLotSize().intValue());
		ParkingLot parkingLot = buildParkingLot("", 2);;
		company.add(parkingLot);
		assertEquals(1, company.getParkingLotSize().intValue());
		assertEquals(2, parkingLot.getParkingSpace().intValue());
	}
	
	
	@Test(expected=ParkingLotSizeInvalid.class)
	public void should_throw_exception_when_the_parking_lot_size_is_negative() {
		ParkingLot parkingLot = buildParkingLot("", -2);;
	}
	
	@Test(expected=ParkingLotSizeInvalid.class)
	public void should_throw_exception_when_the_parking_lot_size_is_Null() {
		ParkingLot parkingLot = buildParkingLot("", null);;
	}
	
	@Test(expected=ParkingLotSizeInvalid.class)
	public void should_throw_exception_when_the_parking_lot_size_is_zero() {
		ParkingLot parkingLot = buildParkingLot("", 0);
	}
	
	@Test(expected=ParkingLotSizeInvalid.class)
	public void should_throw_exception_when_the_paking_lot_size_is_more_than_10000() {
		ParkingLot parkingLot = buildParkingLot("", 10000);
	}
	
	@Test(expected=ParkingLotNameDuplication.class)
	public void should_throw_exception_when_the_paking_lot_is_in_duplicate_name() {
		ParkingLot parkingLot = buildParkingLot(new String("a"), 2);
		ParkingLot parkingLot1 = buildParkingLot(new String("a"), 2);
		Company company = new Company();
		company.add(parkingLot);
		company.add(parkingLot1);
	}

	private ParkingLot buildParkingLot(String name, Integer size) {
		return new ParkingLot(name, size);
	}
	@Test(expected=ParkingLotNameIsNull.class)
	public void should_throw_exception_when_the_parking_lot_has_null_name() {
		ParkingLot parkingLot = buildParkingLot(null, 1);
	}
	
	@Test(expected=ParkingLotNameIsTooLong.class)
	public void should_throw_exception_when_the_parking_lot_has_too_long_name() {
		ParkingLot parkingLot = buildParkingLot("looooooooooooooong name", 1);
	}
}
