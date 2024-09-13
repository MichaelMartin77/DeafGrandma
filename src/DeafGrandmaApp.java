import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {
		DeafGrandmaApp app = new DeafGrandmaApp();
		app.launch();

	}

	private void launch() {

		// Scanner
		Scanner sc = new Scanner(System.in);
		boolean continueConversation = true;

		// Continuing talking to grandma until you shout goodbye
		while (continueConversation) {

			// Ask the user to say something to grandma
			System.out.println("Say something to Grandma: ");
			String grandsonInput = sc.nextLine();

			// Instantiate Grandma
			Grandma grandma = new Grandma();

			// Refactor code so that grandma randomly selects an appropriate response
			if (grandsonInput.equals("GOODBYE")) {
				System.out.println(grandma.grandmaResponse("farewell"));
				continueConversation = false;
//				break;
			} else {
				boolean canSheHearYou = grandma.canGrandmaHearyou(grandsonInput);

				if (canSheHearYou) {
					System.out.println(grandma.grandmaResponse("affirmative"));
				} else {
					System.out.println(grandma.grandmaResponse("negative"));
				}

			}

		}
	}
}