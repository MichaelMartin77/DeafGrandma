import java.util.Scanner;

public class Grandma {

	public boolean canGrandmaHearyou(String phrase) {
//		boolean canSheHearYou = false;
		// logic to determine if she can hear you
		return phrase.equals(phrase.toUpperCase());

	}

	public String grandmaResponse(String respnseType) {
		String [] response = {};
		// logic to determine response
		
		String[] affirmative = {"HEY JOHHNY","DON'T INTERRUPT MY SHOW!","HEY, IM DOING OKAY", "HEY JOHNNY I'M GLAD YOU'RE HERE CAN YOU HELP ME TO THE LIVING ROOM", "HEY IM TOO TIRED TO TALK NOW JOHNNY" };
		String [] negativeResponse = {"I AGREE IT IS COLD IN HERE", "TUESDAY", "IM READY FOR MY SOAP OPERA TOO", "NO NOT SINCE WAR", "I MISS PHIL TOO"}; 
		String[] farewellResponses = {"I LOVE YOU DARLING, GOODBYE", "COMEBACK NOW YOU HEAR ME", "GRANDMA IS GONNA MISS YOU", "GOODBYE, I'LL SEE YOU TOMORROW?", "BYE BYE"};
		
		if (respnseType.equals("affirmative")) {
			response = affirmative;
		} else if(respnseType.equals("negative")) {
			response = negativeResponse;
		} else if (respnseType.equals("farewell")) {
			response = farewellResponses;
		}
		
		// Select a random index using Math.random()
		int randomIndex = (int) (Math.random() * response.length); 
		
		return response[randomIndex]; 
	}
}
