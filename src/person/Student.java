package person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student extends Person{
	private int stage;
	
	
	public void setStage(int stage) {
		System.out.println("are you studing "+ "\n" +"1) Deploma"+"\n" 
				+"2) Bachelor" + "\n" + "3) master" + "\n" + "4) phd");
		
		int s = Scan();
		
		if (stage > s) {
			grad();
		}
		
		this.stage = (stage > 0 && stage <= 7)? stage: 1;
	}
	
	public int getStage() {
		return this.stage;
	}
	
	
	public static void grad() {
		System.out.println("congratulations for graduation");
	}
	
	
	public int stageUpdata() {
		return this.stage++;
	}
	
	public static int Scan() {
		System.out.print("choose number: ");
		
		Scanner s = new Scanner(System.in);
		String x = s.next();
		
//		for check if string contains unwanted letters
		if (x.matches(".*[a-zA-Z ]+.*")){
			System.out.println("Invald ");
			Scan();
		}
		
		if ( Integer.parseInt(x) == 1 || Integer.parseInt(x) == 3){
			return 2;
		} else if (Integer.parseInt(x) == 2){
			return 4;
		}	
		
		return 7;
	}

	
//	add students
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











