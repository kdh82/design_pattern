package desion_pattern.ch01.check02;

import java.util.Arrays;

public class Person {
	private Phone homePhones;
	private Phone officePhone;
	
	public Person() {}
	
	
	public Person(Phone homePhones, Phone officePhone) {
		this.homePhones = homePhones;
		this.officePhone = officePhone;
	}


	public Phone getHomePhones() {
		return homePhones;
	}


	public void setHomePhones(Phone homePhones) {
		this.homePhones = homePhones;
	}


	public Phone getOfficePhone() {
		return officePhone;
	}


	public void setOfficePhone(Phone officePhone) {
		this.officePhone = officePhone;
	}


	@Override
	public String toString() {
		return String.format("Person [homePhones=%s, officePhone=%s]", homePhones, officePhone);
	}
	
	
}
