import java.util.*;

public class _1_SymmetricNumbersInRange {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers, spearated by space(0-999): ");
		int num1 = Integer.parseInt(input.next());
		int num2 = Integer.parseInt(input.next());
		input.nextLine();
		symmetricNumbers(num1, num2);
	}
	
	public static void symmetricNumbers(int num1, int num2){
		if (num1 >= 0 && num2 <= 999) {
			System.out.printf("\nThe symmetric numbers from %d to %d are: ", num1, num2);
			for (int count = num1; count <= num2; count++) {
				if ((count%10 == count/100 && count !=10) || 
					(count >= 0 && count <= 9 || count == 11)) {
					System.out.printf("%d ", count);
				}
			}
		}
	}
}