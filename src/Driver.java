import java.util.ArrayList;
import java.util.Date;


public class Driver {
	protected String username, password;
	public ArrayList<WorkSchedule> workSchedules;
	
	public Driver(String username, String password){
		this.username = username;
		this.password = password;
		workSchedules = new ArrayList<>();
	}
	
	public boolean checkPassword(String username, String password){
		if((this.username.equals(username)) && (this.password.equals(password)))
			return true;
		else
			return false;
	}
	
	public boolean isAvailable(){
		return false;
	}
	
	public void setSchedule(String client, Date startDate, Date endDate){
		workSchedules.add(new WorkSchedule(client, startDate, endDate));
	}

}
