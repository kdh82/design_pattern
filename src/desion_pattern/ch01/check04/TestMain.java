package desion_pattern.ch01.check04;

public class TestMain {

	public static void main(String[] args) {
		
		Course c1 = new Course("Java");
		Course c2 = new Course("android");
		Course c3 = new Course("Database");
		Course c4 = new Course("Html");
		
		Student std1 = new Student("설동훈");
		Student std2 = new Student("김두환");
		std1.registerCourse(c1);
		std1.registerCourse(c2);
		std1.dropCourse(c3);
		std1.registerCourse(c3);
		std2.registerCourse(c3);
		
		System.out.println(std1);
		System.out.println(std2);
	}
}
