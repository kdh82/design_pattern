package desion_pattern.ch01.check02;

public class TestMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.setNumber("010-1111-1111");
		
		Phone phone2 = new Phone();
		phone2.setNumber("010-2222-2222");
		
		Person p = new Person();
		p.setHomePhones(phone1);
		p.setOfficePhone(phone2);
		
		System.out.println(p);
	}

}
