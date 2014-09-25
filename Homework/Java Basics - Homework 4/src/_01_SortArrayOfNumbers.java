import java.util.*;

public class _01_SortArrayOfNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of inputs: ");
		int numberOfInputs = Integer.parseInt(input.nextLine());
		int[] inputs = new int[numberOfInputs];
		
		System.out.printf("Enter %d numbers on one line (separated by space): ", numberOfInputs);
		for (int index = 0; index < numberOfInputs; index++) {
			try {
				inputs[index] = Integer.parseInt(input.next());
			} catch (Exception e) {
				System.err.println("Error: Enter only numbers!");
				inputs[index] = 0;
			}
		}
		
		Arrays.sort(inputs);
		System.out.print("Sorted numbers are: ");
		for (int number : inputs) {
			System.out.printf("%d ", number);
		}
	}
}