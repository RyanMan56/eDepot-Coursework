
public class Tanker extends Vehicle{
	private int liquidCapacity;
	private String liquidType;

	public Tanker(String make, String model, String regNo, int weight, int liquidCapacity, String liquidType){
		this.make = make;
		this.model = model;
		this.regNo = regNo;
		this.weight = weight;
		this.liquidCapacity = liquidCapacity;
		this.liquidType = liquidType;
	}
}
