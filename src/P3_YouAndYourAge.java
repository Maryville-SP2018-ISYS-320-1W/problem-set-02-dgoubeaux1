import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P3_YouAndYourAge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String yourName = input.nextLine();
		
		System.out.println("How old are you? ");
		int yourAgeNow = input.nextInt();
		
		System.out.println("Wow " + yourName + ", you have been alive " + yourAgeNow + " years");
	}

}
