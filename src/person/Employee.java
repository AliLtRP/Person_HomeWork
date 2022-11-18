package person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Employee extends Person{
	protected String position;
	protected int salary, serviceYear;
	
	
	public void setPosition(String pos) {
		if (pos.matches(".*\\d.*")) {
			System.out.println("invalid");
		} else {
			this.position = pos;
		}
	}
	
	public String getPosition() {
		return this.position;
	}
	
	
//	default salary will be 100
	public void setSalary(int Salary, int serviceYear) {
		if ( ret(serviceYear) == true || age > 65) {
			this.salary = Salary/2;
		} else {
			this.salary = Salary < 100 ? 100:Salary;
		}
	}
	
	
	public int getSalary() {
		return this.salary;
	}
	
	
//	service years must be between 1-25
	public void setServiceYear(int Service) {
		this.serviceYear = Service < 1 ? 1: Service;
	}
	
//	retirement
	public static boolean ret(int Service) {
		return Service >= 25 ? true: false;
	}
	
	
	public int getServiceYear() {
		return this.serviceYear;
	}
	
	
//	give him raise
	public void raise() {
		System.out.print("$$ the amount of raise: ");
		Scanner s = new Scanner(System.in);
		this.salary += s.nextInt();
	}
	

//	add Employees
	@Override
	ArrayList<String> addUser(String[] u) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		
//		add any user has initialize to the list
		if (getName() != null) {
			arr.add(getName());
		}
		
//		add users array 
		arr.addAll(Arrays.asList(u));
		
//		update the id sequence
		setId(arr.size()-1);
		
		return arr;
	}


	
}
