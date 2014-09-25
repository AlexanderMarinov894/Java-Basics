import java.util.*;

public class _04_LongestIncreasingSequence {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sequence of numbers on one line, spearated by space: ");
		String inputs = input.nextLine();
		String[] separatedInputs = inputs.split(" ");
		int[] numbers = new int[separatedInputs.length];
		int index = 0;
		
		for (String element : separatedInputs) {
			numbers[index] = Integer.parseInt(element);
			index++;
		}
		
		String longestSeq = Integer.toString(numbers[0]) + " ";
		String longestSeqFinal = longestSeq;
		int count = 1;
		int countedMax = 0;
		
		System.out.println("\nAll the increasing sequences are: ");
		System.out.printf("[%d]", numbers[0]);
		if (numbers.length > 1) {
			for (index = 1; index < numbers.length; index++) {
				if (numbers[index] > numbers[index-1]) {
					System.out.printf("[%d]", numbers[index]);
					count++;
					longestSeq += Integer.toString(numbers[index]) + " ";
				}
				else {
					if (count > countedMax) {
						longestSeqFinal = longestSeq;
						countedMax = count;
					}
					System.out.printf("\n[%d]", numbers[index]);
					count = 1;
					longestSeq = Integer.toString(numbers[index]) + " ";
				}
				
				if (count > countedMax) {
					longestSeqFinal = longestSeq;
				}
			}
		}
		System.out.printf("\nThe longest sequence is: %s", longestSeqFinal);
	}
}