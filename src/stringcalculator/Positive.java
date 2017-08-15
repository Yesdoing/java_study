package stringcalculator;


public class Positive {
	private int number = 0; 
		
	Positive(String str) {
		this(Integer.parseInt(str));
	}
	
	Positive(int number) {
		if (number < 0) {
			throw new RuntimeException();
		}

		this.number = number;
	}
	
	public int sum(int i) {
		number += i;
		return number;
	}
	
	
	
	public String toString() {
		return number + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
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
		Positive other = (Positive) obj;
		if (number != other.number)
			return false;
		return true;
	}
	
	public int intVaule() {
		return number;
	}
	
}
