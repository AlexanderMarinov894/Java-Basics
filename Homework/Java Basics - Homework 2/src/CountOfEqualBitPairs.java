import java.util.*;

public class CountOfEqualBitPairs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = Integer.parseInt(input.nextLine());
		if (number >= 0) {
			String binary = Integer.toString(number, 2);			
			int pairsCounter = 0;
			
			for (int index = 0; index < binary.length(); index++) {
				if (index == binary.length()-1) {
					break;
				} else if (binary.charAt(index) == '1') {
					if (binary.charAt(index+1) == '1') {
						pairsCounter++;
					}
				}
			}
			
			for (int index = 0; index < binary.length(); index++) {
				if (index == binary.length()-1) {
					break;
				} else if (binary.charAt(index) == '0') {
					if (binary.charAt(index+1) == '0') {
						pairsCounter++;
					}
				}
			}
			System.out.printf("There are %d pairs in %s.", pairsCounter, binary);
		} else {
			System.out.println("Enter a positive integer!");
		}
		
	}
}