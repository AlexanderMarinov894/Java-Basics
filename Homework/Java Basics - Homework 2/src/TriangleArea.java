import java.util.*;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int area = 0;
		System.out.print("Enter Ax and Ay (separated by space): ");
		int ax = Integer.parseInt(input.next());
		int ay = Integer.parseInt(input.next());
		input.nextLine();
		System.out.print("Enter Bx and By (separated by space): ");
		int bx = Integer.parseInt(input.next());
		int by = Integer.parseInt(input.next());
		input.nextLine();
		System.out.print("Enter Cx and Cy (separated by space): ");
		int cx = Integer.parseInt(input.next());
		int cy = Integer.parseInt(input.next());
		input.nextLine();
		if (calculateArea(area, ax, ay, bx, by, cx, cy) > 0) {
			System.out.printf("The area is %d.", calculateArea(area, ax, ay, bx, by, cx, cy));
		} else {
			System.out.printf("The area is %d (the three points do not form a triangle).", 
							  calculateArea(area, ax, ay, bx, by, cx, cy));
		}
	}
	
	public static int calculateArea(int area, int ax, int ay, int bx, int by, int cx, int cy) {
		area = ((ax*(by-cy)) + (bx*(cy-ay)) + (cx*(ay-by)))/2;
		if (area < 0) {
			area *= -1;
		}
		return area;
	}
}