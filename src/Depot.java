import java.util.ArrayList;
import java.util.Scanner;


public class Depot {
	private ArrayList<WorkSchedule> workSchedules;
	private ArrayList<Driver> drivers;
	private ArrayList<Vehicle> vehicles;
	
	private Driver currentUser;
	
	private Scanner scanner;
	
	public Depot(){
		scanner = new Scanner(System.in);
		drivers.add(new Driver("Steven", "IAmSteven"));
		drivers.add(new Driver("Blll", "password"));
		//TODO comment about real life use of database for this
	}
	 
	public void logon(String username, String password){
		for (int i = 0; i < drivers.size(); i++){
			if(drivers.get(i).checkPassword(username, password)){
				currentUser = drivers.get(i);
				System.out.println(currentUser.username); //Protected?!?!
				return;
			}
		}
	}
	
	public Vehicle getVehicle(){
		return null;
	}
	
	public Driver getDriver(){
		return null;
	}
	
	public void setupWorkSchedule(){
		
	}

}
