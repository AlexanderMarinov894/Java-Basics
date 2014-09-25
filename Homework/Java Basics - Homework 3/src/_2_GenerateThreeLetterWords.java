import java.util.*;

public class _2_GenerateThreeLetterWords {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a set of characters: ");
		String set = input.nextLine();
		String[] letters = set.split("");
		System.out.print("All possible 3-letter combinations are: ");
		combinations(letters);
	}
	
	public static void combinations(String[] letters){
		for (int index1 = 0; index1 < letters.length; index1++) {
			for (int index2 = 0; index2 < letters.length; index2++) {
				for (int index3 = 0; index3 < letters.length; index3++) {
					System.out.print(letters[index1] + letters[index2] + letters[index3] + " ");
				}
			}
		}
	}
}