import java.util.*;

public class _05_CountAllWords {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a text: ");
	String inputedText = scanner.nextLine();
	String[] text = inputedText.split("(\\W|\\d|\\.|\\s)+");
	System.out.printf("The text contains %d words.",text.length);
    }
}