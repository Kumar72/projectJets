import java.text.DecimalFormat;
public class JetBuilder extends FlyingMachine {
	DecimalFormat dff = new DecimalFormat(".###");
	private double wingSpan;
	// private double length;

	public JetBuilder(String model, float speedMPH, float rangeMiles,float price, int capacity, double wingSpan) {
		super(model, speedMPH, rangeMiles, price, capacity);
		this.wingSpan = wingSpan;
	}

	@Override
	public String toString() {
		return "\t**************************************\n\tModel: \t\t" + getModel() + 
				"\n\tSpeed: \t\t" + dff.format(getSpeed()/767.27f)+"Mach ("+getSpeed()+"MPH)" +" \n\tRange: \t\t" + getRange() + " Miles\n\tCapacity: \t" + getCapacity() + 
				"\n\tWing Span: \t" + wingSpan+"'\n";
	}
	
}
