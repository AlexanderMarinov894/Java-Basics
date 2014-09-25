import java.util.*;

public class _10_ExtractAllUniqueWords {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String inputedText = input.nextLine();
		inputedText = inputedText.toLowerCase();
		String[] text = inputedText.split("[^a-zA-Z]+");
		TreeSet<String> words = new TreeSet<>();
		
		for (String word : text) {
			words.add(word);
		}
		
		System.out.print("The unique words are: ");
		for (String word : words) {
			System.out.printf("%s ", word);
		}
	}
}