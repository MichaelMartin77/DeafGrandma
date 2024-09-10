import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {
		DeafGrandmaApp app = new DeafGrandmaApp();
		app.launch();

	}

	private void launch() {
		
		
		Scanner sc = new Scanner(System.in);
		boolean continueConversation = true;
		
		// Continuing talking to grandma until you shout goodbye 
		while(continueConversation) {
			// Scanner
			

			// Ask the user to say something to grandma 
			System.out.println("Say something to Grandma: ");
			String grandsonInput = sc.nextLine();
		

			// Instantiate Grandma
			Grandma grandma = new Grandma(); 
			boolean canSheHearYou = grandma.canGrandmaHearyou(grandsonInput); 
			
			
			if (grandsonInput.equals("GOODBYE")) {
				System.out.println("SMELL YOU LATER");
				continueConversation = false;
				break;
			}
			
			
			if(canSheHearYou) {
				System.out.println("NO... NOT SINCE MY LAST MEAL");
			} else {
				System.out.println("HUH JOHNNY??? SPEAK UP I CAN'T HEAR YOU!");
			} 
	
		}
		

		// Bulk of where logic will be

	}
}