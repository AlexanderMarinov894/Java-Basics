import java.util.*;

public class PointsInsideAFigure {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the fisrt and the second points(separated by space): ");
		double point1 = Double.parseDouble(input.next());
		double point2 = Double.parseDouble(input.next());
		input.nextLine();
		boolean isInside = (figure1(point1, point2) || figure2(point1, point2) || figure3(point1, point2));
		if (isInside == true) {
			System.out.println("The point is inside the figure.");
		} else {
			System.out.println("The point is outside the figure.");
		} 
	}
	
	public static boolean figure1(double x, double y) {
		boolean isInside;
		if ((x>=12.5 && x<=17.5) && (y>=8.5 && y<=13.5)) {
			isInside = true;	
		} else {
			isInside = false;
		}
		return isInside;
	}
	
	public static boolean figure2(double x, double y){
		boolean isInside;
		if ((x>=20 && x<=22.5) && (y>=8.5 && y<=13.5)) {
			isInside = true;	
		} else {
			isInside = false;
		}
		return isInside;
	}
	
	public static boolean figure3(double x, double y){
		boolean isInside;
		if ((x>=12.5 && x<=22.5) && (y>=6 && y<=8.5)) {
			isInside = true;	
		} else {
			isInside = false;
		}
		return isInside;
	}
}