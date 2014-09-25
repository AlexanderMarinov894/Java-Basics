import java.math.BigInteger;
import java.util.Scanner;

public class CountOfBitsOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int number = Integer.parseInt(input.nextLine());
		String binary = Integer.toString(number, 2);
		int countOfOnes = binary.length() - binary.replace("1", "").length();
		System.out.printf("There are %d bits 1 in %016d.", countOfOnes, new BigInteger(binary));
	}
}