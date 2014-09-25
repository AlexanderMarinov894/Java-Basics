import java.util.*;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter \"a\": ");
		int side1 = Integer.parseInt(input.next());
		System.out.print("Enter \"b\": ");
		int side2 = Integer.parseInt(input.nextLine());
		System.out.printf("The area of the rectangle is %d", side1*side2);
	}
}