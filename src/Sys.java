import java.util.ArrayList;
import java.util.Scanner;

public class Sys {
	private ArrayList<Depot> depots = new ArrayList<Depot>();
	private Scanner scan;

	public Sys() {
		scan = new Scanner(System.in);
		depots.add(new Depot());
		depots.add(new Depot());
		getDepot().logon();
	}

	public static void main(String[] args) {
		new Sys();
	}

	public Depot getDepot() {
		System.out.println("Available depots: ");
		for (int i = 0; i < depots.size(); i++)
			System.out.println(i);
		System.out.print("Please select a Depot: ");
		int selectedDepot = scan.nextInt();
		while (!((selectedDepot < depots.size()) && (selectedDepot >= 0))) {
			System.out.print("Invalid depot, please select a depot: ");
			selectedDepot = scan.nextInt();
		}
		return depots.get(selectedDepot);

	}

}
