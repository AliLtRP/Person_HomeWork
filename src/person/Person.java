package person;

import java.util.ArrayList;

abstract class Person {
	private String dept, college, name;
	protected int id, age;
	
//	abstracts methods for addUsers and print them
	abstract ArrayList<String> addUser(String[] u);
	
//	set age method
	public void setAge(int age) {
		if (age < 0 || age > 120) {
			System.out.println("invalid");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return this.age;
	}
	
	
	protected void setId(int id) {
		
		if (id < 0) {
			System.out.println("invalid");
		} else {
			this.id = id;
		}
	}
	
	public int getId() {
		return this.id;
	}
	

	public void setName(String name) {
		
//		name mustn't has numbers in it

		if (name.matches(".*\\d.*")) {
			System.out.println("invalid");
		} else {
			this.name = name;
			addUser(new String[] {this.name});
		}
	}
	
	
	public String getName() {
		return this.name;
	}
	
	
	public void setDept(String dept) {
		
//		dept musn't have numbers in it
		
		if (dept.matches(".*\\d.*")) {
			System.out.println("invalid");
		} else {
			this.dept = dept;
		}
	}
	
	public String getDept() {
		return this.dept;
	}
	
	
	
	public void setCollage(String college) {
		
//		college musn't have numbers in it	
		
		if (college.matches(".*\\d.*")) {
			System.out.println("invalid");
		} else {
			this.college = college;
		}
	}

	
	public String getCollage() {
		return this.college;
	}

	
	
//	get users by id
	public void getUserById(int id, ArrayList<String> arr) {
		System.out.println(arr);
		if (id >=0 && id < arr.size()) {
			System.out.println(arr.get(id));
		}
	}
	
}
