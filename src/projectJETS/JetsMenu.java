package projectJETS;

import java.util.Scanner;

public class JetsMenu {
	static ArrayOfJets listOJets = new ArrayOfJets();
	
	
	public static void main(String[] args) throws Exception {
		mainMenuOfJets();

	}

	public static void mainMenuOfJets() throws Exception {
		Scanner input = new Scanner(System.in);
		int pick;
		do {
			System.out.println("\t*********WELCOME TO THE HANGER*********\n");
			for (int i = 0; i < 6; i++) {
				switch (i) {
				case 1:
					System.out.println("\t1. List of all the Jets in the Hanger.");
					break;
				case 2:
					System.out.println("\t2. Fasterst jet in the hangar.");
					break;
				case 3:
					System.out.println("\t3. Jets with the longest range.");
					break;
				case 4:
					System.out.println("\t4. Add a new jet to the hangar.");
					break;
				case 5:
					System.out.println("\t5. Exit.");
					break;
				}
				Thread.sleep(420);
			}
			// System.out.println("What would you like to do?");
			System.out.print("\n\n\t... ");
			pick = input.nextInt();

			switch (pick) {
			case 1:
				listOJets.hangar();
				break;
			case 2:
				listOJets.fastest();
				break;
			case 3:
				listOJets.range();
				break;
			case 4:
				listOJets.newJet();
				break;
			}

		} while (pick != 5);
		Thread.sleep(200);
		System.out.println("Thank you for visiting!");
		System.exit(0);

	}

}
