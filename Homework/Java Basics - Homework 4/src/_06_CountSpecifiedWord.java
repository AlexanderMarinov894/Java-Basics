import java.util.*;

public class _06_CountSpecifiedWord {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = input.nextLine();
		text = text.toLowerCase();
		String[] words = text.split("(\\W|\\s|\\d|\\.)+");
		System.out.print("Enter a word: ");
		String word = input.next();
		input.nextLine();
		word = word.toLowerCase();
		int count = 0;
		
		for (String element : words) {
			if (element.equals(word)) {
				count++;
			}
		}
		
		System.out.printf("The word \"%s\" appears %d times in the text.", word, count);
	}
}