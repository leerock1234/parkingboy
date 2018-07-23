package codingdojo.parkingboy;

public class Car {

	private String carNo;
	
	public Car(String carNo) {
		this.carNo = carNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carNo == null) ? 0 : carNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carNo == null) {
			if (other.carNo != null)
				return false;
		} else if (!carNo.equals(other.carNo))
			return false;
		return true;
	}
	
	
	

}
