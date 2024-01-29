import java.util.Scanner;

public class Main {

/*
 Write code to process the following situations, using ternary operators:
1. A method returns true if the user logged in successfully, and returns false otherwise.
2. A boolean variable is set to “admin” if their username is an administrator username, and is set to “employee” otherwise.
3. If the user tries to look at the company’s profit for the year, and they are an employee, give them an error message. If they are an administrator, display the company’s profit for the year.
 */
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("your password is top secret and definitely not JJJ, so please type your password in that's totally not JJJ");
		String pass = scan.nextLine();
        boolean loggedIn = false;
        System.out.println(pass.equals("JJJ") ? loggedIn = true : "hehe... youre never getting logged in");
        if(loggedIn){
            System.out.println("all signed in welcome");
            System.out.println("whats your name? (if you were an admin you'd be named Joe)");
            boolean isAdmin = false;
            String name = scan.nextLine();
            System.out.println(name.equals("Joe") ? (isAdmin = true) : (isAdmin = false));

            System.out.println("you are now attempting to check the company's profits!!!");
            System.out.println(isAdmin ? "we made a billion dollars" : "ERROR! YOU'RE NOT ALLOWED HERE!");
        }

	}
}