package projectJETS;

import java.text.DecimalFormat;


//declare variables so that the user can't change them #private
public class JetBuilder {
	private String model;
	private float speed;
	private float range;
	private float price;
	private int capacity;
	//private Pilot pilot;
	
	
	//construct a JET - done 
	public JetBuilder(String model, float speedMPH,float rangeMiles,float price, int capacity) {
		this.model = model;
		speed = speedMPH;
		range = rangeMiles;
		this.price = price;
		this.capacity = capacity;
	}
	
	//to get the right number of sig. figures (FINALLY found a solution)  
	DecimalFormat dff = new DecimalFormat(".###");
	@Override
	public String toString() {
		return "\t***************************************\n\tModel: \t\t" + getModel() + 
				"\n\tSpeed: \t\t" + dff.format(getSpeed()/767.27f)+"Mach ("+getSpeed()+"MPH)" 
				+" \n\tRange: \t\t" + getRange() + " Miles\n\tCapacity: \t" + getCapacity() + "\n";
	}
	
	//
	public JetBuilder() {
		
	}
	
	//GETTER and SETTERS BELOW 
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
