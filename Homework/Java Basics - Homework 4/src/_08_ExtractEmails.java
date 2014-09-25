import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class _08_ExtractEmails {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = input.nextLine();
	    Matcher email = 
	    	Pattern.compile("[0-9a-zA-Z._-]+[09a-zA-Z]+[@]+[a-zA-Z]+[a-zA-Z.-]+[.]+[a-zA-Z]+").matcher(text);
	    String print = "";
	    
		while (email.find()) {
			print += email.group() + "\n";
		}
		
		if (!print.equals("")) {
			System.out.printf("\nThe e-mails in the text are:\n%s",print);
		} else {
			System.out.println("No e-mails.");
		}
	}
}