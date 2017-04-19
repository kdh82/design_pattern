package design_pattern.ch01.check05;

public class TestMain {
	public static void main(String[] args) {
		
		Course c1 = new Course("Java");
		Course c2 = new Course("android");
		Course c3 = new Course("Database");
		Course c4 = new Course("Html");
		
		Student std1 =new Student("���ȯ");
		Student std2 =new Student("������");
		Student std3 =new Student("�̿���");
		
		std1.registerCourse(c1);
		std1.registerCourse(c2);
		std1.registerCourse(c3);
		
		std2.registerCourse(c1);
		std2.registerCourse(c3);
		
		std3.registerCourse(c2);
		std3.registerCourse(c3);
		
		
		prnCourseList(std1);// "SDH�� �л��� ������ ������ "Java", "DataBase"
		prnCourseList(std2);
		prnCourseList(std3);
		
		prnStdlist(c1);
		prnStdlist(c2);
		prnStdlist(c3);
	}

	private static void prnCourseList(Student std1) {
		System.out.println("=============================");
		System.out.println(std1.getName() + "�� ������û ����");
		System.out.println(std1);		
	}

	private static void prnStdlist(Course c1) {
		System.out.println("=============================");
		System.out.println(c1.getName() + "��(��) ���� ��û�� �л�");
		for(Student std : c1.getStdLists()){
			System.out.println(std.getName());
		}
	}
}
