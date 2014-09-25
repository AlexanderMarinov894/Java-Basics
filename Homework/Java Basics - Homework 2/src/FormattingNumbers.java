import java.math.BigInteger;
import java.util.*;

public class FormattingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an int number: ");
		int decimalNumber = Integer.parseInt(input.nextLine());
		System.out.print("Enter a float number: ");
		double floatingNumber1 = Double.parseDouble(input.nextLine());
		System.out.print("Enter a float number: ");
		double floatingNumber2 = Double.parseDouble(input.nextLine());
		System.out.printf("\n|%-10S|%010d|%10.2f|%-10.3f|", Integer.toString(decimalNumber, 16), 
										          new BigInteger(Integer.toBinaryString(decimalNumber)), 
										          floatingNumber1, floatingNumber2);
	}
}