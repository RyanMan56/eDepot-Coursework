import java.util.ArrayList;
import java.util.Scanner;

public class Depot {
	private ArrayList<WorkSchedule> workSchedules;
	private ArrayList<Driver> drivers;
	private ArrayList<Vehicle> vehicles;
	private Driver currentUser;
	private boolean loggedIn = false;

	private Scanner scanner;

	public Depot() {
		scanner = new Scanner(System.in);
		drivers = new ArrayList<Driver>();
		vehicles = new ArrayList<Vehicle>();
		drivers.add(new Driver("Steven", "IAmSteven"));
		drivers.add(new Driver("Blll", "password"));
		drivers.add(new Driver("Frank", "dankword"));
		// TODO comment about real life use of database for this
	}

	public void logon() {
		while (!loggedIn) {
			System.out.print("Enter yo username m80: ");
			String username = scanner.nextLine();
			System.out.print("password m8: ");
			String password = scanner.nextLine();
			for (int i = 0; i < drivers.size(); i++) {
				if (drivers.get(i).checkPassword(username, password)) {
					currentUser = drivers.get(i);
					loggedIn = true;
					System.out.println(currentUser.username); // Protected?!?!
					return;
				}
			}
		}
	}

	public Vehicle getVehicle() {
		return null;
	}

	public Driver getDriver() {
		return null;
	}

	public void setupWorkSchedule() {

	}

}
