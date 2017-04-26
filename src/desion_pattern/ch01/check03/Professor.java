package desion_pattern.ch01.check03;

public class Professor {
	private Student student;

	public Professor() {}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return String.format("Professor [%s]", student);
	}
	
	
	
	
}
