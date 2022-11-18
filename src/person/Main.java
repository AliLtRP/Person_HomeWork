package person;

public class Main {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		Student s = new Student();
		
		administrator d = new administrator();
		
		Teacher t = new Teacher();
		
		
		String[] arr = {"ali", "ahmed"};
		String[] arr1 = {"abbas", "mohammad"};

		t.setName("Salam");
		
		t.setAge(42);
		
//		salary, serviceYears
		t.setSalary(750, 12);
		
		e.setName("hadi");
		
		e.getUserById(2, e.addUser(arr1));
		
		s.setCollage("UOB");
		s.setDept("COE");
		
		System.out.println(s.getCollage() + "\n" + s.getDept());
		
		d.setPosition();
		System.out.println(d.getPosition());
		
	}
}
