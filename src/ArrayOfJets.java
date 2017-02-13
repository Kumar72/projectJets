import java.util.Arrays;

public class ArrayOfJets {
	
	//float placeKeper = 0f;
	
	public void hardCodedInJets() {//throws Exception {
		// model#, speed, range, Price, capacity, wingSpan
		JetBuilder j1 = new JetBuilder("F-16", 1_500, 2_622, 1, 1,33);
		JetBuilder j2 = new JetBuilder("LockHeed P-80", 600, 999, 110_000, 1, 0);
		JetBuilder j3 = new JetBuilder("Sukhoi Su -27", 1_553, 2_193, 30_000_000, 1, 48);
		JetBuilder j4 = new JetBuilder("Grumman F-14", 1_544, 0, 38_000_000, 1, 64);
		JetBuilder j5 = new JetBuilder("Bell P-59", 413, 520, 0, 1, 46);
		
		JetBuilder[] arrayOfJets = new JetBuilder[100];
		
		//default for an array = null so USE IT!!!! 
		arrayOfJets[0] = j1;
		arrayOfJets[1] = j2;
		arrayOfJets[2] = j3;
		arrayOfJets[3] = j4;
		arrayOfJets[4] = j5;
		
// We are just print the jets using this for loop!
	//	float indexS[] = new float[100];
		
		for (int i = 0; i < arrayOfJets.length; i++) {
			if(arrayOfJets[i] != null) {
			System.out.println(arrayOfJets[i]);
			}//Thread.sleep(420);	
		
		}
		
	}
	
	
	public void fastest() {
		hardCodedInJets();
		
	}
	
}
	
	//public void fast (Jets speedOfEachJet){//get the order right from here
		//System.out.println(speedOfEachJet);
		
	//		indexS[i] = arrayOfJets[i].getSpeed();
	//	Arrays.sort(indexS);
	//fast(arrayOfJets[i]);
	
	//passing it to the next function fast with the arrays 
		
		
		
		
		
		//System.out.println("\t\t\t\t\t"+bringInTheArray.getSpeed());
		
		//contains arrays that are not null (hard coded array) 
		//bringInTheArray.getSpeed();
//		if(speedOfEachJet.getSpeed() > placeKeper) {
//			placeKeper = speedOfEachJet.getSpeed();
//			System.out.print(placeKeper);
//		}
//		else 
//		System.out.println(placeKeper);	
		
			
			
		
		
		
//		System.out.println(hardCodedInJets.arrayOfJets[1]);
//		FlyingMachine order = new FlyingMachine();
//		//order.getSpeed();  check 
//		
//		for (int i = 0; i ; i++) {
//				index[i] = (int)order.getSpeed();
//				System.out.println(index[i]);
//			do {
//				
//				
//			}while(arrayOfJets[i] != null);
			//I am doing this so it only compares the array's that are occupied
			
//	}
//		
	//}
	
	
