

public class FlyingMachine {
	private String model;
	private float speed;
	private float range;
	private float price;
	private int capacity;
	//private Pilot pilot;
	
	public FlyingMachine(String model, float speedMPH,float rangeMiles,float price, int capacity) {
		this.model = model;
		speed = speedMPH;
		range = rangeMiles;
		this.price = price;
		this.capacity = capacity;
	}
	
	public FlyingMachine() {}
	

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
