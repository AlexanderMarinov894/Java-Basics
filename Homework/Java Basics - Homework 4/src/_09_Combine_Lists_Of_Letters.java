import java.util.*;

public class _09_Combine_Lists_Of_Letters {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first set of letters(on one line, separated by space): ");
		String line1 = input.nextLine();
		System.out.print("Enter the second set of letters(on one line, separated by space): ");
		String line2 = input.nextLine();
		String[] l1 = line1.split(" ");
		String[] l2 = line2.split(" ");
		ArrayList<String> letters1 = new ArrayList<>();
		ArrayList<String> letters2 = new ArrayList<>();
		ArrayList<String> nonRepLetters = new ArrayList<>();
		
		for (String letter : l1) {
			if (!letter.equals(" ")) {
				letters1.add(letter);
			}
		}
		
		for (String letter : l2) {
			if (!letter.equals(" ")) {
				letters2.add(letter);
			}
		}
		
		boolean isInTheList = false;
		
		for (int index = 0; index < letters2.size(); index++) {
			for (String letter : letters1) {
				isInTheList = letter.equals(letters2.get(index));
				
				if (isInTheList == true) {
					break;
				}
			}
			
			if (isInTheList == false) {
				nonRepLetters.add(letters2.get(index));
			}			
			
			isInTheList = false;			
		}
		
		for (String letter : nonRepLetters) {
			letters1.add(letter);
		}
		
		System.out.print("\nThe new set of letters is: ");
		for (String letter : letters1) {
			System.out.printf("%s ", letter);
		}
	}
}