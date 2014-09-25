import java.util.Scanner;
import java.util.Arrays;

public class SortArrayOfStrings {
	public static void main(String[] args) {
		System.out.print("Enter the number of inputs: ");
		Scanner in = new Scanner(System.in);
		int index = in.nextInt();
		String[] inputs = new String[index];
		
		index = 0;
		System.out.println();
		for (index = 0; index < inputs.length; index++) {
			System.out.print("Enter a text: ");
			inputs[index] = in.next();
		}
		
		Arrays.sort(inputs);
		System.out.print("\nThe inputs in alphabetical order are: ");
		for (index = 0; index < inputs.length; index++) {
			if (index != inputs.length-1) {
				System.out.print(inputs[index] + ", ");
			}
			else {
				System.out.print(inputs[index]);
			}
		}
		
		in.close();
	}
}