import java.util.*;

public class TheSmallestOfThreeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = Double.parseDouble(input.nextLine());
		System.out.print("Enter the second number: ");
		double num2 = Double.parseDouble(input.nextLine());
		System.out.print("Enter the third number: ");
		double num3 = Double.parseDouble(input.nextLine());
		smallestNumber(num1, num2, num3);
	}
	
	public static void smallestNumber(double num1, double num2, double num3){
		if (num1 <= num2 && num1 <= num3) {
			System.out.printf("The smallest number is " + num1);
		} else if (num2 <= num1 && num2<=num3) {
			System.out.printf("The smallest number is " + num2);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.printf("The smallest number is " + num3);
		}
	}
}