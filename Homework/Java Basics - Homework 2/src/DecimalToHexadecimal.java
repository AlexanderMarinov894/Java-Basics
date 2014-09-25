import java.util.*;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = Integer.parseInt(input.nextLine());
		System.out.printf("The hexadecimal representation %d is %S.", number, 
						  Integer.toString(number, 16));
	}
}