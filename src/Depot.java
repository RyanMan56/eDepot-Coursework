import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
		drivers.add(new Manager("Anthony", "Heineken"));
		
//		drivers.get(3).setSchedule("Jim", new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()+100000));

		vehicles.add(new Truck("Scania", "G400", "NP15WO9", 4, 2000));
		vehicles.add(new Truck("Mercedes", "Antos", "WE15W09", 5, 3000));
		vehicles.add(new Tanker("Scania", "P360", "RT13RT5", 3, 35000, "Oil"));
		vehicles.add(new Tanker("Volvo", "FE", "RE16W34", 6, 30000, "Gas"));

	}
	// TODO comment about real life use of database for this

	public void logon() {
		while (!loggedIn) {
			System.out.print("Please enter your username: ");
			String username = scanner.nextLine();
			System.out.print("Please enter your password: ");
			String password = scanner.nextLine();
			for (int i = 0; i < drivers.size(); i++) {
				if (drivers.get(i).checkPassword(username, password)) {
					currentUser = drivers.get(i);
					loggedIn = true;
					break;
				}
			}
		}
		System.out.println("Welcome, " + currentUser.username);
		if (currentUser instanceof Manager) {
			System.out.println("1. View work schedule");
			System.out.println("2. Set work schedule");
			System.out.println("3. Move vehicle");
			boolean optionSelected = false;
			while (!optionSelected) {
				System.out.println("Please select a valid option: ");
				int input = scanner.nextInt();
				switch (input) {
				case 1:
					if(currentUser.workSchedules.size() == 0){
						System.out.println("You have no outstanding work schedules");
						break;
					}
					for (int i = 0; i < currentUser.workSchedules.size(); i++)
						System.out.println(i);
					boolean workScheduleSelected = false;
					while (!workScheduleSelected) {
						System.out.print("please select a work schedule: ");
						int workScheduleInput = scanner.nextInt();
						if((workScheduleInput >= 0) && (workScheduleInput < currentUser.workSchedules.size())){
							System.out.println(currentUser.workSchedules.get(workScheduleInput));
							workScheduleSelected = true;
						}
					}
					optionSelected = true;
					break;
				case 2:
					System.out.print("Please enter the client's name: ");
					String clientName = scanner.next();
					System.out.print("Please enter the start year: ");
					int startYear = scanner.nextInt();
					System.out.print("Please enter the start month (as a numeric value): ");
					int startMonth = scanner.nextInt();
					System.out.print("Please enter the start date: ");
					int startDay = scanner.nextInt();
					System.out.print("Please enter the end year: ");
					int endYear = scanner.nextInt();
					System.out.print("Please enter the end month (as a numeric value): ");
					int endMonth = scanner.nextInt();
					System.out.print("Please enter the end date: ");
					int endDay = scanner.nextInt();
					
					Calendar calendar = GregorianCalendar.getInstance();
					calendar.set(startYear, startMonth, startDay);
					Date startDate = calendar.getTime();
					calendar.set(endYear, endMonth, endDay);
					Date endDate = calendar.getTime();
					currentUser.setSchedule(clientName, startDate, endDate);
					System.out.println("Work schedule set: ");
					System.out.println(currentUser.workSchedules.get(currentUser.workSchedules.size()-1).toString());
					optionSelected = true;
					break;
				case 3:
					optionSelected = true;
					break;

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
