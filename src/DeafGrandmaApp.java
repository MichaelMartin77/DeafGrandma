import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {
		DeafGrandmaApp app = new DeafGrandmaApp();
		app.launch();

	}

	private void launch() {
		// Scanner
		Scanner sc = new Scanner(System.in);

		// User Prompt
		System.out.println("Say something to Grandma: ");
		String grandsonInput = sc.nextLine();
	

		System.out.println("You said: " + grandsonInput);

		// Instantiate Grandma
		Grandma grandma = new Grandma(); 
		boolean canSheHearYou = grandma.canGrandmaHearyou(grandsonInput); 
		
		if(canSheHearYou) {
			System.out.println("NO... NOT TODAY SONNY. GRANDMA IS TIRED");
		} else {
			System.out.println("HUH JOHNNY??? SPEAK UP I CAN'T HEAR YOU!");
		}
		

		// Bulk of where logic will be

	}
}