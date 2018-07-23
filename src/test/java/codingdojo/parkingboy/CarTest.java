package codingdojo.parkingboy;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void should_be_return_true_with_same_car() {
		Car c1 = new Car("1");
		Car c2 = new Car("1");
		
		assertEquals(c1,c2);
		assertEquals(c1.hashCode(),c2.hashCode());
	}
	
	@Test
	public void should_be_return_false_with_diff_car() {
		Car c1 = new Car("1");
		Car c2 = new Car("2");
		
		assertNotEquals(c1,c2);
		assertNotEquals(c1.hashCode(),c2.hashCode());
	}
}
