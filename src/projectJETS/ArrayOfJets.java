package projectJETS;

import java.util.Scanner;

public class ArrayOfJets {

	
	 
	public static int index = 4;

	// static variable so its specific to this file
	// if it was an instance it would change for every method

	Scanner input = new Scanner(System.in);

	  JetBuilder[] jetArray = new JetBuilder[100];{// throws Exception {
		// model#, speed, range, Price, capacity, wingSpan
		jetArray[0] = new JetBuilder("F-16", 1_500, 2_622, 1, 1);
		jetArray[1] = new JetBuilder("LockHeed P-80", 600, 999, 110_000, 1);
		jetArray[2] = new JetBuilder("Sukhoi Su -27", 1_553, 2_193, 30_000_000, 1);
		jetArray[3] = new JetBuilder("Grumman F-14", 1_544, 0, 38_000_000, 1);
		jetArray[4] = new JetBuilder("Bell P-59", 413, 520, 0, 1);
		 
		

		// default for an array = null so USE IT!!!!

	}

	public void hangar() throws Exception{
		int count =0;
		for(int i =0; i < jetArray.length;i++) {
			if(jetArray[i] != null) 
				count = i;
		}

		// stores jets in the array
		for (int i = 0; i < count; i++) {
			if (jetArray[i] != null) {
				System.out.println(jetArray[i]);

				// prints all the jets I have stored in the array
			}Thread.sleep(520);
			

		}
	}

	public void newJet() {
		JetBuilder create = new JetBuilder();
		
		System.out.print("Model of the Jet: ");
		create.setModel(input.next());
		System.out.print("Speed of the Jet(MPH): ");
		create.setSpeed(input.nextFloat());
		System.out.print("Range of the Jet: ");
		create.setRange(input.nextFloat());
		System.out.print("Capacity of the Jet: ");
		create.setCapacity(input.nextInt());

		index++;
		jetArray[index] = create;

	}

	public void fastest() {
		float largestValue = 0f;
		int largest = 0;
		
		for (int i = 0; i < jetArray.length;i++) {
			if(jetArray[i] != null){
				
				if(jetArray[i].getSpeed() > largestValue) {
					largestValue = jetArray[i].getSpeed();
					jetArray[largest]= jetArray[i];
					
				}
			
			}
		}
		System.out.println(jetArray[largest]);
	}
	public void range() {
		float largestValue = 0f;
		int largest = 0;
		
		for (int i = 0; i < jetArray.length;i++) {
			if(jetArray[i] != null){
				
				if(jetArray[i].getRange() > largestValue) {
					largestValue = jetArray[i].getRange();
					jetArray[largest]= jetArray[i];
					
				}
				
			}
		}
		System.out.println(jetArray[largest]);
	}
}
// System.out.println(create);

// for (int i : jetArray) {
// if (jetArray[i] != null) {
// jetArray[i] = create;
// }
// }

// public void Hanger(Object object) {
// if (jetArray != null) {
// jetArray = (JetBuilder[]) object;
// }

// }
