import java.util.*;

public class _03_LargestSequenceOfEqualStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter words on one line, separated by spaces: ");
		String words = input.nextLine();
		String[] separateWords = words.split("\\s");
		Arrays.sort(separateWords);	
		int count = 1;
		int counted = 0;
		String print = separateWords[0];
		String finalPrint = print;
		
		System.out.print("The largest sequence of equal elements is: ");
		if (separateWords.length > 1) {
			for (int index = 1; index < separateWords.length; index++) {
				if (separateWords[index].equals(separateWords[index-1])) {
					print += " "+ separateWords[index];
					count++;
					if (count > counted) {
					finalPrint = print;
					}
				} else {
					print = separateWords[index];
					counted = count;
					count = 1;
				}
			}
			System.out.println(finalPrint);
		} else {
			System.out.println(finalPrint);
		}
	}
}