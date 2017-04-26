package desion_pattern.ch01.check01;

public class Phone {
	
	private String Number;

	public Phone() {}
	
	
	public Phone(String number) {
		this.Number = number;
	}


	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}


	@Override
	public String toString() {
		return "Phone [Number=" + Number + "]";
	}
	
}
