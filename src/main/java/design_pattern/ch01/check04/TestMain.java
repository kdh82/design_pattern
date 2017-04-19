package design_pattern.ch01.check04;

public class TestMain {
	public static void main(String[] args) {
		//���� �л��� ������û ����� ����غ�����...
		// "Java", "android", "Database", "Html"
		
		Course c1 = new Course("Java");
		Course c2 = new Course("android");
		Course c3 = new Course("Database");
		Course c4 = new Course("Html");
		
		Student sdh = new Student("������");
		sdh.registerCourse(c1);// "SDH�� �л��� ������ ������ "Java", "DataBase"
		sdh.registerCourse(c3);
		sdh.registerCourse(c3);
		sdh.dropCourse(c3);
		sdh.registerCourse(c3);
		
		System.out.println(sdh);// "SDH�� �л��� ������ ������ "Java", "DataBase"
	}
}
