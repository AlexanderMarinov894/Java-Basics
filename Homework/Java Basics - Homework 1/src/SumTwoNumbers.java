import java.util.Scanner;


public class SumTwoNumbers {
	public static void main(String[] args) {
		int num1;
		int num2;
		int sum;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1 = in.nextInt();
		System.out.print("Enter the second number: ");
		num2 = in.nextInt();
		in.close();
		sum = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
	}
}
