package desion_pattern.ch01.check02;

public class Phone {
	
	private String number;
	
	
	public Phone() {}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Phone(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return String.format("Phone [number=%s]", number);
	}
}
