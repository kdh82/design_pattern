package desion_pattern.ch01.check04;

public class Course {
	private String name;

	public Course() {}

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		return name.equals(((Course)obj).name);
	}

	@Override
	public String toString() {
		return String.format("Course [name=%s]", name);
	}
	
	
}
