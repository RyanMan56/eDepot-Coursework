import java.util.Date;


public class WorkSchedule {
	private String client;
	private Date startDate, endDate;

	public WorkSchedule(String client, Date start, Date end){
		this.client = client;
		this.startDate = start;
		this.endDate = end;
	}
	@Override
	public String toString() {
		return "Name of client: "+this.client+", the start date is: "+this.startDate+", the end date is: "+this.endDate;
				
		
	}
}

