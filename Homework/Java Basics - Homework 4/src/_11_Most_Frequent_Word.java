import java.util.*;

public class _11_Most_Frequent_Word {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String inputedText = input.nextLine();
		inputedText = inputedText.toLowerCase();
		String[] text = inputedText.split("[^a-zA-Z]+");
		Arrays.sort(text);
		ArrayList<String> countedWords = new ArrayList<>();
		int count = 1;
		int maxCount = 0;
		
		for (int index = 1; index < text.length; index++) {
			if (text[index].equals(text[index-1])) {
				count++;
			} else {
				if (count > maxCount) {
					countedWords.clear();
					countedWords.add(text[index-1]);
					maxCount = count;
				} else if (count == maxCount) {
					countedWords.add(text[index-1]);
					maxCount = count;
				}
				count = 1;
			}
		}
		
		if (count > maxCount) {
			countedWords.clear();
			countedWords.add(text[text.length-1]);
			maxCount = count;
		} else if (count == maxCount) {
			countedWords.add(text[text.length-1]);
			maxCount = count;
		}
		
		System.out.println("\nThe most frequent words are:");
		for (String word : countedWords) {
			System.out.printf("%s -> %d times\n", word, maxCount);
		}
	}
}