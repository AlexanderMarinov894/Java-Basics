import java.util.*;

public class _02_SequencesOfEqualStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter words on one line, separated by spaces: ");
		String words = input.nextLine();
		String[] separateWords = words.split("\\s");
		Arrays.sort(separateWords);	
		
		System.out.println("\nThe words in order are: ");
		System.out.printf("%s ", separateWords[0]);
		if (separateWords.length > 1) {
			for (int index = 1; index < separateWords.length; index++) {
				if (separateWords[index].equals(separateWords[index-1])) {
					System.out.printf("%s ", separateWords[index]);
				} else {
					System.out.printf("\n%s ", separateWords[index]);
				}
			}
		}
	}
}