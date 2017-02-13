import java.util.Scanner;

public class JetsMenu {

	public static void main(String[] args) throws Exception {
		// Jets j1 = new Jets("F-16", 0, 0, 0,0.0);

		// System.out.println(j1);

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
					System.out.println("\t2. List of Fasterst jets.");
					break;
				case 3:
					System.out.println("\t3. List of jets with the longest range.");
					break;
				case 4:
					System.out.println("\t4. Add a new jet to the list.");
					break;
				case 5:
					System.out.println("\t5. Quit.");
					break;
				}
				Thread.sleep(420);
			}
			// System.out.println("What would you like to do?");
			System.out.print("\n\n\t... ");
			pick = input.nextInt();

			switch (pick) {
			case 1:
				ArrayOfJets printJets = new ArrayOfJets();
				printJets.hardCodedInJets();

				break;
			case 2:
				// FastOrder organizesJetsBySpeed = new FastOrder();
				// organizesJetsBySpeed.organizer();
				ArrayOfJets fastest = new ArrayOfJets();
				// fastJets.fast();
				break;
			case 3:
				break;
			case 4:
				break;
			}

		} while (pick != 5);
		Thread.sleep(200);
		System.out.println("Thank you for visiting!");
		System.exit(0);

	}

}
