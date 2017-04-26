package desion_pattern.ch01.check03;

public class TestMain {

	public static void main(String[] args) {
		Student std = new Student();
		Professor advisor = new Professor();
		std.setAdvisor(advisor);
		advisor.setStudent(std);
		
		System.out.println(std.getAdvisor());
		System.out.println(advisor.getStudent());
		
	}
}