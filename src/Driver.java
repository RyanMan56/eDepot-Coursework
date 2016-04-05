import java.util.ArrayList;


public class Driver {
	protected String username, password;
	private ArrayList<WorkSchedule> workSchedules;
	
	public Driver(String username, String password){
		this.username = username;
		this.password = password;
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
	
	public void setSchedule(){
		
	}

}
