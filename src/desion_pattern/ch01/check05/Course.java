package desion_pattern.ch01.check05;

import java.util.ArrayList;


public class Course {
	private String name;	
	private ArrayList<Student> stdList;
	
	public Course() {
		stdList = new ArrayList<>();
	}

	public Course(String name) {
		this();
		this.name = name;
	}
	public void registerStudent(Student student){
		if(!stdList.contains(student)){
			stdList.add(student);
		}
	}
	public void dropStudent(Student student){
		if(!stdList.contains(student)){
			stdList.remove(student);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Course [name=%s]", name);
	}

	public ArrayList<Student> getStdList() {
		return stdList;
	}
	
}
