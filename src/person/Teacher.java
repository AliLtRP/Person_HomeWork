package person;

public class Teacher extends Employee{
	private String course;
	
	

	public void setCourse(String course) {
		this.course = course;
	}

	
	public String getCourse() {
		return this.course;
	}
	
	
	public void courseUpdate(String course) {
		this.course = course;
	}

}
