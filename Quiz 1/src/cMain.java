import java.util.Scanner;

public class cMain {
	
	public static void main(String args[]){
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("How many Touchdowns has your QB thrown? ");
		int TD = user_input.nextInt();
		System.out.print("How many Yards has your QB thrown for? ");
		int Yards = user_input.nextInt();
		System.out.print("How many Interceptions has your QB thrown? ");
		int INT = user_input.nextInt();
		System.out.print("How many completions has your QB thrown? ");
		int comp = user_input.nextInt();
		System.out.print("How many passes has your QB attempted? ");
		int ATT = user_input.nextInt();
		
		QB name = new QB(TD, Yards, INT, comp, ATT);
		
		System.out.print("Your QB's rating is " + name.qbRating());
		
	}

}
