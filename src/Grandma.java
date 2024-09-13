import java.util.Random;
import java.util.Scanner;

public class Grandma {

	public String[] affirmative = { "HEY JOHHNY", "DON'T INTERRUPT MY SHOW!", "HEY, IM DOING OKAY",
			"HEY JOHNNY I'M GLAD YOU'RE HERE CAN YOU HELP ME TO THE LIVING ROOM",
			"HEY IM TOO TIRED TO TALK NOW JOHNNY" };

	public String[] negativeResponse = { "I AGREE IT IS COLD IN HERE", "TUESDAY", "IM READY FOR MY SOAP OPERA TOO",
			"NO NOT SINCE WAR", "I MISS PHIL TOO" };

	public String[] farewellResponses = { "I LOVE YOU DARLING, GOODBYE", "COMEBACK NOW.. YOU HEAR ME!",
			"GRANDMA IS GONNA MISS YOU", "GOODBYE, I'LL SEE YOU TOMORROW?", "BYE BYE" };

	public boolean canGrandmaHearyou(String phrase) {
//		boolean canSheHearYou = false;
		// logic to determine if Grandma can hear you
		return phrase.equals(phrase.toUpperCase());

	}

	// Stretch Goal: Refactor code so that grandma can randomly choose an
	// response from  any array
	public String grandmaResponse(String respnseType) {
		Random random = new Random();
		String[] response = null;
		// logic to determine Grandmas response
		
	

		switch (respnseType) {
		case "affirmative":
			response = affirmative;
			break;
		case "negative":
			response = negativeResponse;
			break;
		case "farewell":
			response = farewellResponses;
			break;

		default: 
			String[][] allResponses = { affirmative, negativeResponse, farewellResponses };
            response = allResponses[random.nextInt(allResponses.length)];
            break;
		}


		int randomIndex = random.nextInt(response.length);
		return response[randomIndex];

	}

}